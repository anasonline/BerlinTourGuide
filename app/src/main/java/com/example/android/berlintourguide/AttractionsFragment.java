package com.example.android.berlintourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_attractions, container, false);

        // Create a list of attractions
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.attraction_name_brandenburg_gate, R.string.attraction_desc_brandendurg_gate,
                R.drawable.ic_place_black_24dp));
        items.add(new Item(R.string.attraction_name_reichstag_building, R.string.attraction_desc_brandendurg_gate,
                R.drawable.ic_place_black_24dp));

        return rootView;



    }

}
