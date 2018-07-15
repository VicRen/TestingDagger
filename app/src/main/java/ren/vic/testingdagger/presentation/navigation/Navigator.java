package ren.vic.testingdagger.presentation.navigation;

import android.content.Context;
import android.content.Intent;

import javax.inject.Inject;
import javax.inject.Singleton;

import ren.vic.testingdagger.presentation.second.SecondActivity;

@Singleton
public class Navigator {

    @Inject
    Navigator() {
    }

    public void navigateToSecond(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, SecondActivity.class);
            context.startActivity(intent);
        }
    }
}
