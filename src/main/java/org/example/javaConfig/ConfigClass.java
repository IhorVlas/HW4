package org.example.javaConfig;

import org.example.Song;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.example.javaConfig")

public class ConfigClass {

    @Bean
    public Song classicSong1(){
        Song classicSong1 = new Song();
        classicSong1.setSongName("Symphony No. 9");
        classicSong1.setAuthorName("Ludwig van Beethoven");
        return classicSong1;
    }

    @Bean
    public Song classicSong2(){
        Song classicSong2 = new Song();
        classicSong2.setSongName("Elvira Madigan");
        classicSong2.setAuthorName("Wolfgang Amadeus Mozart");
        return classicSong2;
    }

    @Bean
    public Song rockSong1(){
        Song rockSong1 = new Song();
        rockSong1.setSongName("Creep");
        rockSong1.setAuthorName("Radiohead");
        return rockSong1;
    }

    @Bean
    public Song rockSong2(){
        Song rockSong2 = new Song();
        rockSong2.setSongName("Yellow");
        rockSong2.setAuthorName("Coldplay");
        return rockSong2;
    }

    @Bean
    public List<Song> classicList(){return Arrays.asList(classicSong1(), classicSong2());  }
    @Bean
    public List<Song> rockList(){return Arrays.asList(rockSong1(), rockSong2());  }
    @Bean
    public ClassicalMusicPlayer classicalMusicPlayer() {return new ClassicalMusicPlayer(classicList());  }
    @Bean
    public RockMusicPlayer rockMusicPlayer() {return new RockMusicPlayer(rockList());  }
    @Bean
    public MusicPlayer musicPlayer(){return new MusicPlayer(classicalMusicPlayer(), rockMusicPlayer());}

}
