package ren.vic.testingdagger.presentation.second;

import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import ren.vic.testingdagger.R;
import ren.vic.testingdagger.presentation.common.BaseActivity;

public class SecondActivity extends BaseActivity implements SecondContract.View {

    @BindView(R.id.text)
    TextView textView;

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
        }
        presenter.setView(this);
        presenter.printPresenter();
    }

    @Override
    public void onPrint(String text) {
        textView.setText(text);
    }
}
