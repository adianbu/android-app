package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v){
        Context context = getApplicationContext();
       View v1 = findViewById(R.id.button11);

        EditText v2 = findViewById(R.id.text1);
        String s = v2.getText().toString();

        TextView v3= findViewById(R.id.view);
        if(s!=null)
         v3.setText(s);

        Toast.makeText(context, "Alert",Toast.LENGTH_LONG).show();

//        v.setEnabled(false);
//        Button button = (Button) v;
//        button.setText("Clicked");
    }

    public void next(View v){
        Intent i = new Intent(this,Settings.class);
        startActivity(i);
    }
}