package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNoiDung;

    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNoiDung = (TextView) findViewById(R.id.textViewNoiDung);

        btnClick = (Button)findViewById(R.id.buttonClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                txtNoiDung.setText("Android Development");
            }
        });
    }
}