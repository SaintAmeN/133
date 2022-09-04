package pl.sda.j133.dziedziczenie;

public class Ptak {
    protected double rozmiar;

    public void spiewaj() {
        System.out.println("ćwir ćwir!");
    }

    public void przedstawSie(){
        System.out.println("Ptak, rozmiar: " + rozmiar);
    }
}
