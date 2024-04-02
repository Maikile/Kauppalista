package com.example.kauppalista;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddGroceryActivity extends AppCompatActivity {
    private EditText groceryName;
    private EditText groceryNote;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_grocery);

        groceryName = findViewById(R.id.editGroceryName);
        groceryNote = findViewById(R.id.editGroceryNote);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }


    public void addGrocery(View view){
        String name = String.valueOf(groceryName.getText());
        String note = String.valueOf(groceryNote.getText());
        Grocery grocery = new Grocery(name,note);
        ListGrocery.getInstance().addGrocery(grocery);
    }
}