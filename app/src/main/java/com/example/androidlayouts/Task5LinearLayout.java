package com.example.androidlayouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Task5LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5_linear_layout);

        Button btnOri = findViewById(R.id.btnOrientation);
        Button btnMP = findViewById(R.id.btnMatchParent);
        Button btnWeight = findViewById(R.id.btnWeight);
        Button btnGravity = findViewById(R.id.btnGravity);
        Button btnPad = findViewById(R.id.btnPadding);
        Button btnMargin = findViewById(R.id.btnMargin);

        btnOri.setOnClickListener(x ->{
            Intent intent = new Intent(Task5LinearLayout.this, LinearLayoutOrientation.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnMP.setOnClickListener(x ->{
            Intent intent = new Intent(Task5LinearLayout.this, LinearLayoutMatchParent.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnWeight.setOnClickListener(x ->{
            Intent intent = new Intent(Task5LinearLayout.this, LinearLayoutWeight.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnGravity.setOnClickListener(x ->{
            Intent intent = new Intent(Task5LinearLayout.this, LinearLayoutGravity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnPad.setOnClickListener(x ->{
            Intent intent = new Intent(Task5LinearLayout.this, LinearLayoutPadding.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnMargin.setOnClickListener(x ->{
            Intent intent = new Intent(Task5LinearLayout.this, LinearLayoutMargin.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

    }
}