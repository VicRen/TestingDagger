package ren.vic.testingdagger.presentation.internal.di.modules;

import dagger.Binds;
import dagger.Module;
import ren.vic.testingdagger.presentation.internal.di.scope.ActivityScoped;
import ren.vic.testingdagger.presentation.second.SecondContract;
import ren.vic.testingdagger.presentation.second.SecondPresenter;

@Module
public abstract class SecondActivityModule {

    @ActivityScoped
    @Binds
    abstract SecondContract.Presenter secondPresenter(SecondPresenter secondPresenter);
}
