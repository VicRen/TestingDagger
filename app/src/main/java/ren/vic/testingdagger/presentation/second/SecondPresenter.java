package ren.vic.testingdagger.presentation.second;

import javax.inject.Inject;

import ren.vic.testingdagger.data.UserRepository;

public class SecondPresenter implements SecondContract.Presenter {

    private final UserRepository userRepository;
    private SecondContract.View mView;

    @Inject
    SecondPresenter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void setView(SecondContract.View view) {
        mView = view;
    }

    @Override
    public void printPresenter() {
        mView.onPrint(this.toString() + "\n" + mView.toString() + "\n" + userRepository.toString());
    }
}
