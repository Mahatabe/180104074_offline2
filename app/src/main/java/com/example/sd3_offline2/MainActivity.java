package com.example.sd3_offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button enterbutton;
    EditText sendUserIDText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       enterbutton = (Button) findViewById(R.id.eb);
       sendUserIDText = (EditText) findViewById(R.id.userID);


       enterbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String userID = sendUserIDText.getText().toString();

               Intent one = new Intent(MainActivity.this, Activity2.class);



               one.putExtra("user", userID);
               one.putExtra("studentId","20201004027");

               startActivity(one);

           }
       });


    }
}
