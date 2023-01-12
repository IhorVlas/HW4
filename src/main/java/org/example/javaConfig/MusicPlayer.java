package org.example.javaConfig;

public class MusicPlayer {

    ClassicalMusicPlayer classicalMusicPlayer;
    RockMusicPlayer rockMusicPlayer;

    public MusicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayer){
        this.classicalMusicPlayer = classicalMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }

    public void playClassic(){
        classicalMusicPlayer.playClassic();
    }

    public void playRock(){
        rockMusicPlayer.playRock();
    }

}
