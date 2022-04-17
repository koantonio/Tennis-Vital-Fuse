package com.example.tennis_vital_fuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Homepage extends AppCompatActivity implements View.OnClickListener {

    private Button MatchTracker;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        MatchTracker=(Button)findViewById(R.id.matchTracker);
        MatchTracker.setOnClickListener(this);

        logout=(Button)findViewById(R.id.signOut);
        logout.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.matchTracker:
                    startActivity(new Intent(this,MatchTracker.class));
                    break;
                case R.id.signOut:
                    FirebaseAuth.getInstance().signOut();
                    startActivity(new Intent(Homepage.this,MainActivity.class));
            }
        }
}
