package pl.sda.j133;

public class MainEquals2 {
    public static void main(String[] args) {

        // Znaki '==' porównują po:                 miejscu w pamięci
        // Equals porównuje po:                     wartości/treści obiektu

        Miś m1 = new Miś("Paweł");
        Miś m2 = new Miś("Paweł");

        System.out.println(m1 == m2);               // false bo mamy dwa różne obiekty
        System.out.println(m1.equals(m2));          // teoretycznie powinno wyjść true
                                                    // equals domyślnie porównuje znakami '=='

        // To jest mój komentarz do tego pliku
    }
}
