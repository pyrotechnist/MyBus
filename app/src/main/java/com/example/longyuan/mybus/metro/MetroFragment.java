package com.example.longyuan.mybus.metro;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.longyuan.mybus.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MetroFragment extends Fragment implements MetroContract.View{


    private MetroContract.Presenter mPresenter;

    public MetroFragment() {
    }

    public static MetroFragment getInstance() {
        return new MetroFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_metro, container, false);
    }


    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setPresenter(MetroContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void errorToast(String error) {

    }
}
