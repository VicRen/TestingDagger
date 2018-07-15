package ren.vic.testingdagger.presentation;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import ren.vic.testingdagger.presentation.internal.di.components.DaggerApplicationComponent;

public class TestingDaggerApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApplicationComponent.builder().application(this).build();
    }
}
