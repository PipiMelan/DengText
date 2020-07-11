package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private fun Login(){
        // Sign in function
    }

    private fun LoadData(){
        // Use network to acquire data
    }

    private fun UpLoad(){
        // Uplate Data
    }
}