package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setTextColor(R.color.gray);
        textView.setText(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
        setContentView(textView);
    }
}