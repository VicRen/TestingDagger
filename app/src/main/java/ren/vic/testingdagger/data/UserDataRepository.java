package ren.vic.testingdagger.data;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserDataRepository implements UserRepository {

    @Inject
    UserDataRepository() {}
}
