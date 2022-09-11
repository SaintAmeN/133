package pl.sda.j133.sety;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainZadanie6 {
    public static void main(String[] args) {
        Obywatel o1 = new Obywatel("Jan", "Kowalski", "1231234");
        Obywatel o2 = new Obywatel("Marian", "Nowak", "3213214");
        Obywatel o3 = new Obywatel("Olek", "Bolek", "3331115");
        Obywatel o4 = new Obywatel("Marian", "Roztocki", "1231234");

        Set<Obywatel> obywatelSet = new HashSet<>();
        obywatelSet.add(o1);
        obywatelSet.add(o2);
        obywatelSet.add(o3);
        obywatelSet.add(o4);

        System.out.println(obywatelSet);
    }
}
