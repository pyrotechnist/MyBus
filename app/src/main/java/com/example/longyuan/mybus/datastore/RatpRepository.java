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
                .subscribe(data ->  loadSchedulesCallback.onSchedulesLoaded(data.getSchedulesResult()), throwable -> loadSchedulesCallback.onError(throwable.getLocalizedMessage()));

    }

    @Override
    public void loadMetros(LoadLinesCallback loadLinesCallback) {

        mRatpAPI.getMetros()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                // .map(data -> checkLatestPOstList(data))
                .subscribe(data ->  loadLinesCallback.onLinesLoaded(data.getResult()), throwable -> loadLinesCallback.onError(throwable.getLocalizedMessage()));
    }

    @Override
    public void loadBus(LoadLinesCallback loadLinesCallback) {

        mRatpAPI.getBus()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                // .map(data -> checkLatestPOstList(data))
                .subscribe(data ->  loadLinesCallback.onLinesLoaded(data.getResult()), throwable -> loadLinesCallback.onError(throwable.getLocalizedMessage()));
    }

    @Override
    public void loadTramways(LoadLinesCallback loadLinesCallback) {

        mRatpAPI.getTramways()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                // .map(data -> checkLatestPOstList(data))
                .subscribe(data ->  loadLinesCallback.onLinesLoaded(data.getResult()), throwable -> loadLinesCallback.onError(throwable.getLocalizedMessage()));
    }
}
