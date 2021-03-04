package com.example.comp_2160_final_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Main_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Main_fragment extends Fragment {
    ListView listView;

    SearchView searchView;

    ArrayAdapter<String> adapter;

    String[] data = {"Assault Rifles", "Handguns", "Launchers", "LMGS", "Marksman Rifles", "Melee", "Shotguns","SMGS", "Sniper Rifles "};

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
        listView = (ListView) view.findViewById(R.id.main_list);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    Intent intent = new Intent (getContext(), Assault_Rifles.class);
                    startActivity(intent);
                }

                if(position == 1)
                {
                    Intent intent = new Intent (getContext(), Handguns.class);
                    startActivity(intent);
                }

                if(position == 2)
                {
                    Intent intent = new Intent (getContext(), Launchers.class);
                    startActivity(intent);
                }

                if(position == 3)
                {
                    Intent intent = new Intent (getContext(), LMGS.class);
                    startActivity(intent);
                }

                if(position == 4)
                {
                    Intent intent = new Intent (getContext(), Marksman_Rifles.class);
                    startActivity(intent);
                }

                if(position == 5)
                {
                    Intent intent = new Intent (getContext(), Melee.class);
                    startActivity(intent);
                }

                if(position == 6)
                {
                    Intent intent = new Intent (getContext(), Shotguns.class);
                    startActivity(intent);
                }

                if(position == 7)
                {
                    Intent intent = new Intent (getContext(), SMGS.class);
                    startActivity(intent);
                }

                if(position == 8)
                {
                    Intent intent = new Intent (getContext(), Sniper_Rifles.class);
                    startActivity(intent);
                }

            }
        }
        );
        return view;
    }
}