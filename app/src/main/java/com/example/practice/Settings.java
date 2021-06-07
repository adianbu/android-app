package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void nextClick(View v){
//       Button e = findViewById(R.id.enter);
        EditText text = findViewById(R.id.editTextTextPersonName);

        String s = text.getText().toString();
        Intent i =new Intent(this,Bundles.class);
        i.putExtra("text",s);
        startActivity(i);

    }

}