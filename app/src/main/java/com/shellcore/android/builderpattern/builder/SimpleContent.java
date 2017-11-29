package com.shellcore.android.builderpattern.builder;

import android.view.ViewGroup;

import com.shellcore.android.builderpattern.R;

/**
 * Created by Shell on 28/11/2017.
 */

public class SimpleContent extends Content {

    @Override
    public int textSize() {
        return 14;
    }

    @Override
    public int content() {
        return R.string.short_text;
    }

    @Override
    public int[] padding() {
        return new int[]{16, 16, 16, 16};
    }

    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.MATCH_PARENT;
        return new ViewGroup.LayoutParams(width, height);
    }
}

