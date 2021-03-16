package com.example.comp_2160_final_project;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Main_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Main_fragment extends Fragment {

    public Button ar;
    public Button handguns;
    public Button lmgs;
    public Button launchers;
    public Button marksman;
    public Button melee;
    public Button smgs;
    public Button shotguns;
    public Button sniper;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Main_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Main_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Main_fragment newInstance(String param1, String param2) {
        Main_fragment fragment = new Main_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_fragment, container, false);

        ar = (Button)view.findViewById(R.id.arButton);
        handguns = (Button)view.findViewById(R.id.hgButton);
        lmgs = (Button)view.findViewById(R.id.lmgButton);
        launchers =(Button)view.findViewById(R.id.launcherButton);
        marksman = (Button)view.findViewById(R.id.marksmanButton);
        melee = (Button)view.findViewById(R.id.meleeButton);
        smgs = (Button)view.findViewById(R.id.smgButton);
        shotguns = (Button)view.findViewById(R.id.shotgunButton);
        sniper = (Button)view.findViewById(R.id.sniperButton);

        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Assault_Rifles.class );
                startActivity(intent);
            }
        });

        handguns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Handguns.class );
                startActivity(intent);
            }
        });

        lmgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LMGS.class );
                startActivity(intent);
            }
        });

        launchers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Launchers.class );
                startActivity(intent);
            }
        });

        marksman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Marksman_Rifles.class );
                startActivity(intent);
            }
        });

        melee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Melee.class );
                startActivity(intent);
            }
        });

        shotguns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Shotguns.class );
                startActivity(intent);
            }
        });

        sniper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sniper_Rifles.class );
                startActivity(intent);
            }
        });

        smgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SMGS.class );
                startActivity(intent);
            }
        });

        return view;
    }

}