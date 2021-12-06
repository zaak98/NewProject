package com.example.test2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    ArrayList<GridItem> items = new ArrayList<GridItem>();
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
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        context = viewGroup.getContext();
        GridItem gridItem = items.get(position);

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_item, viewGroup, false);

            ImageView iv_icon = (ImageView) convertView.findViewById(R.id.imageView1);

            iv_icon.setImageResource(gridItem.getResId());

        } else {
            View view = new View(context);
            view = (View) convertView;
        }
        return convertView;
    }

//    public void setItem(String strItem) {
//        String strGet = strItem;
//        this.items.add(new GridItem(strGet));
//    }

//    public String getItemString(int position) {
//        return this.items.get(position).getItemString();
//    }

}
