package ren.vic.testingdagger.presentation.second;

import android.widget.FrameLayout;

import javax.inject.Inject;

import butterknife.BindView;
import dagger.Lazy;
import ren.vic.testingdagger.R;
import ren.vic.testingdagger.presentation.common.BaseActivity;
import ren.vic.testingdagger.presentation.utils.ActivityUtils;

public class SecondActivity extends BaseActivity {

    @BindView(R.id.container)
    FrameLayout container;

    @Inject
    Lazy<SecondFragment> secondFragmentProvider;

    @Inject
    SecondContract.Presenter presenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_second;
    }

    @Override
    protected void initData() {
        if (mAppBar != null) {
            mAppBar.setTitle("SecondActivity");
            mAppBar.setTitle(presenter.toString().substring(presenter.toString().length() - 8));
        }
        SecondFragment secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.container);
        if (secondFragment == null) {
            secondFragment = secondFragmentProvider.get();
        }
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), secondFragment, R.id.container);
    }
}
