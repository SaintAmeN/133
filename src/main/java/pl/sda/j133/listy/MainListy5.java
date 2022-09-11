package pl.sda.j133.listy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainListy5 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("123456", "Pawel", "Gawel", Płeć.MEZCZYZNA));
        list.add(new Student("123457", "Marian", "Programista", Płeć.MEZCZYZNA));
        list.add(new Student("123458", "Joanna", "Programista", Płeć.KOBIETA));
        list.add(new Student("123459", "Julia", "Gawel", Płeć.KOBIETA));
        list.add(new Student("123460", "Filip", "Filipski", Płeć.MEZCZYZNA));
        list.add(new Student("123461", "Zosia", "Samosia", null));

        System.out.println(list);

        System.out.println("-------");
        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("-------");
        for (Student student : list) {
//            if (Płeć.KOBIETA.equals(student.getPłeć())){
            if (student.getPłeć() == Płeć.KOBIETA) {
                System.out.println(student);
            }
        }

        System.out.println("-------");
        for (Student student : list) {
            if (Płeć.MEZCZYZNA.equals(student.getPłeć())) {
                System.out.println(student);
            }
        }

        System.out.println("-------");
        for (Student student : list) {
            System.out.println(student.getNumerIndeksu());
        }
    }
}
