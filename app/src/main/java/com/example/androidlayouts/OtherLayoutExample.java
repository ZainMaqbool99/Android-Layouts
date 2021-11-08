package com.example.androidlayouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OtherLayoutExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_layout_example);

        Button btnAbsoluteLay = findViewById(R.id.btnAbsoluteLayout);

        btnAbsoluteLay.setOnClickListener(x->{
            Intent intent = new Intent(OtherLayoutExample.this, AbsoluteLayoutExample.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}