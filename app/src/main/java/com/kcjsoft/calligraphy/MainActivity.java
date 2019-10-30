package com.kcjsoft.calligraphy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    MyAdapter myAdapter;

    ViewPager viewPager;
    Toolbar toolbar;

    DrawerLayout drawerLayout;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰페이저
        viewPager=findViewById(R.id.pager);
        myAdapter=new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);

        tabLayout=findViewById(R.id.layout_tab);
        tabLayout.setupWithViewPager(viewPager);

    }
}
