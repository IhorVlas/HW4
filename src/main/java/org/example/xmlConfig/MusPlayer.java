package org.example.xmlConfig;

public class MusPlayer {
    private ClassicalMusPlayer classicalMusPlayer;
    private RockMusPlayer rockMusPlayer;

    public MusPlayer(){}

    public MusPlayer(RockMusPlayer rockMusPlayer, ClassicalMusPlayer classicalMusPlayer){
        this.classicalMusPlayer = classicalMusPlayer;
        this.rockMusPlayer = rockMusPlayer;
    }

    public void playClassicMus(){classicalMusPlayer.playClassic();}
    public void playRockMus(){rockMusPlayer.playRock();}

}
