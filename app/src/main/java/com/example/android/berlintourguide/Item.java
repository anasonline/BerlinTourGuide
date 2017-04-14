package com.example.android.berlintourguide;

/**
 * Created by anas on 14.04.17.
 */

/**
 * {@link Item} represents an item in a list, wehther it's an attraction, event, restaurant, or
 * hotel. It contains resource IDs for item's name, description, location, and phone number.
 * Custom constructors are used to construct items of different types.
 */

public class Item {

    /**
     * String resource ID for the item name
     */
    private int mItemNameId;

    /**
     * String resource ID for the item description
     */
    private int mItemDescriptionId;

    /**
     * String resource ID for the item image
     */
    private int mItemImageResourceId;

    /**
     * Create a new Item object.
     *
     * @param itemNameId          is the string resource ID for item's name
     * @param itemDescriptionId   is the string resource ID for item's description
     * @param itemImageResourceId is the string resource ID for item's image
     */

    public Item(int itemNameId, int itemDescriptionId, int itemImageResourceId) {
        mItemNameId = itemNameId;
        mItemDescriptionId = itemDescriptionId;
        mItemImageResourceId = itemImageResourceId;
    }

    /**
     * Get the string resource ID for the item's name.
     */
    public int getmItemNameId() {
        return mItemNameId;
    }

    /**
     * Get the string resource ID for the item's description.
     */
    public int getmItemDescriptionId() {
        return mItemDescriptionId;
    }

    /**
     * Get the string resource ID for the item's image.
     */
    public int getmItemImageResourceId() {
        return mItemImageResourceId;
    }


}
