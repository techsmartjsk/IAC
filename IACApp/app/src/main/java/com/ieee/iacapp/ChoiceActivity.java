package com.ieee.iacapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ieee.iacapp.navigation.HomeFragment;

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
                Intent intent = new Intent(ChoiceActivity.this, HomeFragment.class);
                startActivity(intent);
            }
        });
    }
}