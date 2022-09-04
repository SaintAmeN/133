package pl.sda.j133;

// enumerated
public enum BiletMiejski {
    ULGOWY_STUDENCKI(4.50),
    ULGOWY_SENIOR(2.50),
    NORMALNY(9.0),
    BILET_NA_ZWIERZACZKA(3.0);

    private final double cena;

    BiletMiejski(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}
