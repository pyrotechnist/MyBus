package com.example.longyuan.mybus.line;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.longyuan.mybus.App;
import com.example.longyuan.mybus.R;

import javax.inject.Inject;

public class LineActivity extends AppCompatActivity {


    public static final String EXTRA_LINE_TYPE= "TYPE";

    @Inject
    protected LineContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int lineType = getIntent().getIntExtra(EXTRA_LINE_TYPE,1);

        LineFragment lineFragment = (LineFragment) getSupportFragmentManager().findFragmentById(R.id.metro_fragment);

        if(lineFragment == null)
        {
            lineFragment = LineFragment.getInstance(lineType);

            getSupportFragmentManager().beginTransaction().add(R.id.metro_fragment, lineFragment).commit();
        }

        DaggerLineComponent.builder()
                .appComponent(((App)getApplication()).getAppComponent())
                .lineModule(new LineModule(lineFragment))
                .build()
                .inject(this);
    }

}
