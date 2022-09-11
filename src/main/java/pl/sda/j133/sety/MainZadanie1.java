package pl.sda.j133.sety;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainZadanie1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));
        //Hash-> [3, 4, 55, 40, 10, 12, 300]
        //Tree-> [3, 4, 10, 12, 40, 55, 300]

        System.out.println(set);

        System.out.println("----------");
        for (Integer liczba : set) {
            System.out.println(liczba);
        }
        System.out.println("----------");

        set.remove(10);
        set.remove(12);
        System.out.println("----------");
        System.out.println(set);

        System.out.println("----------");
        for (Integer liczba : set) {
            System.out.println(liczba);
        }
        System.out.println("----------");
    }
}
