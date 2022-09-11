package pl.sda.j133.lombok;

import lombok.*;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */

@Data  // @Getter  // @Setter  // @ToString  // @EqualsAndHashCode  // @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Kot {
//    private final String imie;
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
