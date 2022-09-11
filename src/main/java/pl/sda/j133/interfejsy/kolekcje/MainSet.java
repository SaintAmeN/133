package pl.sda.j133.interfejsy.kolekcje;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainSet {
    public static void main(String[] args) {
        // hash & hashcode - powiązane
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(15);
        set.add(15);
        set.add(15);
        set.remove(5);

        System.out.println(set);
        System.out.println(set.size());

        // equals:
        // - (Object) domyślnie porównuje porównując referencje/miejsce w pamięci
        // - powinien porównywać obiekty na podstawie zawartości tego obiektu

        // Istnieje niejawny kontrakt między metodą equals i hashcode
        //  - jeśli nadpisujemy, to musimy nadpisać obie!
        //  - [equals] powinien porównywać obiekty na podstawie pól
        //  - [hashcode] powinien być generowany obiekty na podstawie tych samych pól

//    "janek" -> hash() -> 521
//    "j" "a" "n" "e" "k"
//    106 + 97 + 110 + 101 + 107 -> 521

//    "kenaj" -> hash() -> 521
//    "k" "e" "n" "a" "j"
//    107 + 101 + 110 + 97 + 106 -> 521

        // Jeśli equals zwraca true, to hashcode musi być ten sam
        // Jeśli hashcode jest taki sam, to equals nie musi zwracać true

        // "janek" -> 521
        // "janek" -> 521
        // 521 -> dehash() -x(nie musi dać)-> kenaj

        // 2 * 8 -> 16
        // 4 * 4 -> 16
        // 4 * 4 -> 16
        // 16:
        //  - 1 * 16
        //  - 2 * 8
        //  - 16 * 1

        String a = "Siblings";
        String b = "Teheran";
        String c = "Siblings";

        System.out.println("Siblings: " + a + " " + a.hashCode() + " " + a.equals(b));
        System.out.println("Teheran:  " + b + " " + b.hashCode() + " " + b.equals(a));
        System.out.println("Siblings:  " + c + " " + c.hashCode() + " " + c.equals(a));
    }
}
