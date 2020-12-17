package com.example.mvpjob.utils.net;

public interface HomeCallBack<B> {
    void onSuccess(B b);

    void onFail(String error);
}
