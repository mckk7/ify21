import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double test1;

        System.out.println("Podaj wynik z testu 1 ");
        test1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double test2;

        System.out.println("Podaj wynik z testu 2 ");
        test2 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double test3;

        System.out.println("Podaj wynik z testu 3 ");
        test3 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double wynik;
        wynik = (test1 + test2 + test3) / 3;

        if (wynik < 60) {
            System.out.println("Dostales 1");
        }
        if (wynik >= 60 && wynik < 69) {
            System.out.println("Dostales 2");

        }
        if (wynik >= 70 && wynik < 79) {
            System.out.println("Dostales 3");
        }
        if (wynik >= 80 && wynik < 89) {
            System.out.println("Dostales 4");
        }
        if (wynik >= 90 && wynik < 99) {
            System.out.println("Dostales 5");
        }
        if (wynik <= 100) {
            System.out.println("Dostales 6");
        }
    }
}

