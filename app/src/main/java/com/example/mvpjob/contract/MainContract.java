package com.example.mvpjob.contract;

import com.example.mvpjob.utils.net.HomeCallBack;

public class MainContract {
    public interface HomeModel<B> {
        void getData(String url, HomeCallBack<B> callBack);
    }

    public interface HomePresenter {
        void getData(String url);
    }

    public interface HomeView<T> {
        void onSuccess(T t);

        void onFail(String error);
    }
}
