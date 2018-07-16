package ren.vic.testingdagger.presentation.second;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import ren.vic.testingdagger.R;
import ren.vic.testingdagger.presentation.common.BaseFragment;

public class SecondFragment extends BaseFragment implements SecondContract.View {

    @BindView(R.id.text)
    TextView textView;

    @Inject
    SecondContract.Presenter presenter;

    @Inject
    public SecondFragment() {
    }

    @Override
    protected int bindLayout() {
        return R.layout.fragment_second;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        presenter.setView(this);
        presenter.printPresenter();
    }

    @Override
    public void onPrint(String text) {
        textView.setText(text);
    }
}
