package ren.vic.testingdagger.presentation.common;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerFragment;
import ren.vic.testingdagger.presentation.navigation.Navigator;

public abstract class BaseFragment extends DaggerFragment {

    private final String TAG = this.getClass().getSimpleName();

    @Inject
    protected Navigator mNavigator;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(bindLayout(), container, false);
        initView(view);
        initData(savedInstanceState);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    protected void initView(View view) {
        ButterKnife.bind(this, view);
    }

    protected abstract int bindLayout();

    protected abstract void initData(Bundle savedInstanceState);
}
