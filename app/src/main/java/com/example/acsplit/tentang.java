package com.example.acsplit;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class tentang extends AppCompatActivity {
    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        back = findViewById(R.id.back);

        back.setOnClickListener(view -> {
            Intent intent = new Intent(tentang.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}