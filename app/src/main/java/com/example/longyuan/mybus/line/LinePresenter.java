package com.example.longyuan.mybus.line;

import com.example.longyuan.mybus.App;
import com.example.longyuan.mybus.datastore.DataStore;
import com.example.longyuan.mybus.datastore.RatpRepository;
import com.example.longyuan.mybus.pojo.line.LinesResult;

import javax.inject.Inject;

/**
 * Created by LONGYUAN on 2018/3/27.
 */

public class LinePresenter implements LineContract.Presenter {

    @Inject
    protected RatpRepository mRatpRepository;

    private LineContract.View mView;



    public LinePresenter(LineContract.View view) {

        mView = view;

        App.getAppComponent().inject(this);

        view.setPresenter(this);
    }

    @Override
    public void start(int type) {

        switch (type) {
            case 0:
                loadBus();
                break;
            case 1:
                loadMetros();
                break;
            case 2:
                loadTramways();
                break;
            case 3:
                loadRers();
                break;
            default:
                break;
        }

    }

    @Override
    public void loadMetros() {

        mRatpRepository.loadMetros(new DataStore.LoadLinesCallback() {
            @Override
            public void onLinesLoaded(LinesResult result) {

                //String test = result.getLines().get(0).getName();
               mView.updateData(result.getLines());
            }

            @Override
            public void onError(String error) {

            }
        });


    }

    @Override
    public void loadRers() {

        mRatpRepository.loadBus(new DataStore.LoadLinesCallback() {
            @Override
            public void onLinesLoaded(LinesResult result) {

                //String test = result.getLines().get(0).getName();
                mView.updateData(result.getLines());
            }

            @Override
            public void onError(String error) {

            }
        });


    }

    @Override
    public void loadBus() {

        mRatpRepository.loadBus(new DataStore.LoadLinesCallback() {
            @Override
            public void onLinesLoaded(LinesResult result) {

                //String test = result.getLines().get(0).getName();
                mView.updateData(result.getLines());
            }

            @Override
            public void onError(String error) {

            }
        });


    }

    @Override
    public void loadTramways() {

        mRatpRepository.loadTramways(new DataStore.LoadLinesCallback() {
            @Override
            public void onLinesLoaded(LinesResult result) {

                //String test = result.getLines().get(0).getName();
                mView.updateData(result.getLines());
            }

            @Override
            public void onError(String error) {

            }
        });


    }
}
