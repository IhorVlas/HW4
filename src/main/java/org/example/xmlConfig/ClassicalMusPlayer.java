package org.example.xmlConfig;

import org.example.Song;

import java.util.List;
import java.util.Scanner;

public class ClassicalMusPlayer {

    private List<Song> classicSongs;

    public ClassicalMusPlayer() {
    }

    public ClassicalMusPlayer(List<Song> classicSongs) {
        this.classicSongs = classicSongs;
    }

    public void addSong(Song song) {
        classicSongs.add(song);
    }

    public void playClassic() {

        System.out.println("Выберите исполнителя:");
        System.out.println("1." + classicSongs.get(0).getAuthorName());
        System.out.println("2." + classicSongs.get(1).getAuthorName());
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
            case 1 -> System.out.println("Выбраная група: " + classicSongs.get(0).getAuthorName() + " песня: " + classicSongs.get(0).getSongName());
            case 2 -> System.out.println("Выбраная група: " + classicSongs.get(1).getAuthorName() + " песня: " + classicSongs.get(1).getSongName());
        }
        sc.close();
    }


}





