package com.example.mvpjob.presenter;

import com.example.mvpjob.base.BasePresenter;
import com.example.mvpjob.bean.HomeBean;
import com.example.mvpjob.contract.MainContract;
import com.example.mvpjob.model.ImpModel;
import com.example.mvpjob.utils.net.HomeCallBack;

public class ImpHomePresenter extends BasePresenter<MainContract.HomeModel<HomeBean> ,MainContract.HomeView> implements  MainContract.HomePresenter {

    public ImpHomePresenter(MainContract.HomeView view) {
        super(view);
    }

    @Override
    protected MainContract.HomeModel<HomeBean> getModel() {
        return new ImpModel<HomeBean>();
    }

    @Override
    public void getData(String url) {
        model.getData(url, new HomeCallBack<HomeBean>() {
            @Override
            public void onSuccess(HomeBean homeBean) {
                view.onSuccess(homeBean);
            }

            @Override
            public void onFail(String error) {
                view.onFail(error);
            }
        });
    }
}
