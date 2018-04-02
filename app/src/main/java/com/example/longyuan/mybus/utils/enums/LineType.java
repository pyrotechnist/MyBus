package com.example.longyuan.mybus.utils.enums;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by LONGYUAN on 2018/4/1.
 */

public class LineType {

    public static final int BUS = 0;
    public static final int METRO = 1;
    public static final int TRAMWAY = 2;
    public static final int RER = 3;

    public LineType(@Type int type) {
        currentType = type;
    }

    @Type int currentType;

    @IntDef({BUS, METRO, TRAMWAY, RER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }


    public void setType(@Type int type) {
        this.currentType = type;
    }

    public int getType() {
        return currentType;
    }

}
