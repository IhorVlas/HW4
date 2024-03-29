package org.example.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext mContext = new ClassPathXmlApplicationContext("appConfig.xml");

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

        System.out.println("Выбран пункт: " + inputNumber);

        int i = Integer.parseInt(inputNumber);
        switch (i) {
            case 0: {System.out.println("Выход из меню");
                break;}
            case 1: {System.out.println("рок музыка: ");
                org.example.xmlConfig.MusPlayer musicPlayer = mContext.getBean("musicPlayer", org.example.xmlConfig.MusPlayer.class);
                musicPlayer.playRockMus();
                break;}
            case 2: { System.out.println("классическая музыка");
                org.example.xmlConfig.MusPlayer musicPlayer = mContext.getBean("musicPlayer", org.example.xmlConfig.MusPlayer.class);
                musicPlayer.playClassicMus();
                break;}
        }
    }

    }

