package pl.sda.j133.zadanie_samochod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Samochod samochod = new Samochod();
        Kabriolet samochod = new Kabriolet();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Co chcesz zrobić?");
            String komenda = scanner.next();

            if (komenda.equals("przyspiesz")) {
                samochod.przyspiesz();
            } else if (komenda.equals("czySwiatlaWlaczone")) {
                System.out.println(samochod.czySwiatlaWlaczone());
            } else if (komenda.equals("wlaczSwiatla")) {
                samochod.wlaczSwiatla();
            } else if (komenda.equals("schowajDach")) {
                samochod.schowajDach();
            } else if (komenda.equals("czyDachSchowany")) {
                System.out.println(samochod.czyDachSchowany());
            } else if (komenda.equals("zakoncz")) {
                break;
            } else {
                System.err.println("Nieznana komenda");
            }
        } while (true);
    }
}
