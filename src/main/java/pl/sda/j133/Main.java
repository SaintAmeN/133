package pl.sda.j133;

/**
 * @author Paweł Recław, AmeN
 * @project podstawy
 * @created 04.09.2022
 */
public class Main {
    public static void main(String[] args) {
        // proste
        // boolean |8 byte char |16 short |32 int float |64 double long

        // złożone
        // Przykład: Integer, String
        // Typ złożony to typ obiektowy, zadeklarowany:
        //  - nazwą rozpoczynającą się wielką literą,
        //  - z polami,
        //  - z metodami,
        //  - z konstruktorami
        //  - dziedziczy po klasie Object


        Miś jakoś1 = new Miś("Marian");

        jakoś1.przedstawSie();

        System.out.println(jakoś1);
    }
}
