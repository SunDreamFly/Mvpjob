package com.example.mvpjob.utils.net;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ServerApi {

    @GET
    Observable<RequestBody> get(@Url String url);

    @POST
    @FormUrlEncoded
    Observable<RequestBody> post(@Url String url);

    @POST
    @FormUrlEncoded
    Observable<RequestBody> post(@Url String url, @FieldMap HashMap<String, String> map);
}
