package com.example.elmahask.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BuySongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_song);

        ArrayList<Song> song = new ArrayList<Song>();
        song.add(new Song("welcome1", "wael"));
        song.add(new Song("welcome2", "wael mohamed"));
        song.add(new Song("welcome3", "wael ahmed"));
        song.add(new Song("welcome4", "wael elmahask"));
        song.add(new Song("welcome5", "wael programmer"));
        song.add(new Song("welcome6", "wael xfox"));
        //song.add(new Song("w", "w", R.drawable.image_player));

        final SongAdapter itemsAdapter = new SongAdapter(this, song);


        ListView listView = findViewById(R.id.listBuy);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                Song s = itemsAdapter.getItem(position);

//                String text = ((TextView) v).getText().toString();
//                YourImageClass img = mImages[position];
//                Intent i = new Intent(PlayListActivity.this, PlayerActivity.class);
//                i.putExtra("TEXT", text);
//                i.putExtra("IMAGE", img);
//                startActivity(i);
                Toast.makeText(getBaseContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
