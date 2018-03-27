package com.example.longyuan.mybus.datastore;

import com.example.longyuan.mybus.pojo.schedule.Result;

/**
 * Created by LONGYUAN on 2018/2/10.
 */

public interface DataStore {

    interface LoadSchedulesCallback {

        void onSchedulesLoaded(Result result);

         void onError(String error);

    }

    interface LoadMetrosCallback {

        void onMetrosLoaded(com.example.longyuan.mybus.pojo.metro.Result result);

        void onError(String error);

    }

    void loadSchedules(LoadSchedulesCallback loadSchedulesCallback,String path);


    void loadMetros(LoadMetrosCallback loadMetrosCallback);

}
