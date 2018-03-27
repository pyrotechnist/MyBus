package com.example.longyuan.mybus.metro;

import com.example.longyuan.mybus.MainContract;
import com.example.longyuan.mybus.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by LONGYUAN on 2018/2/7.
 */

@Module
public class MetroModule {

    private final MetroContract.View mView;

    public MetroModule(MetroContract.View view) {
        mView = view;
    }

/*    @Provides
    MainContract.View provideUniversityContractView() {
        return mView;
    }*/

    @Provides
    MetroContract.Presenter provideMetroContractPresenter() {
        return new MetroPresenter(mView);
    }
}