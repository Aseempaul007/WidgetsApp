package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    RadioButton rb1;
    RadioButton rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        rb1 = findViewById(R.id.radioButton);
        rb2 = findViewById(R.id.radioButton2);



    }
}