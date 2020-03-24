package com.example.buttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button CrimereportB;
    private Button CrimemapB;
    private Button ForumB;
    private Button PersonreportB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Crime report button link
        CrimereportB = findViewById(R.id.button);

        CrimereportB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                activityCrimeReport();
            }
        });
        //Crime Map button link
        CrimemapB = findViewById(R.id.button1);

        CrimemapB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                activityCrimeMap();
            }
        });
        //Crime Forum button link
        ForumB = findViewById(R.id.button2);

        ForumB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                activityForum();
            }
        });
        //Crime Person Report button link
        PersonreportB = findViewById(R.id.button3);

        PersonreportB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                activityPersonReport();
            }
        });


    }
    // all activities to change the page
    public void activityCrimeReport(){
        Intent intent = new Intent(this, crimeReport.class);
        startActivity(intent);
    }
    public void activityCrimeMap(){
        Intent intent = new Intent(this, crimeMap.class);
        startActivity(intent);
    }
    public void activityForum(){
        Intent intent = new Intent(this, forum.class);
        startActivity(intent);
    }
    public void activityPersonReport(){
        Intent intent = new Intent(this, personReport.class);
        startActivity(intent);
    }
}