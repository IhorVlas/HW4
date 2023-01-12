package org.example.javaConfig;

import org.example.Song;

import java.util.List;
import java.util.Scanner;

public class RockMusicPlayer {

    private List<Song> rockList;

    public RockMusicPlayer(List<Song> rockList){this.rockList = rockList;}

    public void playRock(){

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


        System.out.println("Выбран пункт: " + inputNumber);

        int i = Integer.parseInt(inputNumber);
        switch (i) {
            case 0 -> System.out.println("Выход из меню");
            case 1 -> System.out.println("Выбраная група: " + rockList.get(0).getAuthorName() + " песня: " + rockList.get(0).getSongName());
            case 2 -> System.out.println("Выбраная група: " + rockList.get(1).getAuthorName() + " песня: " + rockList.get(1).getSongName());
        }
        //sc.close();
    }

}
