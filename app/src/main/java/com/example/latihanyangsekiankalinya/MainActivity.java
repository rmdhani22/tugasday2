package com.example.latihanyangsekiankalinya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText value1, value2;
TextView result;
Button tombolpenambahan, tombolpengurangan, tombolperkalian, tombolpembagian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        result = findViewById(R.id.result);
        tombolpenambahan = findViewById(R.id.tombolpenambahan);
        tombolpengurangan= findViewById(R.id.tombolpengurangan);
        tombolperkalian= findViewById(R.id.tombolperkalian);
        tombolpembagian= findViewById(R.id.tombolpembagian);

         tombolpenambahan.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int val1 = Integer.parseInt(value1.getText().toString());
                 int val2 = Integer.parseInt(value2.getText().toString());
                 int hasil = val1 + val2;
                 result.setText(String.valueOf(hasil));
             }
         });
        tombolpengurangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int hasil = val1 - val2;
                result.setText(String.valueOf(hasil));
            }
        });

        tombolperkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int hasil = val1 * val2;
                result.setText(String.valueOf(hasil));
            }
        });
        tombolpembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int hasil = val1 / val2;
                result.setText(String.valueOf(hasil));
            }
        });


    }
}