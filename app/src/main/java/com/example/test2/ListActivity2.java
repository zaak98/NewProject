package com.example.test2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity2 extends AppCompatActivity {

    private Object MyCourseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        ListView listView = findViewById(R.id.lv_commet_view);
        
        MyAdapter adapter = new MyAdapter();
        
        adapter.addCourse(new MyCourse("course1", "1"));
        adapter.addCourse(new MyCourse("course2", "2"));
        adapter.addCourse(new MyCourse("course3", "3"));
        adapter.addCourse(new MyCourse("course4", "4"));
        adapter.addCourse(new MyCourse("course5", "5"));

        listView.setAdapter(adapter);
    }
    
    class MyAdapter extends BaseAdapter {
        private ArrayList<MyCourse> courses = new ArrayList<>();
        
        public void addCourse(MyCourse course) {
            courses.add(course);
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public MyCourse getItem(int position) {
            return courses.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, final View convertView, ViewGroup parent) {
            MyCourseView view = new MyCourseView(getApplicationContext());
            
            MyCourse course = courses.get(position);
            view.setId(course.getId());
            view.setPhone(course.getPhone());

            return view;
        }
    }
}