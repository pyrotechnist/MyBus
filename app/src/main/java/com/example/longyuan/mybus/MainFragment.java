package com.example.longyuan.mybus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.longyuan.mybus.metro.MetroActivity;
import com.example.longyuan.mybus.pojo.schedule.Result;
import com.example.longyuan.mybus.pojo.request.SchedulesRequest;

import butterknife.ButterKnife;

/**
 * Created by LONGYUAN on 2018/3/25.
 */

public class MainFragment extends Fragment implements MainContract.View{

    private MainContract.Presenter mPresenter;

    //@BindView(R.id.textview_hello)
    //TextView mTextView;


    //@BindView(R.id.textview_hello2)
    //TextView mTextView2;


    public static MainFragment getInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.frag_main, container, false);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),MetroActivity.class);

               // intent.putExtra(EXTRA_VIDEO_ID,item.getVideoId());

                getContext().startActivity(intent);
            }
        });

        //View view = inflater.inflate(R.layout.frag_main_grid, container, false);

        ButterKnife.bind(this, view);

        return view;
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
    public void updateData(Result result) {
        //mTextView.setText(result.getSchedules().get(0).getMessage());
        //mTextView2.setText(result.getSchedules().get(1).getMessage());
    }

    @Override
    public void errorToast(String error) {

    }
}
