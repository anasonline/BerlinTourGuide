package com.example.android.berlintourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    private static final String ITEM_TYPE = "Hotel";

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of hotels
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.hotel_name_armada, R.string.hotel_desc_armada, R.string.hotel_address_armada,
                R.string.hotel_phone_armada));

        items.add(new Item(R.string.hotel_name_berlin, R.string.hotel_desc_berlin, R.string.hotel_address_berlin,
                R.string.hotel_phone_berlin));

        items.add(new Item(R.string.hotel_name_clark, R.string.hotel_desc_clark, R.string.hotel_address_clark,
                R.string.hotel_phone_clark));

        items.add(new Item(R.string.hotel_name_sun, R.string.hotel_desc_sun, R.string.hotel_address_sun,
                R.string.hotel_phone_sun));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, ITEM_TYPE);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
