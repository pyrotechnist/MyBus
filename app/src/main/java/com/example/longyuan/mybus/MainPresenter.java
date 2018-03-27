package com.example.longyuan.mybus;

import com.example.longyuan.mybus.datastore.DataStore;
import com.example.longyuan.mybus.datastore.RatpRepository;
import com.example.longyuan.mybus.pojo.schedule.Result;
import com.example.longyuan.mybus.pojo.request.SchedulesRequest;

import javax.inject.Inject;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public class MainPresenter implements MainContract.Presenter{


    private final static String TAG = MainPresenter.class.getSimpleName();

    private MainContract.View mView;

    @Inject
    protected RatpRepository mRatpRepository;


    public MainPresenter(MainContract.View view) {

        mView = view;

        App.getAppComponent().inject(this);

        view.setPresenter(this);
    }

    @Override
    public void start(SchedulesRequest schedulesRequest) {

        loadSchedules(schedulesRequest);

    }

    @Override
    public void loadSchedules(SchedulesRequest schedulesRequest) {

        schedulesRequest.setCode("123");

        schedulesRequest.setStation("Ile Saint-Germain");

        schedulesRequest.setWay("R");

        schedulesRequest.setType("bus");

        mRatpRepository.loadSchedules(new DataStore.LoadSchedulesCallback() {
            @Override
            public void onSchedulesLoaded(Result result) {

                mView.updateData(result);
            }

            @Override
            public void onError(String error) {

            }
        },schedulesRequest.toString());
    }
}
