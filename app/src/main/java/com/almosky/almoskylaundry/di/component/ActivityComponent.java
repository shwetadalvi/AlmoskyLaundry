package com.almosky.almoskylaundry.di.component;


import com.almosky.almoskylaundry.common.BaseActivity;
import com.almosky.almoskylaundry.di.scope.ActivityScope;
import com.almosky.almoskylaundry.utils.AppPrefes;
import com.almosky.almoskylaundry.utils.UtilsPref;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface ActivityComponent extends AppComponent {
    void inject(BaseActivity baseActivity);

    void inject(UtilsPref utilsPref);

    void inject(AppPrefes appPrefes);
}