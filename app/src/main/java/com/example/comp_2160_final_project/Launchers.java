package com.example.comp_2160_final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Launchers extends AppCompatActivity {

    RecyclerView recyclerView;
    SharedPreferences preferences;
    String[] s1;
    String[] s2;
    int[] images = {R.drawable.icon_pila,R.drawable.icon_strela_p,R.drawable.icon_jokr, R.drawable.icon_rpg_7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launchers);
        //CheckBox checkbox = (CheckBox)findViewById(R.id.checkDone);
        recyclerView = findViewById(R.id.launcherRecycler);
        //preferences = getSharedPreferences(MYPREFERENCES, Context.MODE_PRIVATE);
        //.Editor editor = preferences.edit();



        s1 = getResources().getStringArray(R.array.rlaunchers);


        newAdapter myAdapter = new newAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        /*checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkbox.isChecked())
                {
                    editor.putBoolean("checked",true);
                }
                else
                {
                    editor.putBoolean("checked",false);
                }
                editor.apply();
            }
        }); */

               /* if(preferences.contains("checked") && preferences.getBoolean("checked",false) == true) {
            checkbox.setChecked(true);
        }
        else{
            checkbox.setChecked(false);
        }
*/
    }


}