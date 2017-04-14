package com.example.android.berlintourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anas on 14.04.17.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    /**
     * Create a new {@link ItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items   is the list of {@link Item}s to be displayed.
     */
    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID item_name.
        TextView itemName = (TextView) listItemView.findViewById(R.id.item_name);

        // Get the currentItem object and set this text on the item_name TextView.
        itemName.setText(currentItem.getmItemNameId());

        // Find the TextView in the list_item.xml layout with the ID item_description.
        TextView itemDescription = (TextView) listItemView.findViewById(R.id.item_description);

        // Get the currentItem object and set this text on the item_description TextView.
        itemDescription.setText(currentItem.getmItemDescriptionId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentItem.getmItemImageResourceId());
        imageView.setVisibility(View.VISIBLE);


        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }


}
