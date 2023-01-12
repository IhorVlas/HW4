package org.example.javaConfig;

import org.example.Song;

import java.util.List;
import java.util.Scanner;

public class ClassicalMusicPlayer {

    private List<Song> classicList;

    public ClassicalMusicPlayer(List<Song> classicList){this.classicList = classicList;}

    public void playClassic(){

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


        System.out.println("Выбран пункт: " + inputNumber);

        int i = Integer.parseInt(inputNumber);
        switch (i) {
            case 0 -> System.out.println("Выход из меню");
            case 1 -> System.out.println("Выбраная група: " + classicList.get(0).getAuthorName() + " песня: " + classicList.get(0).getSongName());
            case 2 -> System.out.println("Выбраная група: " + classicList.get(1).getAuthorName() + " песня: " + classicList.get(1).getSongName());
        }
        //sc.close();
    }
}
