package com.shellcore.android.builderpattern.builder;

import android.view.ViewGroup;

import com.shellcore.android.builderpattern.R;

/**
 * Created by Shell on 28/11/2017.
 */

public class Headline extends Header {

    @Override
    public int textSize() {
        return 24;
    }

    @Override
    public int content() {
        return R.string.headline;
    }

    @Override
    public int[] padding() {
        return new int[]{24, 16, 16, 0};
    }

    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width, height);
    }
}
