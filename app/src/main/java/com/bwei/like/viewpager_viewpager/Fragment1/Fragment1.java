package com.bwei.like.viewpager_viewpager.Fragment1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bwei.like.viewpager_viewpager.R;

import java.util.ArrayList;

/**
 * Created by LiKe on 2016/11/28.
 */
public class Fragment1 extends Fragment {

    private ViewPager inViewPager;
    private ArrayList<Integer> pic = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment1, null);
        inViewPager = (ViewPager) inflate.findViewById(R.id.innerViewPager);
        pic.add(R.drawable.feng1);
        pic.add(R.drawable.feng2);
        pic.add(R.drawable.feng3);
        //22222222222222
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        inViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = new ImageView(getActivity());
                imageView.setImageResource(pic.get(position));
                container.addView(imageView);
                //返回
                return imageView;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View) object);
            }
        });
    }
}

