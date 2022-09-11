package pl.sda.j133.sety;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainSetSlowa {
    public static boolean zawieraSlowaDuplikaty(String tekst) {
        return false;
    }

    public static void main(String[] args) {
        // ala ma kota                   // false
        // ala ala ale alą               // true
        // ala ma kota a kot ma ale      // true
    }
}
