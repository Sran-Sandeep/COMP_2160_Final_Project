package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import static com.example.comp_2160_final_project.R.id.shotgunRecycler;

public class Shotguns extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1;
    String[] s2;
    int[] images = {R.drawable.icon_model_680,R.drawable.icon_r9_0_shotgun,R.drawable.icon_725, R.drawable.icon_origin_12_shotgun};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotguns);

        recyclerView = findViewById(shotgunRecycler);

        s1 = getResources().getStringArray(R.array.rShotgun);
        //s2 = add descriptions or whatever

        newAdapter myAdapter = new newAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}