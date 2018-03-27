package com.example.longyuan.mybus.network.api;

import com.example.longyuan.mybus.pojo.metro.MetroLinesResponse;
import com.example.longyuan.mybus.pojo.schedule.SchedulesResponse;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public interface RatpAPI {


    @GET("schedules/{path}")
    Observable<SchedulesResponse> getSchedules(@Path(value = "path", encoded = true) String path);

    @GET("lines/metros")
    Observable<MetroLinesResponse> getMetros();

}
