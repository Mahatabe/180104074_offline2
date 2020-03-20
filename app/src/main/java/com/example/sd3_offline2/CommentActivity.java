package com.example.sd3_offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class CommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);


        Toast.makeText(CommentActivity.this, "Write here", Toast.LENGTH_SHORT).show();


    }
}
