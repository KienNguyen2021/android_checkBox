package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    Button btnRandom;

    EditText edtNumber1,edtNumber2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            AnhXa();

        btnRandom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String chuoi1 = edtNumber1.getText().toString().trim();
                String chuoi2 = edtNumber2.getText().toString().trim();

                // tranh nhap rong vo box :

                /*if(chuoi1.length() == 0 || chuoi2.length() == 0)*/

                if(chuoi1.isEmpty() || chuoi2.isEmpty()){

                    Toast.makeText(MainActivity.this, " Please enter your valid email", Toast.LENGTH_LONG).show();
                } else{

                    // Ep tu chuoi ve dang so :

                    int min = Integer.parseInt(chuoi1); // from "12" to 12
                    int max = Integer.parseInt(chuoi2);


                    Random random = new Random();

                    // int number = random.nextInt(10);    // from 0 to 9

                    int number = random.nextInt(max - min + 1) + min;

                    //   txtNumber.setText(number + ""); // goi chuoi rong

                    // khong muon goi chuoi rong: ep 1 tu so ve kieu chuoi :


                }
            }
        });
    }

    private void AnhXa(){

        btnRandom = (Button) findViewById(R.id.buttonRandom);

        edtNumber1 = (EditText) findViewById(R.id.editTextNumberOne);
        edtNumber2 = (EditText) findViewById(R.id.editTextNumberTwo);

    }
}