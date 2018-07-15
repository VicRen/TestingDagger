package ren.vic.testingdagger.presentation.internal.di.modules;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ren.vic.testingdagger.presentation.internal.di.scope.ActivityScoped;
import ren.vic.testingdagger.presentation.main.MainActivity;
import ren.vic.testingdagger.presentation.second.SecondActivity;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity secondActivity();
}
