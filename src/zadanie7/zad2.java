package zadanie7;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int odleglosc, czas, szybkosc;
        System.out.println("podaj szybkosc (km/h) ");
        szybkosc = klawiatura.nextInt();
        System.out.println("podaj przebyta odleglosc (kilemotery) ");
        odleglosc = klawiatura.nextInt();
        System.out.println("podaj czas (godziny) ");
        czas = klawiatura.nextInt();
        for (int i = 0; i < czas; i++) {
            int odleglosc2;
            odleglosc2 = szybkosc * czas;

            System.out.println("droga przebyta po danej liczbie godzin " + odleglosc2);

        }

    }
}

