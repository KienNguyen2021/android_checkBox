package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thongBao("Mai",20);
        thongBao("Hoa",30);
        thongBao("Tam",40);

        }

        private void thongBao(String ten, int tuoi){

        System.out.println(" Xin Chao:" + ten + "-" + "tuoi : " + tuoi);
        }
}