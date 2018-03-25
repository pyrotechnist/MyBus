package com.example.longyuan.mybus;

import android.support.v4.app.Fragment;

import com.example.longyuan.mybus.pojo.request.SchedulesRequest;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public class MainFragment extends Fragment implements MainContract.View{

    private MainContract.Presenter mPresenter;


    public static MainFragment getInstance() {
        return new MainFragment();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start(new SchedulesRequest());
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

        mPresenter = presenter;

    }

    @Override
    public void errorToast(String error) {

    }
}
