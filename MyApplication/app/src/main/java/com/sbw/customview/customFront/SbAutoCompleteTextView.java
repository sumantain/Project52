package com.sbw.customview.customFront;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/**
 * Created by Sumanta on 07-03-2016.
 */
public class SbAutoCompleteTextView extends AutoCompleteTextView {

    public SbAutoCompleteTextView(Context context) {
        super(context);
    }

    public SbAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public SbAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
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