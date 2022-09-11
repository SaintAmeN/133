package pl.sda.j133.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Kot {
    private String imie;
    private String rasa;
    private double masa;

//    @NoArgsConstructor
//    public Kot() {
//    }
//
//    @AllArgsConstructor
//    public Kot(String imie, String rasa, double masa) {
//        this.imie = imie;
//        this.rasa = rasa;
//        this.masa = masa;
//    }
}
