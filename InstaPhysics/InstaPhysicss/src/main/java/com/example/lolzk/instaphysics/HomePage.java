package com.example.lolzk.instaphysics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class HomePage extends AppCompatActivity {
    public Button button;
    public Button button2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        button = (Button) findViewById(R.id.buttonOptics);
        button2 = (Button) findViewById(R.id.buttonKinematics);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpticsActivity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKinematicsActivity();
            }
        });
    }

    public void openOpticsActivity() {
        Intent opener = new Intent(this, Optics.class);
        startActivity(opener);
    }

    public void openKinematicsActivity() {
        Intent opener2 = new Intent(this,Kinematics.class);
        startActivity(opener2);
    }
}
