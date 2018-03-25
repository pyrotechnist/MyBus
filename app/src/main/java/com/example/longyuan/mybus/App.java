package com.example.longyuan.mybus;

import android.app.Application;

import com.example.longyuan.mybus.datastore.RepositoryModule;
import com.example.longyuan.mybus.network.injection.NetworkModule;
import com.example.longyuan.mybus.utils.Constant;


/**
 * Created by LONGYUAN on 2018/2/7.
 */

public class App extends Application {

    private static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .networkModule(new NetworkModule(Constant.ROOT_URL))
                //.repositoryModule(new RepositoryModule())
                .build();

    }

    public static AppComponent getAppComponent() {

        return  mAppComponent;
    }
}
