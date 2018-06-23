package com.example.administrator.rxjavaokhttp.contract;

import com.example.administrator.rxjavaokhttp.entity.Entity;
import com.example.administrator.rxjavaokhttp.entity.User;

import rx.Observable;

/**
 * Created by Administrator on 2018/6/23/023.
 */

public interface EntityContract {
    interface Model {
        Observable<Entity> getEntityList();
        Observable<User> getUser();
    }

    interface View {
        void showData();
    }

    interface Presenter {
        void showList();
    }
}
