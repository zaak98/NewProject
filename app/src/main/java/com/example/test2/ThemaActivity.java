package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThemaActivity extends AppCompatActivity {

    private Button btn1_move;
    private Button btn2_move;
    private Button btn3_move;
    private Button btn4_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema);

        btn1_move = findViewById(R.id.btn1_move);
        btn1_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThemaActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        btn2_move = findViewById(R.id.btn2_move);
        btn2_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThemaActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        btn3_move = findViewById(R.id.btn3_move);
        btn3_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThemaActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        btn4_move = findViewById(R.id.btn4_move);
        btn4_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThemaActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }
}