package com.example.administrator.rxjavaokhttp.model;

import com.example.administrator.rxjavaokhttp.contract.EntityContract;
import com.example.administrator.rxjavaokhttp.entity.Entity;
import com.example.administrator.rxjavaokhttp.entity.User;
import com.example.administrator.rxjavaokhttp.util.RetrofitUtil;

import rx.Observable;

/**
 * Created by Administrator on 2018/6/23/023.
 */

public class EntityModel implements EntityContract.Model {

    @Override
    public Observable<Entity> getEntityList() {
        return RetrofitUtil.
                getInstance().
                getServerices().
                getListService();
    }

    @Override
    public Observable<User> getUser() {
        return RetrofitUtil.
                getInstance().
                getServerices().
                getUser();
    }
}
