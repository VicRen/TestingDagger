package ren.vic.testingdagger.presentation.main;

import javax.inject.Inject;

public class MainPresenter implements MainContact.Presenter {

    private MainContact.View mView;

    @Inject
    MainPresenter() {
    }

    @Override
    public void setView(MainContact.View view) {
        mView = view;
    }

    @Override
    public void printPresenter() {
        mView.onPrint(this.toString());
    }
}
