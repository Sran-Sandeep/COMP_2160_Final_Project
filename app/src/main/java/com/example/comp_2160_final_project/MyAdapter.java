package com.example.comp_2160_final_project;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>
{

    private Context context;
    private ArrayList<Model> model;
    private Marksman_Rifles m_rifles;

    public MyAdapter(Context context, ArrayList<Model> model)
    {
        this.context = context;
        this.m_rifles = (Marksman_Rifles)context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_marksman__rifles,parent,false);
        return new MyHolder(v,m_rifles);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.textView.setText(model.get(position).getText());
        holder.imageView.setImageResource(model.get(position).getPhoto());

        if(m_rifles.position == position){
            holder.checkbox.setChecked(true);
            m_rifles.position = -1;
        }

        if(m_rifles.isActionMode)
        {
            Anim anim = new Anim(100, holder.linearLayout);
            anim.setDuration(300);
            holder.linearLayout.setAnimation(anim);
        }
        else
        {
            Anim anim = new Anim(0, holder.linearLayout);
            anim.setDuration(300);
            holder.linearLayout.setAnimation(anim);
            holder.checkbox.setChecked(false);
        }

        holder.cardView.setOnLongClickListener(v -> {
            m_rifles.startSelection(position);
            return true;
        });

        holder.checkbox.setOnClickListener(v -> {
            m_rifles.check(v,position);
        });
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private CheckBox checkbox;
        private TextView textView;
        private Marksman_Rifles marksman_rifles;
        private LinearLayout linearLayout;
        private ImageView imageView;

        public MyHolder(@NonNull View itemView, Marksman_Rifles marksman_rifles){
            super(itemView);
            textView = itemView.findViewById(R.id.text);
            checkbox= itemView.findViewById(R.id.checkBox);
            cardView = itemView.findViewById(R.id.cardView);
            this.marksman_rifles = marksman_rifles;
            imageView = itemView.findViewById(R.id.imgView);
            linearLayout = itemView.findViewById(R.id.linearlayout);

        }

    }
    class Anim extends Animation {
        private int width, startWidth;
        private View view;

        public Anim(int width, View view) {
            this.width = width;
            this.view = view;
            this.startWidth = view.getWidth();
        }

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {

            int newWidth = startWidth + (int) ((width - startWidth) * interpolatedTime);
            view.getLayoutParams().width = newWidth;
            view.requestLayout();

            super.applyTransformation(interpolatedTime, t);
        }
    }
    }



