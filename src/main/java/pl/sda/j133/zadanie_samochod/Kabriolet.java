package pl.sda.j133.zadanie_samochod;

public class Kabriolet extends Samochod {
    private boolean dachSchowany; // = false (domyślnie)

    @Override
    public void przyspiesz() {
        przyspieszDoLimitu(180);
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
