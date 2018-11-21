package com.example.lolzk.instaphysicss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Optics extends AppCompatActivity {

    public Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optics);
        button1 = findViewById(R.id.button23);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoMainMenu2();
            }
        });
    }

    public void backtoMainMenu2() {
        Intent backfunction = new Intent(this, HomePage.class);
        startActivity(backfunction);
    }
}
