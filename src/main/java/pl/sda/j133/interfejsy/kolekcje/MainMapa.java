package pl.sda.j133.interfejsy.kolekcje;

import pl.sda.j133.sety.Obywatel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class MainMapa {
    public static void main(String[] args) {

        // 5 -> Paweł
        // 123 -> Paweł Recław
        Map<String, Obywatel> mapa = new HashMap<>();

        mapa.put("123", new Obywatel("Paweł", "Gaweł", "123"));
                                            // 48 = 0, 49 = 1, 50 = 2, 51 = 3
        Obywatel o1 = mapa.get("123");   // zadziała
        Obywatel o2 = mapa.get(123);     // nie zadziała

        for (Obywatel value : mapa.values()) {

        }

        for (String klucz : mapa.keySet()) {

        }

        for (Map.Entry<String, Obywatel> entry : mapa.entrySet()) {
            
        }
    }
}
