package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RatingActivity extends AppCompatActivity {

    Button up_rv;
    Button up_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        final TextView textView = (TextView)findViewById(R.id.textView);
        RatingBar rb = (RatingBar)findViewById(R.id.ratingBar);

        up_rv = (Button)findViewById(R.id.up_rv);
        up_rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RatingActivity.this, ReviewActivity.class);
                startActivity(intent);
            }
        });

        up_photo = (Button)findViewById(R.id.up_photo);
        up_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RatingActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        });
    }
}