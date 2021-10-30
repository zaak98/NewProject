package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.listView);

        List<String> list = new ArrayList<>();
        list.add("코스1");
        list.add("코스2");
        list.add("코스3");
        list.add("코스4");
        list.add("코스5");


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
                    startActivity(new Intent(ListActivity.this, Course2Activity.class));
                }else if(position==2){
                    //clicked 코스3
                    startActivity(new Intent(ListActivity.this, Course3Activity.class));
                }else if(position==3){
                    //clicked 코스4
                    startActivity(new Intent(ListActivity.this, Course4Activity.class));
                }else{
                    //clicked 코스5
                    startActivity(new Intent(ListActivity.this, Course5Activity.class));
                }
            }
        });

    }


//    public void InitializeData()
//    {
//        dataList = new ArrayList<SampleData>(dataList);
//
//        dataList.add(new SampleData(R.drawable.ic_launcher_background, "산책로1","2.5 km"));
//        dataList.add(new SampleData(R.drawable.ic_launcher_background, "산책로2","3.5 km"));
//        dataList.add(new SampleData(R.drawable.ic_launcher_background, "산책로3","4.5 km"));
//    }

}