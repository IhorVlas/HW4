package org.example.javaConfig;

import org.example.annotationConfig.MusicPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        ApplicationContext acontext = new AnnotationConfigApplicationContext(ConfigClass.class);

        System.out.println("Выберите жанр музыки:");
        System.out.println("1." + "Рок");
        System.out.println("2." + "Классическая");
        System.out.println("0. Выход");

        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.next();

        String range = "[0-2]{1}";

        while (!inputNumber.matches(range)) {
            System.out.println("такого пункта нет");
            System.out.println("повторите попытку");
            inputNumber = sc.next();
        }
        // sc.close();

        System.out.println("Выбран пункт: " + inputNumber);

        int i = Integer.parseInt(inputNumber);
        switch (i) {
            case 0: {System.out.println("Выход из меню");
                break;}
            case 1: {System.out.println("рок музыка: ");
                org.example.javaConfig.MusicPlayer musicPlayer = acontext.getBean("musicPlayer", org.example.javaConfig.MusicPlayer.class);
                musicPlayer.playRock();
                break;}
            case 2: { System.out.println("классическая музыка");
                org.example.javaConfig.MusicPlayer musicPlayer = acontext.getBean("musicPlayer", org.example.javaConfig.MusicPlayer.class);
                musicPlayer.playClassic();
                break;}
        }
    }
    }

