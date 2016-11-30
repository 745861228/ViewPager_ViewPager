package com.bwei.like.viewpager_viewpager.Fragment1;

import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by LiKe on 2016/11/28.
 */
public class InViewPager extends ViewPager {
    public InViewPager(Context context) {
        super(context);
    }

    public InViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
       public boolean onTouchEvent(MotionEvent ev) {
        if (this.getChildCount()>=1){
            return super.onTouchEvent(ev);
        }
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:

            case MotionEvent.ACTION_MOVE:
                getParent().requestDisallowInterceptTouchEvent(true);
                break;

            case MotionEvent.ACTION_UP:
                getParent().requestDisallowInterceptTouchEvent(false);
                break;

            case MotionEvent.ACTION_CANCEL:
                getParent().requestDisallowInterceptTouchEvent(false);
                break;
        }
        return super.onTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }
}
