package com.example.test2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class Course1View extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;
    Button up_rv, up_photo, rating_btn, app_rating;
    GridView gridview = null;
    GridAdapter adapter = null;
    private RatingBar ratingBar;
    private Dialog dialog;
    private String str;
    private Float st;
    TextView rating_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_course1);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        final TextView textView = (TextView)findViewById(R.id.course_name1);
        RatingBar rb = (RatingBar)findViewById(R.id.ratingBar1);

        up_rv = (Button)findViewById(R.id.up_rv);
        up_rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Course1View.this, ReviewActivity.class);
                startActivity(intent);
            }
        });

        up_photo = (Button)findViewById(R.id.up_photo);
        up_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Course1View.this, ImageActivity.class);
                startActivity(intent);
            }
        });

        rating_btn = (Button)findViewById((R.id.up_rate));
        rating_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show();
            }

        });
//        rating_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //??????????????? ?????? ??????
//                dialog = new Dialog(Course1View.this);
//                //?????????
//                dialog.setTitle("??????");
//                //???????????????
//                dialog.setContentView(R.layout.dialog);
//                //?????????
//                ratingBar = (RatingBar)dialog.findViewById(R.id.ratingBar);
//                app_rating = (Button)dialog.findViewById(R.id.app_rating);
//                app_rating.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        rating_view.setText(str);
//                        ratingBar.setRating(st);
//                        dialog.dismiss();
//                    }
//                });
//                //????????? ?????? - OnRatingBarChangeListener
//                ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//                    @Override
//                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
//                        //???????????? ?????? ??? ????????? ??????
//                        st = 10.0f/ratingBar.getNumStars();
//                        //String ????????? ???????????? ?????? ???????????? ????????? ???????????? ??????
//                        str = String.format("%.1f",(st * v));
//                    }
//                });
//                //??????????????? ??? ???????????? ?????? ????????????
//                //false??? ?????? ?????? true ?????? ??????
//                dialog.setCanceledOnTouchOutside(false);
//                dialog.show();
//            }
//        });

        gridview = (GridView) findViewById(R.id.gridView);
        adapter = new GridAdapter();

        //Adapter ?????? ???????????? ?????? ??????
        adapter.addItem(new GridItem(R.drawable.ic_image));
        adapter.addItem(new GridItem(R.drawable.ic_image));
        adapter.addItem(new GridItem(R.drawable.ic_image));
        adapter.addItem(new GridItem(R.drawable.ic_image));
        adapter.addItem(new GridItem(R.drawable.ic_image));
        adapter.addItem(new GridItem(R.drawable.ic_image));
        adapter.addItem(new GridItem(R.drawable.ic_image));
        adapter.addItem(new GridItem(R.drawable.ic_image));

        //??????????????? Adapter ??????
        gridview.setAdapter(adapter);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        LatLng latLng = new LatLng(35.15099311582141, 128.11803238681944);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(17));
        MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("Course1");
        googleMap.addMarker(markerOptions);

    }

    void show()
    {
        final List<String> ListItems = new ArrayList<>();
        ListItems.add("1???");
        ListItems.add("2???");
        ListItems.add("3???");
        ListItems.add("4???");
        ListItems.add("5???");
        final CharSequence[] items =  ListItems.toArray(new String[ ListItems.size()]);

        final List SelectedItems  = new ArrayList();
        int defaultItem = 0;
        SelectedItems.add(defaultItem);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("????????????");
        builder.setSingleChoiceItems(items, defaultItem,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SelectedItems.clear();
                        SelectedItems.add(which);
                    }
                });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                String msg="";

                if (!SelectedItems.isEmpty()) {
                    int index = (int) SelectedItems.get(0);
                    msg = ListItems.get(index);
                }
                Toast.makeText(getApplicationContext(), "????????? ?????????????????????.\n"+ msg , Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {}
        });
        builder.show();
    }
}