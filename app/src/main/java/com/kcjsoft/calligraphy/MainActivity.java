package com.kcjsoft.calligraphy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    MyAdapter myAdapter;

    ViewPager viewPager;
    Toolbar toolbar;

    DrawerLayout drawerLayout;

    TabLayout mtabLayout;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=getApplicationContext();



        //뷰페이저
        viewPager=findViewById(R.id.pager);
        myAdapter=new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);

        mtabLayout=findViewById(R.id.layout_tab);
        mtabLayout.setupWithViewPager(viewPager);

        mtabLayout.getTabAt(0).setIcon(R.drawable.ic_brush_black_24dp);
        mtabLayout.getTabAt(1).setIcon(R.drawable.ic_forum_black_24dp);
        mtabLayout.getTabAt(2).setIcon(R.drawable.ic_school_black_24dp);
        mtabLayout.getTabAt(3).setIcon(R.drawable.ic_attach_money_black_24dp);



    }
}
