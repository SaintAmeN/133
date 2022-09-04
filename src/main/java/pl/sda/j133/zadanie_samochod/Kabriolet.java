package pl.sda.j133.zadanie_samochod;

public class Kabriolet extends Samochod {
    private boolean dachSchowany; // = false (domyślnie)

    // schowajDach():void
    public void schowajDach() {
        dachSchowany = true;
    }

    // czyDachSchowany():boolean
    public boolean czyDachSchowany() {
        return dachSchowany;
    }
}
