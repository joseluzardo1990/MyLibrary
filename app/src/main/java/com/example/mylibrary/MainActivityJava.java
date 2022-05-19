package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.mylibrary.databinding.ActivityMainJavaBinding;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainJavaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainJavaBinding.inflate(getLayoutInflater());

        binding.testView2.setText("BTN FROM JAVA");
        binding.testView2.setOnClick(() -> {
            Log.d("PRESS BTN","OK");
            startActivity(new Intent(this, MainActivityKotlin.class));
            return null;
        });

        setContentView(binding.getRoot());

    }
}