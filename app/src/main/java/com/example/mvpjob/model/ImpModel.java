package com.example.mvpjob.model;

import com.example.mvpjob.contract.MainContract;
import com.example.mvpjob.utils.net.HomeCallBack;
import com.example.mvpjob.utils.net.RetrofitUtils;

public class ImpModel<T> implements MainContract.HomeModel<T> {
    @Override
    public void getData(String url, HomeCallBack callBack) {
        RetrofitUtils instance = RetrofitUtils.getInstance();
        instance.get(url,callBack);
    }
}
