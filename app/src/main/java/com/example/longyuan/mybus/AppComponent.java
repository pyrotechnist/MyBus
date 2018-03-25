package com.example.longyuan.mybus;


import com.example.longyuan.mybus.datastore.RepositoryModule;
import com.example.longyuan.mybus.datastore.ScheduleRepository;
import com.example.longyuan.mybus.network.injection.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by LONGYUAN on 2018/2/7.
 */

@Singleton
@Component(modules = {NetworkModule.class, RepositoryModule.class})
public interface AppComponent {

    void inject(MainPresenter mainPresenter);

    void inject(ScheduleRepository scheduleRepository);

}