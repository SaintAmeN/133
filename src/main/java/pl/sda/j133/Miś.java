package pl.sda.j133;

import java.util.Objects;

/**
 * @author Paweł Recław, AmeN
 * @project podstawy
 * @created 04.09.2022
 */
public class Miś {
    private String imie;
    private int wiek;
    private String pesel;

    // public       - w projekcie
    // protected    - w pakiecie i w klasach dziedziczących
    // ''           - w pakiecie
    // private      - w klasie

    public Miś() {
    }

    public Miś(String name) {
        this.imie = name;
    }

    public void przedstawSie() {
        System.out.println("Jestem sobie: " + imie);
    }

    @Override
    public String toString() {
        return "Miś{" +
                "imie='" + imie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Miś miś = (Miś) o;
        return wiek == miś.wiek && Objects.equals(imie, miś.imie) && Objects.equals(pesel, miś.pesel);
    }
//    "Janek" -> hash() -> 6546587
//    "Janek" -> hash() -> 6546587
//    "janek" -> hash() -> 5416541


    // -2mld <-> +2mld
    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, pesel);
    }
}

// 00101010101
//   101010101