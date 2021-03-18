package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Handguns extends AppCompatActivity {
int picker = 0;
ImageButton but1, but2, but3, but4, but5, but6, but7, but8, but9, but10;
TextView TextTitle, Textchallenge;
ImageView gunView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1911);
        but1 = findViewById(R.id.imageBtn1);
        but2 = findViewById(R.id.imageBtn2);
        but3 = findViewById(R.id.imageBtn3);
        but4 = findViewById(R.id.imageBtn4);
        but5 = findViewById(R.id.imageBtn5);
        but6 = findViewById(R.id.imageBtn6);
        but7 = findViewById(R.id.imageBtn7);
        but8 = findViewById(R.id.imageBtn8);
        but9 = findViewById(R.id.imageBtn9);
        but10 = findViewById(R.id.imageBtn10);

        switch (picker)
        {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }

    }
}