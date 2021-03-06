package com.lethalskillzz.baker.presentation.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lethalskillzz.baker.presentation.recipelist.RecipeListActivity;
import com.lethalskillzz.bakingapp.R;
import com.lethalskillzz.baker.presentation.base.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    @Inject
    SplashMvpPresenter<SplashMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(SplashActivity.this);
    }


    @Override
    public void openRecipeActivity() {
        startActivity(RecipeListActivity.getStartIntent(SplashActivity.this));
        finish();
    }


    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }
}
