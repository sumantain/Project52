package com.sbw.customview.customFront;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

/**
 * Created by Sumanta on 07-03-2016.
 */
public class SbRadioButton extends RadioButton {

    public SbRadioButton(Context context) {
        super(context);
    }

    public SbRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public SbRadioButton(Context context, AttributeSet attrs, int defStyle) {
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