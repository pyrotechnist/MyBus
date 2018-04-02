package com.example.longyuan.mybus.network.api;

import com.example.longyuan.mybus.pojo.line.LinesResponse;
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
    Observable<LinesResponse> getMetros();

    @GET("lines/bus")
    Observable<LinesResponse> getBus();

    @GET("lines/tramways")
    Observable<LinesResponse> getTramways();


    @GET("stations/{type}/{code}")
    Observable<LinesResponse> getStations(@Path("type") String type,@Path("code") String code);
}
