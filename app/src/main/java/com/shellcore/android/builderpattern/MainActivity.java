package com.shellcore.android.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shellcore.android.builderpattern.builder.LayoutBuilder;
import com.shellcore.android.builderpattern.builder.LayoutView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView textView;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.MATCH_PARENT;

        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new ViewGroup.LayoutParams(width, height));

        setContentView(layout);

        LayoutBuilder builder = new LayoutBuilder();
        List<LayoutView> layoutViews = builder.displayDetail(); // Aqui podemos inflar los layouts definidos en el builder
//        List<LayoutView> layoutViews = builder.displaySimple();

        for(LayoutView layoutView : layoutViews) {
            ViewGroup.LayoutParams params = layoutView.layoutParams();
            textView = new TextView(this);
            textView.setLayoutParams(params);
            textView.setText(layoutView.content());
            textView.setTextSize(layoutView.textSize());
            textView.setTextColor(layoutView.shading().shade());
            textView.setBackgroundResource(layoutView.shading().background());

            int[] paddings = layoutView.padding();
            textView.setPadding(dp(paddings[0]), dp(paddings[1]), dp(paddings[2]), dp(paddings[3]));

            layout.addView(textView);
        }
    }

    private int dp(int px) {
        final float scaleFactor = getResources().getDisplayMetrics().density;
        int numberofRealPixels = (int) (px * scaleFactor + 0.5f);
        Log.d(TAG, "px: " + px + ", dp: " + scaleFactor + ", Transformed: " + numberofRealPixels);

        return numberofRealPixels;
    }
}
