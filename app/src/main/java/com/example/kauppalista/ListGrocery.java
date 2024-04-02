package com.example.kauppalista;

import java.util.ArrayList;

public class ListGrocery {
    private ArrayList<Grocery> groceries = new ArrayList<>();
    private static ListGrocery listGrocery = null;
    public static ListGrocery getInstance(){
        if(listGrocery == null){
            listGrocery = new ListGrocery();
        }
        return listGrocery;
    }
    public void addGrocery(Grocery grocery){
        groceries.add(grocery);
    }

    public ArrayList<Grocery> getGroceries(){
        return groceries;
    }
}
