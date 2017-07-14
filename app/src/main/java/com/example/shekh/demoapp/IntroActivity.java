package com.example.shekh.demoapp;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by shekh on 13-Jul-17.
 */

public class IntroActivity extends AppIntro {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

/*        addSlide(SampleSlide.newInstance(R.layout.slide_1));
        addSlide(SampleSlide.newInstance(R.layout.slide_2));
        addSlide(SampleSlide.newInstance(R.layout.slide_3));*/
        addSlide(AppIntroFragment.newInstance("Slide 1","This is slide no 1",R.mipmap.ic_launcher,getColor(R.color.colorAccent)));
        addSlide(AppIntroFragment.newInstance("Slide 2","This is slide no 2",R.mipmap.ic_launcher,getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Slide 3","This is slide no 3",R.mipmap.ic_launcher,getColor(R.color.colorAccent)));
        addSlide(AppIntroFragment.newInstance("Slide 4","This is slide no 4",R.mipmap.ic_launcher,getColor(R.color.colorPrimaryDark)));

        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        showSkipButton(true);
        setFadeAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }
}
