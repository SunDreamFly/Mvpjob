package com.example.mvpjob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.mvpjob.adapter.HomeAdapter;
import com.example.mvpjob.base.BaseActivity;
import com.example.mvpjob.bean.HomeBean;
import com.example.mvpjob.contract.MainContract;
import com.example.mvpjob.presenter.ImpHomePresenter;
import com.example.mvpjob.utils.net.URLConstant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ImpHomePresenter> implements MainContract.HomeView<HomeBean> {


    private RecyclerView rv;
    private ArrayList<HomeBean.NewsDTO> list;
    private HomeAdapter homeAdapter;

    @Override
    protected void initData() {
        presenter.getData(URLConstant.HOMELIST);
    }

    @Override
    protected void initView() {
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        homeAdapter = new HomeAdapter(list, this);
        rv.setAdapter(homeAdapter);
    }

    @Override
    protected ImpHomePresenter getPresenter() {
        return new ImpHomePresenter(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }


    @Override
    public void onSuccess(HomeBean homeBean) {
        List<HomeBean.NewsDTO> data = homeBean.getNews();
        list.addAll(data);
        homeAdapter.notifyDataSetChanged();
    }

    @Override
    public void onFail(String error) {
        Log.e("TAG", "onFail: "+error );
    }
}
