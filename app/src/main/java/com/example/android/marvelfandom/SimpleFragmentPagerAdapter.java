package com.example.android.marvelfandom;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dell on 3/8/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
        private String tabTitles[] = new String[] { "Characters","Movies"};

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new characterFragment();
        else
            return new moviesFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}
