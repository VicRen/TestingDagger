package ren.vic.testingdagger.presentation.common;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import ren.vic.testingdagger.presentation.navigation.Navigator;

public abstract class BaseActivity extends DaggerAppCompatActivity {

    protected final String TAG = this.getClass().getSimpleName();

    protected ActionBar mAppBar;

    @Inject
    protected Navigator mNavigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    protected void initialize() {
        setContentView(getLayoutId());
        initView();
        setupAppBar();
        initData();
    }

    protected void setupAppBar() {
        mAppBar = getSupportActionBar();
    }

    /**
     * 初始化控件
     */
    protected void initView() {
        ButterKnife.bind(this);
    }

    /**
     * 获得页面布局Id
     *
     * @return 布局Id
     */
    protected abstract int getLayoutId();

    /**
     * 初始化数据
     */
    protected abstract void initData();
}
