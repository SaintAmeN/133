package pl.sda.j133.sety;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainSetSlowa {
    public static boolean zawieraSlowaDuplikaty(String tekst) {
        // Rozbicie tekstu na słowa
        String[] słowa = tekst.split(" ");

        // Dodanie elementów tablicy do listy
        List<String> lista = Arrays.asList(słowa);

        // Dodanie elementów listy do zbioru
        Set<String> zbiór = new HashSet<>(lista);

        // Porównanie wielkości
        return lista.size() != zbiór.size();
    }

    public static void main(String[] args) {
        // ala ma kota                   // false
        // ala ala ale alą               // true
        // ala ma kota a kot ma ale      // true
    }
}
