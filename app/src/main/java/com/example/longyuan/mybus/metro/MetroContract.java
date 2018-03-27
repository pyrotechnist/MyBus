package com.example.longyuan.mybus.metro;

import com.example.longyuan.mybus.pojo.request.SchedulesRequest;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public interface MetroContract {

    interface View{

        void setPresenter(Presenter presenter);

        void errorToast(String error);

    }

    interface Presenter{

        void start();

        void loadMetros();



    }
}
