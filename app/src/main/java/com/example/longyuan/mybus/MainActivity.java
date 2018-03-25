package com.example.longyuan.mybus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    protected MainContract.Presenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.frag_main);

        if(mainFragment == null)
        {
            mainFragment = MainFragment.getInstance();

            getSupportFragmentManager().beginTransaction().add(R.id.frag_main,mainFragment).commit();
        }

        DaggerMainComponent.builder()
                .appComponent(((App)getApplication()).getAppComponent())
                .mainModule(new MainModule(mainFragment))
                .build()
                .inject(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
