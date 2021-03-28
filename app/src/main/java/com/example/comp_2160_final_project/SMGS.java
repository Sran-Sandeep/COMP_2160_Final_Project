package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SMGS extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1;
    String[] s2;
    int[] images = {R.drawable.icon_aug,R.drawable.icon_p90,R.drawable.icon_mp5, R.drawable.icon_uzi, R.drawable.icon_pp19_bizon, R.drawable.icon_mp7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_m_g_s);

        recyclerView = findViewById(R.id.smgRecycler);

        s1 = getResources().getStringArray(R.array.rSMG);
        //s2 = add descriptions or whatever

        newAdapter myAdapter = new newAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}