package com.example.longyuan.mybus.line;


import com.example.longyuan.mybus.AppComponent;
import com.example.longyuan.mybus.utils.FragmentScoped;

import dagger.Component;

/**
 * Created by LONGYUAN on 2018/2/7.
 */


@FragmentScoped
@Component(dependencies = AppComponent.class, modules = LineModule.class)
public interface LineComponent {

    void inject(LineActivity activity);

}
