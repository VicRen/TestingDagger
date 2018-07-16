package ren.vic.testingdagger.presentation.internal.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ren.vic.testingdagger.presentation.internal.di.scope.ActivityScoped;
import ren.vic.testingdagger.presentation.internal.di.scope.FragmentScoped;
import ren.vic.testingdagger.presentation.second.SecondContract;
import ren.vic.testingdagger.presentation.second.SecondFragment;
import ren.vic.testingdagger.presentation.second.SecondPresenter;

@Module
public abstract class SecondActivityModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract SecondFragment secondFragment();

    @ActivityScoped
    @Binds
    abstract SecondContract.Presenter secondPresenter(SecondPresenter secondPresenter);
}
