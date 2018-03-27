package com.example.longyuan.mybus.datastore;

import com.example.longyuan.mybus.App;
import com.example.longyuan.mybus.network.api.RatpAPI;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public class RatpRepository implements DataStore {

    @Inject
    RatpAPI mRatpAPI;

    public RatpRepository() {
        App.getAppComponent().inject(this);
    }

    @Override
    public void loadSchedules(LoadSchedulesCallback loadSchedulesCallback,String path) {

        mRatpAPI.getSchedules(path)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                // .map(data -> checkLatestPOstList(data))
                .subscribe(data ->  loadSchedulesCallback.onSchedulesLoaded(data.getResult()),throwable -> loadSchedulesCallback.onError(throwable.getLocalizedMessage()));

    }

    @Override
    public void loadMetros(LoadMetrosCallback loadMetrosCallback) {

        mRatpAPI.getMetros()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                // .map(data -> checkLatestPOstList(data))
                .subscribe(data ->  loadMetrosCallback.onMetrosLoaded(data.getResult()),throwable -> loadMetrosCallback.onError(throwable.getLocalizedMessage()));
    }
}
