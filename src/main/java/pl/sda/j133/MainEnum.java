package pl.sda.j133;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        BiletMiejski biletMiejski1 = BiletMiejski.NORMALNY;
        BiletMiejski biletMiejski2 = BiletMiejski.NORMALNY;

        System.out.println(biletMiejski1 == biletMiejski2); // true

        Scanner scanner = new Scanner(System.in);

        // załadować tekst (jedno słowo) ze scannera
        String zmienna = scanner.next(); // Paweł
        zmienna = zmienna.toUpperCase();

        // wypisz na ekran
        System.out.println(zmienna);     // PAWEŁ

        // Parsowanie
        BiletMiejski zmiennaBilet = BiletMiejski.valueOf(zmienna);

        System.out.println(zmiennaBilet);
        System.out.println(zmiennaBilet.getCena());
    }
}

//