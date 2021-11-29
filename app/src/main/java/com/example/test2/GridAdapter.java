package com.example.test2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    private ArrayList<GridItem> items;
    private Context context;

    public void addItem(GridItem item) {
        items.add(item);
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        context = parent.getContext();
        GridItem gridItem = items.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.grid_item, parent, false);

        ImageView imageView = convertView.findViewById(R.id.imageView1);
        imageView.findViewById(R.id.imageView1);

        return convertView;
    }

    public void setItem(String strItem) {
        String strGet = strItem;
        this.items.add(new GridItem(strGet));
    }

//    public String getItemString(int position) {
//        return this.items.get(position).getItemString();
//    }

}
