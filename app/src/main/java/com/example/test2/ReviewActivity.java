package com.example.test2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReviewActivity extends AppCompatActivity {

    ListView listView2;
    ArrayList<String> list2 = new ArrayList<String>();
    Button btnAdd;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        list2.add("review1");
        list2.add("review2");
        list2.add("review3");


        listView2 = (ListView) findViewById(R.id.listView2);
        btnAdd = (Button)findViewById(R.id.up_rv);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list2);

        listView2.setAdapter(adapter);


        final EditText edt = (EditText)findViewById(R.id.txt_rv);

//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String str = edt.getText().toString();
//                list2.add(str);
//                adapter.notifyDataSetChanged();
//                edt.setText("");
//            }
//        });

    }
}