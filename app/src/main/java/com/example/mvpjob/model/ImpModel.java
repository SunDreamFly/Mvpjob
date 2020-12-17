package com.example.mvpjob.model;

import com.example.mvpjob.contract.MainContract;
import com.example.mvpjob.utils.net.HomeCallBack;

public class ImpModel<T> implements MainContract.HomeModel<T> {
    @Override
    public void getData(String url, HomeCallBack callBack) {

    }
}
