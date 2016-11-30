package com.bwei.like.viewpager_viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bwei.like.viewpager_viewpager.Fragment1.Fragment1;
import com.bwei.like.viewpager_viewpager.Fragment1.Fragment2;
import com.bwei.like.viewpager_viewpager.Fragment1.Fragment3;

public class MainActivity extends AppCompatActivity {

    private ViewPager outViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outViewPager = (ViewPager) findViewById(R.id.outterViewPager);

        outViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;
                switch (position){
                    case 0:
                        fragment = new Fragment1();
                        break;

                    case 1:
                        fragment = new Fragment2();
                        break;

                    case 2:
                        fragment = new Fragment3();
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
    }
}
