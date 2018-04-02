package com.example.longyuan.mybus.line;

import com.example.longyuan.mybus.pojo.line.LinesItem;

import java.util.List;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public interface LineContract {

    interface View{

        void setPresenter(Presenter presenter);

        void errorToast(String error);

        void updateData(List<LinesItem> linesItems);

    }

    interface Presenter{

        void start(int type);

        void loadMetros();


        void loadRers();

        void loadBus();

        void loadTramways();
    }
}
