package pl.sda.j133.zadanie_samochod;

public class Kabriolet extends Samochod {
    private boolean dachSchowany; // = false (domyślnie)

    @Override
    public void przyspiesz() {
        if (predkosc >= 180) {
            System.err.println("Nie możesz przyspieszyć!");
        } else {
//            predkosc = predkosc + 10;
            predkosc += 10;
            System.out.println("Przyspieszam do " + predkosc + " km/h");
        }
    }

    // schowajDach():void
    public void schowajDach() {
        if (dachSchowany) {
            System.err.println("Dach jest już schowany");
        }else {
            dachSchowany = true;
        }
    }

    // czyDachSchowany():boolean
    public boolean czyDachSchowany() {
        return dachSchowany;
    }
}
