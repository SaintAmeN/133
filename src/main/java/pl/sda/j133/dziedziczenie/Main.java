package pl.sda.j133.dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Sowa sowa = new Sowa();
        sowa.przedstawSie(); // Ptak, rozmiar: 0.0
        sowa.spiewaj();      // hu hu

        // polimorfizm - sowa jest sową, sowa jest ptakiem, sowa jest obiektem
        // poli     - wiele
        // morfizm  - postaci
        Ptak sowa1 = new Sowa();
        sowa1.przedstawSie(); // Ptak, rozmiar: 0.0
        sowa1.spiewaj();      // hu hu

        // Niezależnie od typu obiektu/zmiennej wywołanie metody
        // pochodzi z klasy końcowej.


        Ptak[] ptaki = new Ptak[4];
        ptaki[0] = new Sowa();
        ptaki[1] = new Kukułka();
        ptaki[2] = new Kukułka();
        ptaki[3] = new Sowa();

        for (Ptak ptak : ptaki) {
            ptak.spiewaj();
        }
    }
}
