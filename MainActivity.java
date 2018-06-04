package com.example.david.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button4 = findViewById(R.id.btn_D4);
        final Button button6 = findViewById(R.id.btn_D6);
        final Button button8 = findViewById(R.id.btn_D8);
        final Button button10 = findViewById(R.id.btn_D10);
        final Button button12 = findViewById(R.id.btn_D12);
        final Button button20 = findViewById(R.id.btn_D20);
        final Button button100 = findViewById(R.id.btn_D100);

        final TextView txt4 = findViewById(R.id.txt_d4);
        final TextView txt6 = findViewById(R.id.txt_d6);
        final TextView txt8 = findViewById(R.id.txt_d8);
        final TextView txt10 = findViewById(R.id.txt_d10);
        final TextView txt12 = findViewById(R.id.txt_d12);
        final TextView txt20 = findViewById(R.id.txt_d20);
        final TextView txt100 = findViewById(R.id.txt_d100);


        //4
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(4)+1;
                txt4.setText(Integer.toString(n));

            }
        });
        
        //6
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(6)+1;
                txt6.setText(Integer.toString(n));

            }
        });
        
        //8
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(8)+1;
                txt8.setText(Integer.toString(n));

            }
        });
        
        
        //10
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(10)+1;
                txt10.setText(Integer.toString(n));

            }
        });
        //12
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(12)+1;
                txt12.setText(Integer.toString(n));

            }
        });
        //20
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(20)+1;
                txt20.setText(Integer.toString(n));

            }
        });
        //100
        button100.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(100)+1;
                txt100.setText(Integer.toString(n));

            }
        });

    }
}
