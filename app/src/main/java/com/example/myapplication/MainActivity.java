package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_app);


        findViewById(R.id.recipeImageView1);
        findViewById(R.id.recipeNameTextView2);
        findViewById(R.id.recipeDescriptionTextView3);
        Button foodButton = findViewById(R.id.FoodButton);
        Button drinksButton = findViewById(R.id.DrinksButton);


        foodButton.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Food Button Clicked", Toast.LENGTH_SHORT).show());

        drinksButton.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Drinks Button Clicked", Toast.LENGTH_SHORT).show());
    }

}

