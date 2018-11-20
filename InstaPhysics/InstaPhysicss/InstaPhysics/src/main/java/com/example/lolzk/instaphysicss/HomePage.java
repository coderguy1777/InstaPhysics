package com.example.lolzk.instaphysicss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class HomePage extends AppCompatActivity {
    public Button button;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        button = (Button) findViewById(R.id.buttonOptics);
        button2 = (Button) findViewById(R.id.buttonKinematics);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.buttonKinematics2);
        button5 = (Button) findViewById(R.id.thermo);
        button6 = (Button) findViewById(R.id.particlephysics);
        button7 = (Button) findViewById(R.id.mechanics);
        button8 = (Button) findViewById(R.id.threedvectors);
        button9 = (Button) findViewById(R.id.twodvectors);

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
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWaveActivity();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMagnetismActivity();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openThermoActivity();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openParticlePhysicsActivity();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMechanicsActivity();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openThreeDVectorsActivity();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTwoDVectorsActivity();
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

    public void openWaveActivity() {
        Intent opener3 = new Intent(this, Waves.class);
        startActivity(opener3);
    }

    public void openMagnetismActivity() {
        Intent opener4 = new Intent(this, Magnetism.class);
        startActivity(opener4);

    }

    public void openThermoActivity() {
        Intent opener5 = new Intent(this, Thermodynamics.class);
        startActivity(opener5);
    }

    public void openParticlePhysicsActivity() {
        Intent opener6 = new Intent(this, ParticlePhysics.class);
        startActivity(opener6);
    }

    public void openMechanicsActivity() {
        Intent opener7 = new Intent(this, Mechanics.class);
        startActivity(opener7);
    }

    public void openThreeDVectorsActivity() {
        Intent opener8 = new Intent(this, ThreeDVector.class);
        startActivity(opener8);
    }

    public void openTwoDVectorsActivity() {
        Intent opener9 = new Intent(this, TwoDVectors.class);
        startActivity(opener9);
    }
}