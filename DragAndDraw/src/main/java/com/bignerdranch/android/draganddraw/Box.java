package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by panda on 7/13/13.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = mCurrent = origin;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
