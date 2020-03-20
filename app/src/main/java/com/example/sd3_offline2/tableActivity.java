package com.example.sd3_offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class tableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);




        Toast.makeText(tableActivity.this, "Try to contract with teacher by mail", Toast.LENGTH_SHORT).show();

    }
}
