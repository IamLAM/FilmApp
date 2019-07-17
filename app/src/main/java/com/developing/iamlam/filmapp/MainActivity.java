package com.developing.iamlam.filmapp;
import android.support.v4.content.ContextCompat;
import android.widget.Button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView movie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movie=findViewById(R.id.movies);
        Button buttonGravity=findViewById(R.id.gravity_button);
        Button buttonJumanji=findViewById(R.id.jumanji_button);
        Button buttonToy=findViewById(R.id.toy_story_button);
        Button buttonJurassic=findViewById(R.id.jurassic_button);
        Button buttonFantastico=findViewById(R.id.fantastico_button);
        Button buttonAvengers=findViewById(R.id.avengers_button);

        buttonGravity.setOnClickListener(this);
        buttonJumanji.setOnClickListener(this);
        buttonToy.setOnClickListener(this);
        buttonJurassic.setOnClickListener(this);
        buttonFantastico.setOnClickListener(this);
        buttonAvengers.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int buttonId=view.getId();
        int imageId=0;

        switch(buttonId){

            case R.id.gravity_button:
             imageId=R.drawable.gravity;
            break;
            case R.id.jumanji_button:
                imageId=R.drawable.jumanji;
                break;
            case R.id.toy_story_button:
                imageId=R.drawable.toystory;

                break;
            case R.id.jurassic_button:
                imageId=R.drawable.jurassic;

                break;
            case R.id.fantastico_button:
                imageId=R.drawable.fantastico;
                break;
            case R.id.avengers_button:
                imageId=R.drawable.avengers;
                break;

        }

        movie.setImageDrawable(ContextCompat.getDrawable(this,imageId));

    }
}
