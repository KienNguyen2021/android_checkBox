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


        txtNoiDung = (TextView) findViewById(R.id.textView);
        btnClick = (Button) findViewById(R.id.buttonClick);

        txtNoiDung.setText("textview");

        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                txtNoiDung.setText(" Lap trinh Android");
            }
        }) ;

    }
}