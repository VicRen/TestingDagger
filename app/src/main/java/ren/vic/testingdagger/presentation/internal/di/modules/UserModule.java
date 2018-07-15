package ren.vic.testingdagger.presentation.internal.di.modules;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import ren.vic.testingdagger.data.UserDataRepository;
import ren.vic.testingdagger.data.UserRepository;

@Module
public abstract class UserModule {

    @Singleton
    @Binds
    abstract UserRepository provideUserRepository(UserDataRepository userRepository);
}
