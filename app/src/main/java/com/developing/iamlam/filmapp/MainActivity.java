package com.developing.iamlam.filmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGravity=findViewById(R.id.gravity_button);
        Button buttonJumanji=findViewById(R.id.jumanji_button);
        Button buttonToy=findViewById(R.id.toy_story_button);
        Button buttonJurassic=findViewById(R.id.jurassic_button);
        Button buttonFantastico=findViewById(R.id.fantastico_button);
        Button buttonAvengers=findViewById(R.id.avengers_button);

        buttonGravity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int buttonId=view.getId();

    }
}
