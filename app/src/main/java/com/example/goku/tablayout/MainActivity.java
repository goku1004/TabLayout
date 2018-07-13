package com.example.goku.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        mViewPager=findViewById(R.id.viewpager);
        mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        mTabLayout=findViewById(R.id.tablayout);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}


