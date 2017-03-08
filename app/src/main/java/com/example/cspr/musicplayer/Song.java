package com.example.cspr.musicplayer;

/**
 * Created by cspr on 21.12.2015.
 */
public class Song {
    private long id;
    private String title;
    private String artist;
    public long getID(){return this.id;}
    public String getTitle(){return this.title;}
    public String getArtist(){return this.artist;}
    public Song(long songID, String songTitle, String songArtist) {
        this.id=songID;
        this.title=songTitle;
        this.artist=songArtist;
    }

}
