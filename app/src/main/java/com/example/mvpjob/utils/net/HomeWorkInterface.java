package com.example.mvpjob.utils.net;

import java.util.HashMap;

public interface HomeWorkInterface {
    public <B> void get(String url, HomeCallBack<B> callBack);

   /* public <B> void post(String url, HomeCallBack<B> callBack);

    public <B> void postPar(String url, HashMap<String,String> map, HomeCallBack<B> callBack);*/
}
