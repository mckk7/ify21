import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double sekundy;
        System.out.println("Podaj liczbe sekund ");
        sekundy = klawiatura.nextDouble();
        klawiatura.nextLine();

        double minuty;
        minuty = sekundy / 60;

        double godziny = sekundy / 3600;

        double dni;
        dni = sekundy / 8400;

        if (sekundy <60) {
            System.out.println("liczba sekund  " + sekundy);
        }
        if (sekundy >60 && sekundy < 3600) {
            System.out.println("liczba minut  " + minuty);
        }
        if (sekundy >=3600 && sekundy <= 86400) {
            System.out.println("liczba godzin  " + godziny);
        }
        if (sekundy >86400) {
            System.out.println("liczba dni  " + dni);
        }
    }
}




