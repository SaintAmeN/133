package pl.sda.j133;

public class MainEnum {
    public static void main(String[] args) {
        BiletMiejski biletMiejski1 = BiletMiejski.NORMALNY;
        BiletMiejski biletMiejski2 = BiletMiejski.NORMALNY;

        System.out.println(biletMiejski1 == biletMiejski2); // true
    }
}
