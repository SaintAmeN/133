package pl.sda.j133.sety;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 * <p>
 * Napisz statyczną metodę sprawdzającą,
 * czy w tekście nie powtarzają się litery z wykorzystaniem zbioru.
 * <p>
 * (boolean zawieraDuplikaty(String text))
 */
public class MainZadanie2 {

    private static boolean zawieraDuplikaty(String text) {
        // "Ala ma kota"


        // dodajemy do setu, wynik:
        // [ 'A' 'l' 'a' ' ' 'm' 'k' 'o' 't' ]
        char[] characters = text.toCharArray();

        List<Character> list = new ArrayList<>();
        for (char character : characters) {
            list.add(character);
        }
        // [ 'A' 'l' 'a' ' ' 'm' 'a' ' ' 'k' 'o' 't' 'a' ]
        //            ^           ^                   ^
        // zawiera duplikaty: tak

        Set<Character> set = new HashSet<>(list);

        // [ 'A' 'l' 'a' ' ' 'm' 'a' ' ' 'k' 'o' 't' 'a' ]
        // [ 'A' 'l' 'a' ' ' 'm' 'k' 'o' 't' ]

//        if rozmiar jest taki sam => nie ma duplikatów
        return set.size() != list.size();
        // jeśli różnią się długością, to znaczy że jakaś litera
        // została usunięta z setu jako duplikat, więc zawiera duplikaty = true
    }

    public static void main(String[] args) {
        System.out.println(zawieraDuplikaty("Ala ma kota"));    // true
        System.out.println(zawieraDuplikaty("kot"));            // false
        System.out.println(zawieraDuplikaty("ale Kot_MA"));     // false
    }
}
