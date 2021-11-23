package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    TextView textView;

    String[] items = {"거리순", "별점순", "후기순", "사진많은순"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        textView = (TextView) findViewById(R.id.textView);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(items[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("선택 : ");
            }
        });






        ListView listView = (ListView) findViewById(R.id.listView);
        List<String> list = new ArrayList<>();
        list.add("코스1");
        list.add("코스2");
        list.add("코스3");
        list.add("코스4");
        list.add("코스5");
        list.add("코스6");
        list.add("코스7");
        list.add("코스8");
        list.add("코스9");
        list.add("코스10");
        list.add("코스11");
        list.add("코스12");
        list.add("코스13");
        list.add("코스14");
        list.add("코스15");
        list.add("코스16");
        list.add("코스17");
        list.add("코스18");
        list.add("코스19");
        list.add("코스20");
        list.add("ImageView");



        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked 코스1
                    startActivity(new Intent(ListActivity.this, Course1Activity.class));
                }else if(position==1){
                    //clicked 코스2
                    startActivity(new Intent(ListActivity.this, RatingActivity.class));
                }else if(position==2){
                    //clicked 코스3
                    startActivity(new Intent(ListActivity.this, Course3Activity.class));
                }else if(position==3){
                    //clicked 코스4
                    startActivity(new Intent(ListActivity.this, Course4Activity.class));
                }else if(position==4){
                    //clicked 코스5
                    startActivity(new Intent(ListActivity.this, Course5Activity.class));
                }else{
                    //clicked ImageView
                    startActivity(new Intent(ListActivity.this, ImageActivity.class));
                }
            }
        });

    }
}

//    public void InitializeData()
//    {
//        dataList = new ArrayList<SampleData>(dataList);
//
//        dataList.add(new SampleData(R.drawable.ic_launcher_background, "산책로1","2.5 km"));
//        dataList.add(new SampleData(R.drawable.ic_launcher_background, "산책로2","3.5 km"));
//        dataList.add(new SampleData(R.drawable.ic_launcher_background, "산책로3","4.5 km"));
//    }
