package com.example.dapaactividad7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button showSynopsisBtn;
    TextView synopsisText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        showSynopsisBtn = findViewById(R.id.showSynopsisBtn);
        synopsisText = findViewById(R.id.synopsisText);
    }

    public void ShowSynopsis(View v) {
        if (synopsisText.getVisibility() == View.INVISIBLE) {
            synopsisText.setVisibility(View.VISIBLE);
        } else {
            synopsisText.setVisibility(View.INVISIBLE);
        }

    }
}