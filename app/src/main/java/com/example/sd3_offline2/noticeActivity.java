package com.example.sd3_offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class noticeActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView image1view,image2view,image3view,image4view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);


        Toast.makeText(noticeActivity.this, "Get the latest news", Toast.LENGTH_SHORT).show();


        image1view = (ImageView) findViewById(R.id.one);
        image2view = (ImageView) findViewById(R.id.two);
        image3view = (ImageView) findViewById(R.id.three);
        image4view = (ImageView) findViewById(R.id.four);

        image1view.setOnClickListener(this);
        image2view.setOnClickListener(this);
        image3view.setOnClickListener(this);
        image4view.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.one)
        {

            image1view.setVisibility(v.GONE);
            image2view.setVisibility(v.VISIBLE);

        }

        if(v.getId()==R.id.two)
        {

            image2view.setVisibility(v.GONE);
            image3view.setVisibility(v.VISIBLE);

        }

        if(v.getId()==R.id.three)
        {

            image3view.setVisibility(v.GONE);
            image4view.setVisibility(v.VISIBLE);

        }

        if(v.getId()==R.id.four)
        {

            image4view.setVisibility(v.GONE);
            image1view.setVisibility(v.VISIBLE);

        }





    }
}
