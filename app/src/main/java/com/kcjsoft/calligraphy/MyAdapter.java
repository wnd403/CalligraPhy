package com.kcjsoft.calligraphy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    Fragment[] fragments= new Fragment[4];


    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm);

        //Fragment객체 생성
        fragments[0]=new HomeFragment();
        fragments[1]=new CommunityFragment();
        fragments[2]=new OnedayclassFragment();
        fragments[3]=new BusinessFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
