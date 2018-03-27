package com.example.longyuan.mybus.metro;


import com.example.longyuan.mybus.AppComponent;
import com.example.longyuan.mybus.MainActivity;
import com.example.longyuan.mybus.MainModule;
import com.example.longyuan.mybus.utils.FragmentScoped;

import dagger.Component;

/**
 * Created by LONGYUAN on 2018/2/7.
 */


@FragmentScoped
@Component(dependencies = AppComponent.class, modules = MetroModule.class)
public interface MetroComponent {

    void inject(MetroActivity activity);

}
