package com.example.kauppalista;

public class Grocery {
    protected String name;
    protected String note;

    public Grocery(String name,String note){
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getNote(){
        return note;
    }
}
