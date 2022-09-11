package pl.sda.j133.sety;

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
        return false;
    }

    public static void main(String[] args) {
        System.out.println(zawieraDuplikaty("Ala ma kota"));    // true
        System.out.println(zawieraDuplikaty("kot"));            // false
        System.out.println(zawieraDuplikaty("ale Kot_MA"));     // true
    }
}
