package com.example.longyuan.mybus;

import com.example.longyuan.mybus.datastore.DataStore;
import com.example.longyuan.mybus.datastore.ScheduleRepository;
import com.example.longyuan.mybus.pojo.SchedulesItem;
import com.example.longyuan.mybus.pojo.request.SchedulesRequest;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public class MainPresenter implements MainContract.Presenter{


    private final static String TAG = MainPresenter.class.getSimpleName();

    private MainContract.View mView;

    @Inject
    protected ScheduleRepository mScheduleRepository;


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

        mScheduleRepository.loadSchedules(new DataStore.LoadSchedulesCallback() {
            @Override
            public void onSchedulesLoaded(List<SchedulesItem> schedulesItems) {

                String test = schedulesItems.get(0).getMessage();
            }

            @Override
            public void onError(String error) {

            }
        },schedulesRequest.toString());
    }
}
