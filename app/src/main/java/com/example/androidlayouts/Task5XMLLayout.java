package com.example.androidlayouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Task5XMLLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5_xmllayout);

        Button btnLinearLay = findViewById(R.id.btnLinearLayout);
        Button btnRelativeLay = findViewById(R.id.btnRelativeLayout);
        Button btnTableLay = findViewById(R.id.btnTableLayout);
        Button btnScrollLay = findViewById(R.id.btnScrollLayout);
        Button btnOtherLay = findViewById(R.id.btnOtherLayouts);

        btnLinearLay.setOnClickListener( x -> {
            Intent intent = new Intent(Task5XMLLayout.this, Task5LinearLayout.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnRelativeLay.setOnClickListener( x -> {
            Intent intent = new Intent(Task5XMLLayout.this, RelativeLayoutExample.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnTableLay.setOnClickListener( x -> {
            Intent intent = new Intent(Task5XMLLayout.this, TableLayoutExample.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnScrollLay.setOnClickListener( x -> {
            Intent intent = new Intent(Task5XMLLayout.this, ScrollLayoutExample.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnOtherLay.setOnClickListener( x -> {
            Intent intent = new Intent(Task5XMLLayout.this, OtherLayoutExample.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}