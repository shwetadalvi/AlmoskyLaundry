package com.almosky.almoskylaundry.di.module;


import com.almosky.almoskylaundry.common.BaseActivity;

import dagger.Module;

@Module
public class ActivityModule {
    private BaseActivity baseActivity;

    public ActivityModule(BaseActivity baseActivity) {
        this.baseActivity = baseActivity;
    }

}
