package com.example.test2;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyCourseView extends LinearLayout {
    TextView textView, textView2;

    public MyCourseView(Context context) {
        super(context);
        init(context);
    }

    public MyCourseView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.my_course, this, true);
        textView = findViewById(R.id.tv_id);
        textView2 = findViewById(R.id.tv_phone);
    }

    public void setId(String id){
        textView.setText(id);
    }

    public void setPhone(String phone) {
        textView2.setText(phone);
    }
}
