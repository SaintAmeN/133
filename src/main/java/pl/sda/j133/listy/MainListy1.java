package pl.sda.j133.listy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainListy1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę:");
            int liczbaUzytkownika = scanner.nextInt();

            list.add(liczbaUzytkownika);
        }

//        Generowanie liczb, opcja 1
//        double liczba = Math.random()*1000; // 0.0 -> 1000.0

//        Generowanie liczb, opcja 2
        Random generator = new Random();
//        int wygenerowanaLiczba = generator.nextInt(100);

        for (int i = 0; i < 5; i++) {
            int liczbaWygenerowana = generator.nextInt(100);

            list.add(liczbaWygenerowana);
        }

        System.out.println(list);
    }
}
