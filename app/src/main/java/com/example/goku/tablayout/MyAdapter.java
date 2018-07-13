package com.example.goku.tablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
    private String mListTab[]={"Fragment1","Fragment2","Fragmnet3"};
    private FirstFragment mFirstFragment=new FirstFragment();
    private SecondFragment mSecondFragment=new SecondFragment();
    private ThirdFragment mThirdFragment=new ThirdFragment();


    public MyAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int i) {
        Fragment faFragment=null;
       switch (i){
           case 0:
               faFragment=mFirstFragment;
               break;
           case 1:
               faFragment=mSecondFragment;
               break;
           case 2:
               faFragment=mThirdFragment;
               break;
       }
        return faFragment;
    }

    @Override
    public int getCount() {
        return mListTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mListTab[position];
    }
}


