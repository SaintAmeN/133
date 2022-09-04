package pl.sda.j133.zadanie_samochod;

public class Samochod {
    protected int predkosc;                   // 0
    private boolean swiatlaWlaczone;

    // przyspiesz():void
    public void przyspiesz() {
        if (predkosc >= 120) {
            System.err.println("Nie możesz przyspieszyć!");
        } else {
//            predkosc = predkosc + 10;
            predkosc += 10;
            System.out.println("Przyspieszam do " + predkosc + " km/h");
        }
    }

    // czySwiatlaWlaczone():boolean
    public boolean czySwiatlaWlaczone() {
        return swiatlaWlaczone;
    }

    // wlaczSwiatla():void
    public void wlaczSwiatla() {
        swiatlaWlaczone = true;
    }
}
