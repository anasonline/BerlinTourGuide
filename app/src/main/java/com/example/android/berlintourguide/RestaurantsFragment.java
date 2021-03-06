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
public class RestaurantsFragment extends Fragment {

    private static final String ITEM_TYPE = "Restaurant";

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of restaurants
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.string.restaurant_name_facil, R.string.restaurant_desc_facil,
                R.string.restaurant_address_facil, R.string.restaurant_phone_facil));
        items.add(new Item(R.string.restaurant_name_bieberbau, R.string.restaurant_desc_bieberbau,
                R.string.restaurant_address_bieberbau, R.string.restaurant_phone_bieberbau));
        items.add(new Item(R.string.restaurant_name_heising, R.string.restaurant_desc_heising,
                R.string.restaurant_address_heising, R.string.restaurant_phone_heising));
        items.add(new Item(R.string.restaurant_name_tim_raue, R.string.restaurant_desc_tim_raue,
                R.string.restaurant_address_tim_raue, R.string.restaurant_phone_tim_raue));

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