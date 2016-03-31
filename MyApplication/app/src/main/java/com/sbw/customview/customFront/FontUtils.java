package com.sbw.customview.customFront;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import com.sbw.customview.R;


/**
 * Created by Sumanta on 07-03-2016.
 */
public final class FontUtils {

    static void applyFont(Context context, TextView textView, AttributeSet attrs) {
        TypedArray style = context.obtainStyledAttributes(attrs, R.styleable.font);
        applyFont(context, textView, style.getString(R.styleable.font_font));
        style.recycle();
    }

    public static boolean applyFont(Context context, TextView textView, String font) {
        if(TextUtils.isEmpty(font)) {
            throw new RuntimeException("The font can't be null");
        }
        try {
            textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/" + font + ".ttf"));
            return true;
        } catch(Exception e) {
            Log.w("FontRadioButton", "Error to obtain the font: " + font, e);
        }
        return false;
    }
}
