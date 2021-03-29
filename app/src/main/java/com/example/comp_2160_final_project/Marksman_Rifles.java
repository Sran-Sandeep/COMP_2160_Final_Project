package com.example.comp_2160_final_project;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaDescrambler;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Marksman_Rifles extends AppCompatActivity
{

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] data = {"a", "b","c"};
    int[] images = {R.drawable.icon_ebr_14, R.drawable.icon_carbine_mk2, R.drawable.icon_kar98k, R.drawable.icon_crossbow, R.drawable.icon_sks, R.drawable.icon_sp_r_208};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marksman__rifles);

        listView = findViewById(R.id.marks_man_list);
        adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,data);

        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action,menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item_done){
            String itemSelected = "Selected Items: \n";

            for(int i = 0; i<listView.getCount();i++){
                if(listView.isItemChecked(i)){
                    itemSelected +=listView.getItemAtPosition(i) + "\n";
                }
            }
            Toast.makeText(this, itemSelected,Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

