package pl.sda.j133.interfejsy.kolekcje;

import pl.sda.j133.Miś;
import pl.sda.j133.dziedziczenie.Ptak;
import pl.sda.j133.interfejsy.podstawy.Okno;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class Main {
    public static void main(String[] args) {
//        // 100 x Okno
//        Okno[] okna = new Okno[100];
//
//        // 100 okien i dodaje nowe okno (101)
//        Okno[101] = new Okno();

        // Programowanie to zdolność odpowiedniego kontrolowania obiektów w kolekcjach
        // 3 rodzaje kolekcji: List, Set, Map
        List<String> list = new ArrayList<>(2000);
        list.add("tekst");                     //    tablica[0] = "tekst"
        list.add(0, "coś innego");
        System.out.println(list.get(0));       //... tablica[0]
        list.remove("tekst");                //    tablica[0] = null

    }
}
