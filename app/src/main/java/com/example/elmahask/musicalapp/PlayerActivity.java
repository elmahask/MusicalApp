package com.example.elmahask.musicalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        final ImageView imgPlayPause = findViewById(R.id.play_pause);
        imgPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.isClickable() == true) {
                    imgPlayPause.setImageResource(R.drawable.ic_pause_black_24dp);
                    imgPlayPause.setVisibility(View.VISIBLE);

                } else {
                    imgPlayPause.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                    imgPlayPause.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
