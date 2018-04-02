package com.example.longyuan.mybus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.longyuan.mybus.line.LineActivity;
import com.example.longyuan.mybus.pojo.schedule.SchedulesResult;
import com.example.longyuan.mybus.pojo.request.SchedulesRequest;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.longyuan.mybus.line.LineActivity.EXTRA_LINE_TYPE;
import static com.example.longyuan.mybus.utils.enums.LineType.BUS;
import static com.example.longyuan.mybus.utils.enums.LineType.METRO;
import static com.example.longyuan.mybus.utils.enums.LineType.RER;
import static com.example.longyuan.mybus.utils.enums.LineType.TRAMWAY;

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
                //Intent intent = new Intent(getContext(),LineActivity.class);

               // intent.putExtra(EXTRA_VIDEO_ID,item.getVideoId());

               // getContext().startActivity(intent);

                Toast.makeText(getContext(),"view",Toast.LENGTH_LONG).show();
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
    public void updateData(SchedulesResult schedulesResult) {
        //mTextView.setText(schedulesResult.getSchedules().get(0).getMessage());
        //mTextView2.setText(schedulesResult.getSchedules().get(1).getMessage());
    }

    @Override
    public void errorToast(String error) {

    }

    @OnClick(R.id.imageView_tramway)
    public void getTramway(View view) {
        // TODO submit data to server...
        //Toast.makeText(getContext(),"tramway",Toast.LENGTH_LONG).show();

       displayLines(TRAMWAY);

    }

    @OnClick(R.id.imageView_bus)
    public void getBus(View view) {
        // TODO submit data to server...
        //Toast.makeText(getContext(),"tramway",Toast.LENGTH_LONG).show();

        displayLines(BUS);

    }

    @OnClick(R.id.imageView_metro)
    public void getMetro(View view) {
        // TODO submit data to server...
        //Toast.makeText(getContext(),"tramway",Toast.LENGTH_LONG).show();

        displayLines(METRO);

    }

    @OnClick(R.id.imageView_rer)
    public void getRer(View view) {
        // TODO submit data to server...
        //Toast.makeText(getContext(),"tramway",Toast.LENGTH_LONG).show();

        displayLines(RER);

    }

    private void displayLines(int lineType){

        Intent intent = new Intent(getContext(),LineActivity.class);

        intent.putExtra(EXTRA_LINE_TYPE,lineType);

        getContext().startActivity(intent);
    }
}
