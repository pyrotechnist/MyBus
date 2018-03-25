package com.example.longyuan.mybus.pojo.request;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public class SchedulesRequest {

    private String type;

    private String code;

    private String station;

    private String way;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    @Override
    public String toString() {
        return type + "/" +
                code + "/" +
                station +"/" +
                way   ;
    }
}
