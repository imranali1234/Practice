package com.example.practicegit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hi Branch is Added Feature");
        System.out.println("Hi Branch is Added Another Feature");
        int a =2;
        int b = a+2;

        int c = a*b;


    }
}