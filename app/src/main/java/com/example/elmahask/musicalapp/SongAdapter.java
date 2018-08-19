package com.example.elmahask.musicalapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Activity context, ArrayList<Song> song) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, song);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_layout, parent, false);
        }

        Song currentSong = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentSong.getSongName());

        TextView numberTextView = listItemView.findViewById(R.id.artist_name);
        numberTextView.setText(currentSong.getArtistName());

//        ImageView iconView = listItemView.findViewById(R.id.img);
//        iconView.setImageResource(currentSong.getImageResourceId());

        return listItemView;
    }
}
