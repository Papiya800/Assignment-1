package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RecipeApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_app);

        ImageView recipeImageView=findViewById(R.id.recipeImageView);
        TextView recipeNameTextView= findViewById(R.id.recipeNameTextView);
        TextView recipeDescriptionTextView = findViewById(R.id.recipeDescriptionTextView);
        Button FoodButton= findViewById(R.id.FoodButton);
        Button DrinksButton= findViewById(R.id.DrinksButton);

        FoodButton.setOnClickListener(v -> {

            Intent intent = new Intent(RecipeApp.this,food.class);
            startActivity(intent);


        });
        DrinksButton.setOnClickListener(v -> {

            Intent intent = new Intent(RecipeApp.this,drink.class);
            startActivity(intent);


        });
    }

}
