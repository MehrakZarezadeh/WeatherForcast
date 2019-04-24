package com.mehrak.weatherforcast;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class IntroPagerAdapter extends FragmentPagerAdapter {

    public IntroPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new IntroPageOneFragment();
            case 1:
                return new IntroPageTwoFragment();

            default:
                return new IntroPageOneFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
