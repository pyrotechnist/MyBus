package com.example.longyuan.mybus;

import com.example.longyuan.mybus.pojo.schedule.SchedulesResult;
import com.example.longyuan.mybus.pojo.request.SchedulesRequest;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public interface MainContract {

    interface View{

        void setPresenter(Presenter presenter);


        void updateData(SchedulesResult schedulesResult);

        void errorToast(String error);

    }

    interface Presenter{

        void start(SchedulesRequest schedulesRequest);

        void loadSchedules(SchedulesRequest schedulesRequest);

    }
}
