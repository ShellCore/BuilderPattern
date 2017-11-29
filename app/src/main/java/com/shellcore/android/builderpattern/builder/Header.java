package com.shellcore.android.builderpattern.builder;

/**
 * Created by Shell on 28/11/2017.
 */

public abstract class Header implements LayoutView {

    @Override
    public Shading shading() {
        return new HeaderShading();
    }
}
