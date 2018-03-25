package com.example.longyuan.mybus.datastore;

import com.example.longyuan.mybus.pojo.SchedulesItem;

import java.util.List;

/**
 * Created by LONGYUAN on 2018/2/10.
 */

public interface DataStore {

    interface LoadSchedulesCallback {

        void onSchedulesLoaded(List<SchedulesItem> schedulesItems);

         void onError(String error);

    }

    void loadSchedules(LoadSchedulesCallback loadSchedulesCallback,String path);

}
