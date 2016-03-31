package com.sbw.customview.customFront;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Sumanta on 07-03-2016.
 */
public class SbTextView extends TextView {

    public SbTextView(Context context) {
        super(context);
    }

    public SbTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public SbTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomFont(context, attrs);
    }

    protected void setCustomFont(Context context, AttributeSet attrs) {
        FontUtils.applyFont(context, this, attrs);
    }

    public boolean setCustomFont(Context context, String font) {
        return FontUtils.applyFont(context, this, font);
    }

}