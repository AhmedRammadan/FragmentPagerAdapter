package com.example.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentAdapter extends FragmentPagerAdapter {
    public SimpleFragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int postion) {
       switch (postion){
           case 0:
               return new Activity1();
           case 1:
               return new Activity2();
           default:
               return new Activity3();
       }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Activity1";
            case 1:
                return "Activity2";
            default:
                return "Activity3";

        }
    }
}
