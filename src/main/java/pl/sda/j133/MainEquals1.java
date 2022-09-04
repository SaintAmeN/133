package pl.sda.j133;

public class MainEquals1 {
    public static void main(String[] args) {

//        String zmienna1 = "Paweł";
//        String zmienna2 = "Gaweł";
//        System.out.println(zmienna1 == zmienna2);       // false
//        System.out.println(zmienna1.equals(zmienna2));  // false

//        String zmienna1 = "Paweł";
//        String zmienna2 = "Paweł";
//        System.out.println(zmienna1 == zmienna2);       // true
//        System.out.println(zmienna1.equals(zmienna2));  // true

        String zmienna1 = new String("Paweł");
        String zmienna2 = "Paweł";
        System.out.println(zmienna1 == zmienna2);       // false
        System.out.println(zmienna1.equals(zmienna2));  // true

        // Znaki '==' porównują po:                 miejscu w pamięci
        // Equals porównuje po:                     wartości/treści obiektu
    }
}
