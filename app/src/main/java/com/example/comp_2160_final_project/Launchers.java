package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Launchers extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1;
    String[] s2;
    int[] images = {R.drawable.icon_jokr,R.drawable.icon_pila,R.drawable.icon_strela_p, R.drawable.icon_rpg_7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launchers);

        recyclerView = findViewById(R.id.launcherRecycler);

        s1 = getResources().getStringArray(R.array.rlaunchers);
        //s2 = add descriptions or whatever

        newAdapter myAdapter = new newAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}