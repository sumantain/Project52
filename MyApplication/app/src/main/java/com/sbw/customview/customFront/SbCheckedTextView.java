package com.sbw.customview.customFront;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/**
 * Created by Sumanta on 07-03-2016.
 */
public class SbCheckedTextView extends CheckedTextView {

    public SbCheckedTextView(Context context) {
        super(context);
    }

    public SbCheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public SbCheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomFont(context, attrs);
    }

    protected void setCustomFont(Context context, AttributeSet attrs) {
        FontUtils.applyFont(context, this, attrs);
    }

    public boolean setCustomFont(Context context, String font) {
        return FontUtils.applyFont(context, this, font);
    }

}