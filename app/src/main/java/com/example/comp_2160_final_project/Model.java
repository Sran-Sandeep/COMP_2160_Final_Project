package com.example.comp_2160_final_project;

public class Model {

    private int photo;
    private String text;

    public Model (int photo, String text){
        this.photo = photo;
        this.text = text;

    }

    public int getPhoto()
    {
        return photo;
    }

    public String getText()
    {
        return text;
    }
}
