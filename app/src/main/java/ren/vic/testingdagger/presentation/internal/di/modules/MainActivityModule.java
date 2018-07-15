package ren.vic.testingdagger.presentation.internal.di.modules;

import dagger.Binds;
import dagger.Module;
import ren.vic.testingdagger.presentation.internal.di.scope.ActivityScoped;
import ren.vic.testingdagger.presentation.main.MainContact;
import ren.vic.testingdagger.presentation.main.MainPresenter;

@Module
abstract class MainActivityModule {

    @ActivityScoped
    @Binds
    abstract MainContact.Presenter mainPresenter(MainPresenter mainPresenter);
}
