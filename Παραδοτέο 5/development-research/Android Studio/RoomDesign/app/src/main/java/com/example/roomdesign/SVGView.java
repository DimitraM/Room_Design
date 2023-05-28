package com.example.roomdesign;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;

import java.io.IOException;
import java.io.InputStream;

public class SVGView extends View {
    private SVG svg;

    public SVGView(Context context) {
        super(context);
        init();
    }

    public SVGView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        try {
            InputStream inputStream = getContext().getAssets().open("chair.svg");
            svg = SVG.getFromInputStream(inputStream);
        } catch (IOException | SVGParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (svg != null) {
            svg.renderToCanvas(canvas);
        }
    }
}
