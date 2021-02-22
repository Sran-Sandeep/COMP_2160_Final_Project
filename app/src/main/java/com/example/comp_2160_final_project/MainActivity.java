package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String main_list[] = new String[] {"Assault Rifles", "SMGS", "ShotGuns" , "LMGS", "Marksman Rifles", "Sniper Rilfes", "HandGuns", "Launchers", "Melle"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ListView listView = (ListView) findViewById(R.id.main_listview);
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,main_list);
       listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String mainlist = main_list[position].toString();
               if (position == 0) {
                   Intent intent = new Intent(MainActivity.this, Assault_Rifles.class);
                   startActivity(intent);
               }
               else if(position == 1) {
                   Intent intent = new Intent(MainActivity.this, SMGS.class);
                   startActivity(intent);
               }
               else if(position == 2)
               {
                   Intent intent = new Intent(MainActivity.this, Shotguns.class);
                   startActivity(intent);
               }
               else if(position == 3){
                   Intent intent = new Intent(MainActivity.this, LMGS.class);
                   startActivity(intent);
               }

               else if(position == 4){
                   Intent intent = new Intent(MainActivity.this, Marksman_Rifles.class);
                   startActivity(intent);
               }

               else if(position == 5){
                   Intent intent = new Intent(MainActivity.this, Sniper_Rifles.class);
                   startActivity(intent);
               }

                else if(position == 6){
                   Intent intent = new Intent(MainActivity.this, Handguns.class);
                   startActivity(intent);
               }

                else if(position == 7){
                   Intent intent = new Intent(MainActivity.this, Launchers.class);
                   startActivity(intent);

               }
                else if (position == 8){
                   Intent intent = new Intent(MainActivity.this, Melee.class);
                   startActivity(intent);

               }
           }
       });
    }


}