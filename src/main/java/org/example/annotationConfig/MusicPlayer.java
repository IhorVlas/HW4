package org.example.annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

  ClassicalMusicPlayer classicalMusicPlayer;
  RockMusicPlayer rockMusicPlayer;

  @Autowired
   public MusicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayer){
     this.classicalMusicPlayer = classicalMusicPlayer;
     this.rockMusicPlayer = rockMusicPlayer;
  }

  public void playClassic(){classicalMusicPlayer.playClassic();}
   public void playRock(){rockMusicPlayer.playRock();}

}
