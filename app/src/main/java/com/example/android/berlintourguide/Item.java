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
     * String resource ID for the item address
     */
    private int mItemAddressResourceId;

    /**
     * String resource ID for the item's (in this case Event) address
     */
    private int mItemDateResourceId;

    /**
     * String resource ID for the item's (in this case Restaurant) phone number
     */
    private int mItemPhoneResourceId;

    /**
     * Create a new Item object.
     * This constructor can be used to create Attractions
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
     * Create a new Item object.
     * This constructor can be used to create an Event, Restaurant or Hotel listing.
     * The 4th param (@param itemDateResourceId) can be used to pass event's date information
     * or restaurant/hotel phone number.
     *
     * @param itemNameId            is the string resource ID for item's name
     * @param itemAddressResourceId is the string resource ID for item's address
     * @param itemDescriptionId     is the string resource ID for item's description
     * @param itemDateResourceId    is the string resource ID for item's (event) date
     */

    public Item(int itemNameId, int itemDescriptionId, int itemAddressResourceId, int itemDateResourceId) {
        mItemNameId = itemNameId;
        mItemDescriptionId = itemDescriptionId;
        mItemAddressResourceId = itemAddressResourceId;
        mItemDateResourceId = itemDateResourceId;
    }


    /**
     * Get the string resource ID for the item's name.
     */
    public int getItemNameId() {
        return mItemNameId;
    }

    /**
     * Get the string resource ID for the item's description.
     */
    public int getItemDescriptionId() {
        return mItemDescriptionId;
    }

    /**
     * Get the string resource ID for the item's image.
     */
    public int getItemImageResourceId() {
        return mItemImageResourceId;
    }

    public int getItemAddressResourceId() {
        return mItemAddressResourceId;
    }

    public int getItemDateResourceId() {
        return mItemDateResourceId;
    }

    public int getItemPhoneResourceId() {
        return mItemPhoneResourceId;
    }
}
