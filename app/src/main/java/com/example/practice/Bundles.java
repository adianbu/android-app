package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Bundles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundles);

//        Bundle bundle = new getIntent().getExtras();
//        bundle.getString("value");
        Intent i = getIntent();
        String extra = i.getStringExtra("text");
        ((TextView)findViewById(R.id.bundles_textView)).setText(extra);
    }
}