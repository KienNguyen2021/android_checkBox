package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ImageView imgHinh;

    RelativeLayout manhinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgHinh = (ImageView) findViewById(R.id.imageViewHinh);
        imgHinh.setImageResource(R.drawable.android_image2);

        manhinh =(RelativeLayout) findViewById(R.id.manHinh);

        manhinh.setBackgroundResource(R.drawable.ruongBacThang);

    }
}