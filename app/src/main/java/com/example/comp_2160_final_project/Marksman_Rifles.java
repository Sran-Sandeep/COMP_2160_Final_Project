package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class Marksman_Rifles extends AppCompatActivity
{

    RecyclerView recyclerView;

    String[] s1;
    String[] s2;
    int[] images = {R.drawable.icon_ebr_14, R.drawable.icon_carbine_mk2, R.drawable.icon_kar98k, R.drawable.icon_crossbow, R.drawable.icon_sks, R.drawable.icon_sp_r_208};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marksman__rifles);

        recyclerView = findViewById(R.id.marksmanRecycler);

        s1 = getResources().getStringArray(R.array.rMarksman);
        //s2 = add descriptions or whatever

        newAdapter myAdapter = new newAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}