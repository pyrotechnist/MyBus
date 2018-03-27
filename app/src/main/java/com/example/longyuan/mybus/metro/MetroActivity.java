package com.example.longyuan.mybus.metro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.longyuan.mybus.App;
import com.example.longyuan.mybus.R;

import javax.inject.Inject;

public class MetroActivity extends AppCompatActivity {

    @Inject
    protected MetroContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MetroFragment metroFragment = (MetroFragment) getSupportFragmentManager().findFragmentById(R.id.metro_fragment);

        if(metroFragment == null)
        {
            metroFragment = MetroFragment.getInstance();

            getSupportFragmentManager().beginTransaction().add(R.id.frag_main,metroFragment).commit();
        }



        DaggerMetroComponent.builder()
                .appComponent(((App)getApplication()).getAppComponent())
                .metroModule(new MetroModule(metroFragment))
                .build()
                .inject(this);
    }

}
