package com.example.kauppalista;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroceryViewHolder extends RecyclerView.ViewHolder{
    TextView name, note;
    public GroceryViewHolder(@NonNull View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.textGroceryName);
        note = itemView.findViewById(R.id.textGroceryNote);
    }
}
