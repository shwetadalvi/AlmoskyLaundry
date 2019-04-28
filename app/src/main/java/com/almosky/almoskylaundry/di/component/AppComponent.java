package com.almosky.almoskylaundry.di.component;

import android.content.Context;


import com.almosky.almoskylaundry.di.module.ApplicationModule;
import com.almosky.almoskylaundry.utils.AppPrefes;
import com.almosky.almoskylaundry.utils.UtilsPref;
import com.almosky.almoskylaundry.utils.api.ApiCalls;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {ApplicationModule.class})
public interface AppComponent {
    Context appContext();

    UtilsPref appUtilsPref();

    AppPrefes appAppPrefes();

    ApiCalls appApiCalls();
}
