package com.example.longyuan.mybus.line;

import dagger.Module;
import dagger.Provides;

/**
 * Created by LONGYUAN on 2018/2/7.
 */

@Module
public class LineModule {

    private final LineContract.View mView;

    public LineModule(LineContract.View view) {
        mView = view;
    }

/*    @Provides
    MainContract.View provideUniversityContractView() {
        return mView;
    }*/

    @Provides
    LineContract.Presenter provideMetroContractPresenter() {
        return new LinePresenter(mView);
    }
}