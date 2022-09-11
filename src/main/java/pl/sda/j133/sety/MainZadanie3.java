package pl.sda.j133.sety;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainZadanie3 {
    public static void main(String[] args) {
        Set<ParaLiczb> set = new HashSet<>();

        set.add(new ParaLiczb(1, 2));
        set.add(new ParaLiczb(1, 2));
        set.add(new ParaLiczb(2, 1));
        set.add(new ParaLiczb(1, 1));

        // equals       domyślnie porównuje :   adres/referencje/miejsce w pamięci
        // hashcode     domyślnie hasuje    :   adres/referencje/miejsce w pamięci
        System.out.println(set);                    // 3 elementy
        System.out.println(set.size());             // 3
    }
}
