package com.example.longyuan.mybus.datastore;

import com.example.longyuan.mybus.pojo.line.LinesResult;
import com.example.longyuan.mybus.pojo.schedule.SchedulesResult;

/**
 * Created by LONGYUAN on 2018/2/10.
 */

public interface DataStore {

    interface LoadSchedulesCallback {

        void onSchedulesLoaded(SchedulesResult schedulesResult);

         void onError(String error);

    }

    interface LoadLinesCallback {

        void onLinesLoaded(LinesResult result);

        void onError(String error);

    }

    void loadSchedules(LoadSchedulesCallback loadSchedulesCallback,String path);


    void loadMetros(LoadLinesCallback loadLinesCallback);

    void loadBus(LoadLinesCallback loadLinesCallback);

    void loadTramways(LoadLinesCallback loadLinesCallback);

}
