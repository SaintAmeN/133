package pl.sda.j133;

/**
 * @author Paweł Recław, AmeN
 * @project podstawy
 * @created 04.09.2022
 */
public class Miś {
    private String imie;

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
}
