package org.example.annotationConfig;

import org.example.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component("rockMusicPlayer")
public class RockMusicPlayer {

    List<Song> rockList = new ArrayList();

    @PostConstruct
    public void init() {
        Song song1 = new Song();
        song1.setSongName("Creep");
        song1.setAuthorName("Radiohead");

        Song song2 = new Song();
        song2.setSongName("Yellow");
        song2.setAuthorName("Coldplay");

        rockList.add(song1);
        rockList.add(song2);
    }

    public void playRock() {
        init();
        System.out.println("Выберите исполнителя:");
        System.out.println("1." + rockList.get(0).getAuthorName());
        System.out.println("2." + rockList.get(1).getAuthorName());
        System.out.println("0. Выход");

        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.next();

        String range = "[0-2]{1}";

        while (!inputNumber.matches(range)) {
            System.out.println("такого пункта нет");
            System.out.println("повторите попытку");
            inputNumber = sc.next();
        }
        sc.close();

        System.out.println("Выбран пункт: " + inputNumber);

        int i = Integer.parseInt(inputNumber);
        switch (i) {
            case 0 -> System.out.println("Выход из меню");
            case 1 -> System.out.println("Выбраная група: " + rockList.get(0).getAuthorName());
            case 2 -> System.out.println("Выбраная група: " + rockList.get(1).getAuthorName());
        }
    }
}



