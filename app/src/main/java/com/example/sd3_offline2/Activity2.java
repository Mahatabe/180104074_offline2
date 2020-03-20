package com.example.sd3_offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {


    TextView  studentIDView, userIDView;
    Button tida,cb,tab,not;

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tida = (Button) findViewById(R.id.date);
        cb = (Button) findViewById(R.id.cob);
        tab = (Button) findViewById(R.id.info);
        not = (Button) findViewById(R.id.notice);


        Toast.makeText(Activity2.this, "Welcome", Toast.LENGTH_SHORT).show();

        studentIDView = (TextView) findViewById(R.id.studentID);
        userIDView = (TextView) findViewById(R.id.userID);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {



            String studentID = bundle.getString("studentId");
            String userID = bundle.getString("user");

            studentIDView.setText(studentID);
            userIDView.setText(userID);


        }


        tida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent five = new Intent(Activity2.this, TandD.class);
                startActivity(five);


            }
        });

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent four = new Intent(Activity2.this, CommentActivity.class);
                startActivity(four);


            }
        });


        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent two = new Intent(Activity2.this, tableActivity.class);
                startActivity(two);


            }
        });

        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent three = new Intent(Activity2.this, noticeActivity.class);
                startActivity(three);


            }
        });



    }
}
