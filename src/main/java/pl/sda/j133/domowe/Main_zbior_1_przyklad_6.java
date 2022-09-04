package pl.sda.j133.domowe;

import java.util.Scanner;

public class Main_zbior_1_przyklad_6 {
//    6. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera i potem wypisz największą i najmniejszą z
//              nich uwzględniając podane liczby ujemne

    public static void main(String[] args) {
        // Przykład 1:
        // 1 2 3 4 5
        //
        // Max: 5
        // Min: 1
        //
        // Przykład 2:
        // -5 1 -300 2 3 -19 0 0  4 -10 5
        //
        // Max: 5
        // Min: -300

        Scanner scanner = new Scanner(System.in);

        // zadeklaruj licznik
        int licznik = 0;

        //
        // w pętli...
        // for          - kiedy wiemy ile będzie iteracji
        // while        - kiedy pętla może nie wykonać się ani razu
        // do_while     - kiedy pętla musi wykonać się chociaż 1 raz

        // [ -300, .. 5, 9, 1000 ]
        //    ^^             ^^


        // 1 1 1 1 1
        int minWartość = Integer.MAX_VALUE; // dzięki temu jakakolwiek wartość będzie mniejsza od niej i zastąpi tą
        int maxWartość = Integer.MIN_VALUE; // dzięki temu jakakolwiek wartość będzie większa od niej i zastąpi ją
        do {
            // przyjmujemy liczby
            int liczba = scanner.nextInt();

            // jeśli liczba > 0
            if (liczba > 0) {
                //      zwiększ licznik
                licznik++;
            }

            if (minWartość > liczba){
                minWartość = liczba;
            }

            if (maxWartość < liczba) {
                maxWartość = liczba;
            }

            // jeśli licznik >= 5
            //      wyskocz z pętli
        } while (licznik < 5);

        System.out.println("Min: "+ minWartość);
        System.out.println("Max: "+ maxWartość);
    }
}
