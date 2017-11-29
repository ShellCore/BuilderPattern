package com.shellcore.android.builderpattern.builder;

import com.shellcore.android.builderpattern.R;

/**
 * Created by Shell on 28/11/2017.
 */

public class HeaderShading implements Shading {

    @Override
    public int shade() {
        return R.color.text_primary_dark;
    }

    @Override
    public int background() {
        return R.color.text_background;
    }
}
