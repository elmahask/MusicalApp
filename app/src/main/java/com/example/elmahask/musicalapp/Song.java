package com.example.elmahask.musicalapp;

public class Song {
    private String songName;
    private String artistName;
    private int img;


    public Song(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }

    public Song(String songName, String artistName, int img) {
        this.songName = songName;
        this.artistName = artistName;
        this.img = img;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
