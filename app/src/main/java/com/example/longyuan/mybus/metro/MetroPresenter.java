package com.example.longyuan.mybus.metro;

import com.example.longyuan.mybus.App;
import com.example.longyuan.mybus.MainContract;
import com.example.longyuan.mybus.datastore.DataStore;
import com.example.longyuan.mybus.datastore.RatpRepository;
import com.example.longyuan.mybus.pojo.line.LinesResult;
import com.example.longyuan.mybus.pojo.request.SchedulesRequest;

import javax.inject.Inject;

/**
 * Created by LONGYUAN on 2018/3/27.
 */

public class MetroPresenter implements MetroContract.Presenter {

    @Inject
    protected RatpRepository mRatpRepository;

    private MetroContract.View mView;

    public MetroPresenter(MetroContract.View view) {

        mView = view;

        App.getAppComponent().inject(this);

        view.setPresenter(this);
    }

    @Override
    public void start() {

        loadMetros();

    }

    @Override
    public void loadMetros() {

        mRatpRepository.loadTramways(new DataStore.LoadMetrosCallback() {
            @Override
            public void onMetrosLoaded(LinesResult result) {
                String test = result.getLines().get(0).getName();
            }

            @Override
            public void onError(String error) {

            }
        });


    }
}
