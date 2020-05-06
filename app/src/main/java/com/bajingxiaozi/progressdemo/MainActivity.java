package com.bajingxiaozi.progressdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ProgressView progressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressView = findViewById(R.id.progress);
        progressView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressView.addBubble();
            }
        });
    }
}
