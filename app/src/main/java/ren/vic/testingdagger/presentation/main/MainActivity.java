package ren.vic.testingdagger.presentation.main;

import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import ren.vic.testingdagger.R;
import ren.vic.testingdagger.presentation.common.BaseActivity;

public class MainActivity extends BaseActivity implements MainContact.View {

    @BindView(R.id.text)
    TextView textView;

    @Inject
    MainContact.Presenter mainPresenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        if (mAppBar != null) {
            mAppBar.setTitle("MainActivity");
        }
        mainPresenter.setView(this);
        mainPresenter.printPresenter();
    }

    @Override
    public void onPrint(String text) {
        textView.setText(text);
    }

    @OnClick(R.id.button)
    public void onNext() {
        mNavigator.navigateToSecond(this);
    }
}
