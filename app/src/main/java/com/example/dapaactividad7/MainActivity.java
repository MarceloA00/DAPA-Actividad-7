package com.example.dapaactividad7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button changeActivityBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeActivityBtn = findViewById(R.id.button);
    }

    @SuppressLint("NewApi")
    public void ChangeActivity(View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent, ActivityOptions.makeCustomAnimation(this, android.R.anim.slide_in_left, android.R.anim.slide_out_right).toBundle());

    }
}