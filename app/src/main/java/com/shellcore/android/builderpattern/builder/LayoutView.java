package com.shellcore.android.builderpattern.builder;

import android.view.ViewGroup;

/**
 * Created by Shell on 28/11/2017.
 */

public interface LayoutView {

    int textSize();
    int content();
    Shading shading();
    int[] padding();

    ViewGroup.LayoutParams layoutParams();
}
