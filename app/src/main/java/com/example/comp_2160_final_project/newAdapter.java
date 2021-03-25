package com.example.comp_2160_final_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class newAdapter extends RecyclerView.Adapter<newAdapter.MyViewHolder> {

    String[] data;
    int[] images;
    Context context;


    public newAdapter(Context ct, String[] s1, int[] img)
    {
        context = ct;
        data = s1;
        images = img;
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
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder {

        TextView TextL;
        ImageView ImageL;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            TextL = itemView.findViewById(R.id.weaponTitle);
            ImageL = itemView.findViewById(R.id.weaponImage);
        }
    }
}
