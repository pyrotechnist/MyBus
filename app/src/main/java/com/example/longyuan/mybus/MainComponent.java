package com.example.longyuan.mybus;


import com.example.longyuan.mybus.utils.FragmentScoped;

import dagger.Component;

/**
 * Created by LONGYUAN on 2018/2/7.
 */


@FragmentScoped
@Component(dependencies = AppComponent.class, modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity activity);

}
