package com.example.lolzk.instaphysicss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class ParticlePhysics extends AppCompatActivity {

    public Button mainmenubutton;
    public Button particleformulasbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particle_physics);
        mainmenubutton = (Button) findViewById(R.id.backbutton1);
        particleformulasbutton = (Button) findViewById(R.id.formulas);

        mainmenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoMainMenu();
            }
        });
        particleformulasbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulasOpenerforMasterFlowActivity();
            }
        });
    }

    public void backtoMainMenu() {
        Intent back1 = new Intent(this, HomePage.class);
        startActivity(back1);
    }

    public void formulasOpenerforMasterFlowActivity() {
        Intent formulasparticlesection = new Intent(this, FormulaListActivity.class);
        startActivity(formulasparticlesection);
    }
}
