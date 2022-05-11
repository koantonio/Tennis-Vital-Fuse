package com.example.tennis_vital_fuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PracticeTrackerSelection extends AppCompatActivity implements View.OnClickListener {

    private Button ForehandPractice;
    private Button BackhandPractice;
    private Button VolleyOverheadPractice;
    private Button ServePractice;
    private Button MiscPractice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_tracker_selection);

        ForehandPractice=(Button)findViewById(R.id.practice1);
        ForehandPractice.setOnClickListener(this);

        BackhandPractice=(Button)findViewById(R.id.practice2);
        BackhandPractice.setOnClickListener(this);

        VolleyOverheadPractice=(Button)findViewById(R.id.practice3);
        VolleyOverheadPractice.setOnClickListener(this);

        ServePractice=(Button)findViewById(R.id.practice4);
        ServePractice.setOnClickListener(this);

        MiscPractice=(Button)findViewById(R.id.practice5);
        MiscPractice.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.practice1:
                startActivity(new Intent(this,ForehandPracticeTracker.class));
                break;
            case R.id.practice2:
                startActivity(new Intent(this,BackhandPracticeTracker.class));
                break;
            case R.id.practice3:
                startActivity(new Intent(this,VolleyOverheadPracticeTracker.class));
                break;
            case R.id.practice4:
                startActivity(new Intent(this,ServePracticeTracker.class));
                break;
            case R.id.practice5:
                startActivity(new Intent(this,MiscPracticeTracker.class));
                break;
        }
    }
}