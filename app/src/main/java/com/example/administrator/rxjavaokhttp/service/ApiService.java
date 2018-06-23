package com.example.administrator.rxjavaokhttp.service;

import com.example.administrator.rxjavaokhttp.entity.Entity;
import com.example.administrator.rxjavaokhttp.entity.User;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Administrator on 2018/6/23/023.
 */

public interface ApiService {
    @GET("/Orders/getList")
    Observable<Entity> getListService();

    @GET("/curierbrother/public/index.php/link/Orders/getUser")
    Observable<User> getUser();
}
