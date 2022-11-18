package zadanie7;
import java.io.File;
import java.util.Scanner;

public class zada7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczbapieter, wszystkiepokoje, wszystkiepokojezajete, liczbapokoizajetych;
        int liczbapokoinapietrze;
        double poziomoblozenia;
        System.out.println("podaj liczbe pieter: ");
        wszystkiepokoje = 0;
        wszystkiepokojezajete = 0;
        liczbapieter = 0;

        if (liczbapieter > 1) {
            for (int i = 0; i < liczbapieter; i++) {
                System.out.println("pietro ma: " + i + 1);
                System.out.println("podaj ilos wszystkich pokoi na pietrze: ");
                liczbapokoinapietrze = klawiatura.nextInt();
                if (liczbapokoinapietrze < 10) ;
                {
                    System.out.println("zla liczba pokoi minimum 10 podaj: ");
                    System.exit(1);
                }
                System.out.println("podaj nr: " + i + 1);
                System.out.println("podaj ilos wszystkich pokoi na pietrze: ");
                liczbapokoizajetych = klawiatura.nextInt();
                wszystkiepokojezajete = liczbapokoizajetych;
            }
            poziomoblozenia = (double) wszystkiepokojezajete/wszystkiepokoje;
            System.out.println("wszystkie pokoje: " + wszystkiepokoje);
            System.out.println("wszystkie pokoje zajete: " + wszystkiepokojezajete);


        }
    }
}
