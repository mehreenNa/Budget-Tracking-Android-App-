package com.example.aurorasheetapp;

import java.util.ArrayList;

/**
 * This class represents a tag with a name and a list of tagged items.
 */
public class Tag {
    private String name;
    private ArrayList<Item> tagged_items;
    private boolean main_selected;

    private String documentID;

    public Tag(String name){
        this.name = name;
        this.tagged_items = new ArrayList<>();
        this.main_selected = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    /**
     * Add an item to the list of tagged items
     * @param newItem
     * @return boolean indicating if the item was added
     */
    public boolean tagItem(Item newItem){
        try {
            tagged_items.add(newItem);
            return true; // returns true indicating item was added
        } catch (Exception e) {
            System.out.println(e.toString());
            return false; // returns false if unable to add the item
        }

    }

    public void untagItem(Item newItem){
        tagged_items.remove(newItem);
    }

    public void select_tag(){
        main_selected = true;
    }

    public void unselect_tag(){
        main_selected = false;
    }

    public boolean getStatus(){
        return main_selected;
    }

    public ArrayList<Item> getTagged_items(){return tagged_items;}

    public void setDocumentID(String ID){
        this.documentID = ID;
    }

    public String getDocumentID(){
        return documentID;
    }

}
