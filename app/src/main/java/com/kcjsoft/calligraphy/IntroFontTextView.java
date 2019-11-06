package com.kcjsoft.calligraphy;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class IntroFontTextView extends AppCompatTextView {

    //생성자1:자바에서new를 할때

    public IntroFontTextView(Context context) {
        super(context);


            //폰트설정을 생성자에서..
            Typeface typeface= Typeface.createFromAsset(context.getAssets(),"fonts/Swagger.ttf");
            setTypeface(typeface);
            setTextSize(24);
            setTextColor(Color.WHITE);
        }



    public IntroFontTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Typeface typeface= Typeface.createFromAsset(context.getAssets(),"fonts/Swagger.ttf");
        setTypeface(typeface);
        setTextSize(24);
        setTextColor(Color.WHITE);
    }

}

