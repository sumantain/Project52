package com.sbw.customview.customFront;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Sumanta on 07-03-2016.
 */
public class SbButton extends Button {

    public SbButton(Context context) {
        super(context);
    }

    public SbButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public SbButton(Context context, AttributeSet attrs, int defStyle) {
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