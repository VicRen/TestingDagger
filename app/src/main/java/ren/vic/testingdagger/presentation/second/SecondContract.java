package ren.vic.testingdagger.presentation.second;

import ren.vic.testingdagger.presentation.common.BasePresenter;
import ren.vic.testingdagger.presentation.common.BaseView;

public class SecondContract {

    public interface View extends BaseView {

        void onPrint(String text);
    }

    public interface Presenter extends BasePresenter<View> {

        void printPresenter();
    }
}
