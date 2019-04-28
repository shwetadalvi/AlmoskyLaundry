package com.almosky.almoskylaundry.di.module;

import android.content.Context;

import com.almosky.almoskylaundry.App;
import com.almosky.almoskylaundry.utils.AppPrefes;
import com.almosky.almoskylaundry.utils.UtilsPref;
import com.almosky.almoskylaundry.utils.api.ApiCalls;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;






@Module
public class ApplicationModule {

    private final App mApp;

    public ApplicationModule(App app) {
        mApp = app;
    }

    @Provides
    @Singleton
    public Context appContext() {
        return mApp;
    }

    @Provides
    @Singleton
    public UtilsPref appUtilsPref() {
        return new UtilsPref(mApp.getActivityComponent());
    }

    @Provides
    @Singleton
    public AppPrefes appAppPrefes() {
        return new AppPrefes(appContext().getApplicationContext());
    }

    @Provides
    @Singleton
    public ApiCalls appApiCalls() {
        return new ApiCalls();
    }
}
