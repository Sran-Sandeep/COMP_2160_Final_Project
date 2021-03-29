package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class Handguns extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1;
    String[] s2;
    int[] images = {R.drawable.icon_x16,R.drawable.icon_1911,R.drawable.icon_357, R.drawable.icon_m19, R.drawable.icon_50gs};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handguns);

        recyclerView = findViewById(R.id.handgunRecycler);

        s1 = getResources().getStringArray(R.array.rHandgun);
        //s2 = add descriptions or whatever

        newAdapter myAdapter = new newAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}