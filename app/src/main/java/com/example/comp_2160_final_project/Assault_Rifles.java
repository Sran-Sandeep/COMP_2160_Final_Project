package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Assault_Rifles extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1;
    String[] s2;
    int[] images = {R.drawable.icon_kilo141,R.drawable.icon_fal,R.drawable.icon_m4a1, R.drawable.icon_fr_556, R.drawable.icon_oden, R.drawable.icon_m13, R.drawable.icon_fn_scar_17, R.drawable.icon_ak47};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assault__rifles);

        recyclerView = findViewById(R.id.assaultRecycler);

        s1 = getResources().getStringArray(R.array.rAssault);
        //s2 = add descriptions or whatever

        newAdapter myAdapter = new newAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}