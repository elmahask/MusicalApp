package com.example.elmahask.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView playerCV, playlistCV, albumsCV, artistsCV, settingsCV, buySongsCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerCV = findViewById(R.id.menuPlayer);
        playlistCV = findViewById(R.id.menuPlaylists);
        artistsCV = findViewById(R.id.menuArtists);
        albumsCV = findViewById(R.id.menuAlbums);
        buySongsCV = findViewById(R.id.menuStore);
        settingsCV = findViewById(R.id.menuSettings);

        playerCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayerActivity.class));
            }
        });
        playlistCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayListActivity.class));
            }
        });
        artistsCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ArtistActivity.class));
            }
        });
        albumsCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AlbumActivity.class));
            }
        });
        buySongsCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BuySongActivity.class));
            }
        });
        settingsCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });
    }
}
