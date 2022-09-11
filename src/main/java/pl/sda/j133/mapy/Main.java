package pl.sda.j133.mapy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 *
 * Utwórz klasę Student o polach (long) numerIndeksu, imie, nazwisko oraz:
 * utwórz kilku studentów i dodaj ich do mapy (kluczem jest indeks,
 * sprawdź czy mapa zawiera studenta o indeksie 100200,
 * wypisz studenta o indeksie 100400
 * wypisz listę studentów
 * wypisz listę indeksów
 *
 * Stwórz drugiego main’a i wykonaj te same instrukcje, ale zamień implementację z HashMap na TreeMap.
 */
public class Main {
    public static void main(String[] args) {
        Map<Long, Student> map = new HashMap<>();

        map.put(100200L, new Student(100200L, "Pawel", "Gawel"));
        map.put(100400L, new Student(100400L, "Gawel", "Pawel"));
        map.put(100600L, new Student(100600L, "Jan", "Pawel"));
        map.put(100800L, new Student(100800L, "Gawel", "Jan"));

//        Student x = new Student(101000L, "Burek", "Jan");

        if(map.containsKey(100200L)){
            System.out.println("Tak, zawiera");
        }
        System.out.println("-----");

        System.out.println("Mapa zawiera studenta o indeksie 100200: "+ map.containsKey(100200L));
        System.out.println("-----");

        System.out.println("Student 100400: " + map.get(100400L));
        System.out.println("-----");

        for(Student student : map.values()){
            System.out.println(student);
        }
        System.out.println("-----");

        for(Long index : map.keySet()){
            System.out.println(index);
        }
        System.out.println("-----");


    }
}
