package com.example.comp_2160_final_project;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Handguns extends AppCompatActivity {
int picker = 0;
//String s1[], s2[];
//int images[] = {R.drawable.icon_1911,R.drawable.icon_x16,R.drawable.icon_357,R.drawable.icon_m19, R.drawable.icon_50gs, R.drawable.icon_renetti};
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
        TextTitle = findViewById(R.id.titleText);
        gunView = findViewById(R.id.imageView_weapon);

        //s1 = getResources().getStringArray(R.array.handguns);

        switch (picker)
        {
            case 0:
                enact_1911();
                break;
            case 1:
                break;
            case 2:
                break;
        }

    }

    public void enact_1911()
    {
        //TextTitle.setText("1911");
        gunView.setImageResource(R.drawable.icon_1911);
        but1.setImageResource(R.drawable.camo_digital_2);
        but2.setImageResource(R.drawable.camo_digital_1);
        but3.setImageResource(R.drawable.camo_digital_3);
        but4.setImageResource(R.drawable.camo_digital_4);
        but5.setImageResource(R.drawable.camo_digital_5);
        but6.setImageResource(R.drawable.camo_digital_6);
        but7.setImageResource(R.drawable.camo_digital_7);
        but8.setImageResource(R.drawable.camo_digital_8);
        but9.setImageResource(R.drawable.camo_digital_9);
        but10.setImageResource(R.drawable.camo_completionist_damascus);

    }
}