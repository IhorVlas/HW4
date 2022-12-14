package org.example;

public class Song {

    private String songName;
    private String authorName;

    public Song(String songName, String authorName) {
        this.songName = songName;
        this.authorName = authorName;
    }


    public Song(){}

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Song{" +
               "songName='" + songName + '\'' +
               ", authorName='" + authorName + '\'' +
               '}';
    }
}
