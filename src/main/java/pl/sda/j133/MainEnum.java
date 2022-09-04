package pl.sda.j133;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
//        BiletMiejski biletMiejski1 = BiletMiejski.NORMALNY;
//        BiletMiejski biletMiejski2 = BiletMiejski.NORMALNY;
//
//        System.out.println(biletMiejski1 == biletMiejski2); // true

        Scanner scanner = new Scanner(System.in);

        // for          - kiedy wiemy ile będzie iteracji
        // while        - kiedy pętla może nie wykonać się ani razu
        // do_while     - kiedy pętla musi wykonać się chociaż 1 raz

        boolean czyUdaloSieParsowacBilet = false;

        do {
            System.out.println("Podaj rodzaj biletu (ULGOWY_STUDENCKI, ULGOWY_SENIOR, NORMALNY...):");
            // załadować tekst (jedno słowo) ze scannera
            String zmienna = scanner.next(); // zmienna => Paweł
            zmienna = zmienna.toUpperCase(); // PAWEŁ

            // wypisz na ekran
            System.out.println(zmienna);

            try {
                // Parsowanie
                BiletMiejski zmiennaBilet = BiletMiejski.valueOf(zmienna);
                czyUdaloSieParsowacBilet = true;
                System.out.println(zmiennaBilet);
                System.out.println(zmiennaBilet.getCena());
            } catch (IllegalArgumentException iae) {
                System.err.println("Niepoprawna komenda, podaj poprawną nazwę biletu.");
                // wywoła się tylko w przypadku błędu
                czyUdaloSieParsowacBilet = false;
            }
        } while (!czyUdaloSieParsowacBilet); // wykonuj kod dopóki nie udało się parsować bilet
    }
}

//