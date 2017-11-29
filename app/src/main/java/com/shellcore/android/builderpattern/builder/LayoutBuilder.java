package com.shellcore.android.builderpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shell on 28/11/2017.
 */

public class LayoutBuilder {

    public List<LayoutView> displaySimple() {
        List<LayoutView> views = new ArrayList<>();
        views.add(new Headline());
        views.add(new SimpleContent());
        return views;
    }

    public List<LayoutView> displayDetail() {
        List<LayoutView> views = new ArrayList<>();
        views.add(new Headline());
        views.add(new SubHeadline());
        views.add(new DetailContent());
        return views;
    }
}
