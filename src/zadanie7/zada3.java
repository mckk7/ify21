import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zada3 {
    public static void main(String[] args) throws IOException {
        Scanner klawiatura = new Scanner(System.in);
        int odleglosc, czas, szybkosc;
        PrintWriter pw = new PrintWriter("zadanie.txt");

        System.out.println("podaj szybkosc (km/h) ");
        szybkosc = klawiatura.nextInt();
        System.out.println("podaj przebyta odleglosc (kilemotery) ");
        odleglosc = klawiatura.nextInt();
        System.out.println("podaj czas (godziny) ");
        czas = klawiatura.nextInt();
        for (int i = 0; i < czas; i++) {
            int odleglosc2;
            odleglosc2 = szybkosc * czas;
            pw.println("droga przebyta po danej liczbie godzin " + odleglosc2);
            pw.close();

        }

    }
}

