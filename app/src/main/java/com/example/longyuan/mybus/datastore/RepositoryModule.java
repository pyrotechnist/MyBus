package com.example.longyuan.mybus.datastore;



import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by loxu on 07/08/2017.
 */

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    RatpRepository providesRatpRepository() {
        return new RatpRepository();
    }


}
