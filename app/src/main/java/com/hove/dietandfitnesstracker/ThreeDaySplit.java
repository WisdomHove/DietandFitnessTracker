package com.hove.dietandfitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThreeDaySplit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_day_split);
    }

    public void StartVideo(View view) {

        Intent intent = new Intent(ThreeDaySplit.this, WebViewActivity.class);
        startActivity(intent);
    }
}