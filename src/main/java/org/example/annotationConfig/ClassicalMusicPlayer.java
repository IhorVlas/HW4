package org.example.annotationConfig;

import org.example.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    @Component("classicalMusicPlayer")
    public class ClassicalMusicPlayer {

        List<Song> classicList = new ArrayList();

        @PostConstruct
        public void init() {
            Song song1 = new Song();
            song1.setSongName("Symphony No. 9");
            song1.setAuthorName("Ludwig van Beethoven");

            Song song2 = new Song();
            song2.setSongName("Elvira Madigan");
            song2.setAuthorName("Wolfgang Amadeus Mozart");

            classicList.add(song1);
            classicList.add(song2);
        }

        public void playClassic() {
            init();
            System.out.println("Выберите исполнителя:");
            System.out.println("1." + classicList.get(0).getAuthorName());
            System.out.println("2." + classicList.get(1).getAuthorName());
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
                case 1 -> System.out.println("Выбраная група: " + classicList.get(0).getAuthorName() + " песня: " + classicList.get(0).getSongName());
                case 2 -> System.out.println("Выбраная група: " + classicList.get(1).getAuthorName() + " песня: " + classicList.get(1).getSongName());
            }
        }
    }
