package pl.sda.j133.interfejsy.podstawy;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class DomInteligentny {
    private Otwieralny[] otwieralne;

    public DomInteligentny(Otwieralny[] otwieralne) {
        this.otwieralne = otwieralne;

        this.otwieralne[0] = new Okno();
        this.otwieralne[1] = new Drzwi();
        this.otwieralne[2] = new Szafka();
        this.otwieralne[3] = new Szuflada();
    }

    public void otworzWszystko(){
        for (Otwieralny otwieralny : this.otwieralne) {
            otwieralny.otwórz();
        }
    }
}
