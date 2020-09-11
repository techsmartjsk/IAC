package com.ieee.iacapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class ChoiceActivity extends AppCompatActivity {
    CardView join, explore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        join = findViewById(R.id.ieee);
        explore = findViewById(R.id.explore);

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //App Navigation Activity
            }
        });
    }
}