import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        {
            double kilogrammniej = 1.10;
            double kilogrampowyzej = 2.10;
            double dotrzech = 3.70;
            double powyzejpiec = 3.80;

            double odleglosc = 500;

            System.out.println("Podaj odleglosc ");
            odleglosc = klawiatura.nextDouble();
            klawiatura.nextLine();

            double waga;
            System.out.println("Podaj wage ");
            waga = klawiatura.nextDouble();
            klawiatura.nextLine();


            if (waga <1 && odleglosc <501) {
                System.out.println("cena za 500 = " + kilogrammniej);
            }
            if (waga >1 && waga <3 && odleglosc <501) {
                System.out.println("cena za 500 = " + kilogrampowyzej);
            }
            if (waga >3 && waga <5 && odleglosc <501) {
                System.out.println("cena za 500 = " + dotrzech);
            }
            if (waga >6  && odleglosc <501) {
                System.out.println("cena za 500 =  " + powyzejpiec);
            }
        }
    }
}

