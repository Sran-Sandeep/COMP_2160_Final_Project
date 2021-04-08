package com.example.comp_2160_final_project;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class newAdapter extends RecyclerView.Adapter<newAdapter.MyViewHolder> {

    public static final String MYPREFERENCES = "MyPrefs";
    String[] data;
    int[] images;
    Context context;
    SharedPreferences preferences;

    public newAdapter(Context ct, String[] s1, int[] img)
    {
        context = ct;
        data = s1;
        images = img;
        this.preferences = ct.getSharedPreferences(MYPREFERENCES,Context.MODE_PRIVATE);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.new_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.TextL.setText(data[position]);
        holder.ImageL.setImageResource(images[position]);
        String key = holder.TextL.getText().toString();
        boolean hasItem = preferences.getBoolean(key,false);
        holder.checkBox.setChecked(hasItem);
        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.v("tomato",key +" "+ isChecked);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean(key,isChecked);
                editor.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder {
        CheckBox checkBox;
        TextView TextL;
        ImageView ImageL;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            TextL = itemView.findViewById(R.id.weaponTitle);
            ImageL = itemView.findViewById(R.id.weaponImage);
            checkBox = itemView.findViewById(R.id.checkDone);

        }
    }
}
