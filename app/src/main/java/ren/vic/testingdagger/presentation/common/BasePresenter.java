package ren.vic.testingdagger.presentation.common;

public interface BasePresenter<T extends BaseView> {

    void setView(T view);
}
