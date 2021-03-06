package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Course5View extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;
    Button up_rv;
    Button up_photo;
    GridView gridview = null;
    GridAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_course5);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        final TextView textView = (TextView)findViewById(R.id.course_name5);
        RatingBar rb = (RatingBar)findViewById(R.id.ratingBar5);

        up_rv = (Button)findViewById(R.id.up_rv);
        up_rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Course5View.this, ReviewActivity.class);
                startActivity(intent);
            }
        });

        up_photo = (Button)findViewById(R.id.up_photo);
        up_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Course5View.this, ImageActivity.class);
                startActivity(intent);
            }
        });

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
        LatLng latLng = new LatLng(35.17718524114638, 128.13117048096936);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(17));
        MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("Course5");
        googleMap.addMarker(markerOptions);

    }
}
