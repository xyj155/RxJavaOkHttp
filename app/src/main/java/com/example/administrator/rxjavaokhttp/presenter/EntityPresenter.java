package com.example.administrator.rxjavaokhttp.presenter;

import android.util.Log;

import com.example.administrator.rxjavaokhttp.contract.EntityContract;
import com.example.administrator.rxjavaokhttp.entity.EntityData;
import com.example.administrator.rxjavaokhttp.entity.User;
import com.example.administrator.rxjavaokhttp.model.EntityModel;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/6/23/023.
 */

public class EntityPresenter implements EntityContract.Presenter {
    private static final String TAG = "EntityPresenter";

    private final EntityModel mModel = new EntityModel();

    private final EntityContract.View mView;

    public EntityPresenter(EntityContract.View mView) {
        this.mView = mView;
        Log.d(TAG, "EntityPresenter() called with: mView = [" + mView + "]");
    }

    @Override
    public void showList() {
        Observable.zip(mModel.getEntityList(), mModel.getUser(), EntityData::new)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();

    }


    public void getUser() {
        mModel.getUser()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onCompleted() {
                        Log.d(TAG, "onCompleted() called");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError() called with: e = [" + e + "]");
                    }

                    @Override
                    public void onNext(User user) {
                        Log.d(TAG, "onNext() called with: user = [" + user + "]");
                    }
                });

    }
}
