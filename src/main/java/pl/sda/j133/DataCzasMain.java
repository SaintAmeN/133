package pl.sda.j133;

import java.time.*;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class DataCzasMain {
    public static final int STAŁA = 10;
    public static void main(String[] args) {


        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(1410, 7, 15);
        Period period = Period.between(localDate2, localDate1);
        System.out.println("Dni: " + period.getDays());
        System.out.println("Miesiące: " + period.getMonths());
        System.out.println("Lata: " + period.getYears());

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(8, 0);
        Duration duration = Duration.between(localTime2, localTime1);
        System.out.println("Sekund: " + duration.getSeconds());

        LocalDateTime dateTime = LocalDateTime.now();


//        STAŁA = 11;
    }
}
