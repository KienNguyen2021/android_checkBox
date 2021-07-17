package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayName = new ArrayList<>();

        arrayName.add ("Toronto");
        arrayName.add ("Vancouver");
        arrayName.add ("Montreal");
        arrayName.add("Calgary");
        arrayName.add("Edmonton");

        for ( int i = 0; i < arrayName.size(); i++){

            System.out.println(arrayName.get(i));
        }
    }
}