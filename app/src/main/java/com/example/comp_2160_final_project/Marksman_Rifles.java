package com.example.comp_2160_final_project;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaDescrambler;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Marksman_Rifles extends AppCompatActivity
{
    private RecyclerView rview;
    private MyAdapter adapter;
    private ArrayList<Model> list = new ArrayList<>();
    private ArrayList<Model> selectionList = new ArrayList<>();
    private int counter = 0;
    private Toolbar toolbar;
    private TextView txtToolbar;
    public boolean isActionMode =false;
    private ImageButton btnback;
    public int position = -1;




    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marksman__rifles);

        txtToolbar = findViewById(R.id.text_toolbar);
        txtToolbar.setVisibility(View.GONE);

        btnback = findViewById(R.id.backbtn);
        btnback.setVisibility(View.GONE);

        rview  = findViewById(R.id.marksman_recycler);
        rview.setHasFixedSize(true);
        rview.setLayoutManager(new LinearLayoutManager(this));

        list.add(new Model(R.drawable.icon_ebr_14, "EBR-14"));
        list.add(new Model(R.drawable.icon_carbine_mk2, "MK2 Carbine"));
        list.add(new Model(R.drawable.icon_kar98k, "Kar 98 K"));
        list.add(new Model(R.drawable.icon_crossbow, "CrossBow"));
        list.add(new Model (R.drawable.icon_sks,"SKS" ));
        list.add(new Model(R.drawable.icon_sp_r_208,"SP-R 208"));

        adapter = new MyAdapter(Marksman_Rifles.this, list);
        rview.setAdapter(adapter);

        btnback.setOnClickListener(v ->
        {
            clearActionMode();
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void clearActionMode() {
        isActionMode=false;
        txtToolbar.setVisibility(View.GONE);
        txtToolbar.setText("0 Items Selected");
        btnback.setVisibility(View.GONE);
        counter = 0;
        selectionList.clear();
        toolbar.getMenu().clear();
        adapter.notifyDataSetChanged();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void startSelection(int index) {
        if (!isActionMode) {
            isActionMode = true;
            selectionList.add(list.get(index));
            counter++;
            updateToolbarText(counter);
            txtToolbar.setVisibility(View.VISIBLE);
            btnback.setVisibility(View.VISIBLE);
            toolbar.inflateMenu(R.menu.menu_action);
            position = index;
            adapter.notifyDataSetChanged();
        }
    }


    public void check(View v, int index){
        if(((CheckBox)v).isChecked()){
            selectionList.add(list.get(index));
            counter++;
            updateToolbarText(counter);
        }
        else {
            selectionList.remove(list.get(index));
            counter--;
            updateToolbarText(counter);
        }
    }

    private void updateToolbarText (int counter)
    {
        if(counter ==0){
            txtToolbar.setText("0 Item selected");
        }

        if(counter ==1){
            txtToolbar.setText("1 Item selected");
        }

        else{
            txtToolbar.setText(counter+ " Items selected");
        }


    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.item_delete && selectionList.size()>0)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Delete "+selectionList.size()+ "Items?");
            builder.setTitle("Confirm");
            builder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    for (Model model :selectionList){
                        list.remove(model);
                    }
                    updateToolbarText(0);
                    clearActionMode();

                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.show();
        }

        return super.onOptionsItemSelected(item);
    }
}

