import java.util.Scanner;
public class zad13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Pakiet A: ");
        System.out.println("Cena to 39.99zł miesięcznie 450 darmowych minut + 0,45zł za każdą następną minutę");

        System.out.println("Pakiet B: ");
        System.out.println("Cena to 59.99zł miesięcznie 900 darmowych minut + 0,40zł za każdą następną minutę: ");

        System.out.println("Pakiet C: ");
        System.out.println("Cena to 69.99zł miesięcznie bez limitu minut ");

        System.out.println("Podaj pakiet który wybierasz (a,b,c): ");
        String answer = scan.nextLine().toLowerCase();

        double minuty;
        double minuty1;

        System.out.println("Podaj ilość minut: ");
        minuty = klawiatura.nextDouble();
        klawiatura.nextLine();

        double rachunek = 0;

        char litera = answer.charAt(0);
        int liczba = 5;
        String napis = " ";

        switch (litera) {
            case 'a':
                minuty1 = minuty - 450;

                if (minuty1 > 0)
                {
                    rachunek = 39.99 + (minuty1 * 0.45);
                }
                if (minuty1 < 0)
                {
                    rachunek = 39.99;
                }
                System.out.println("Rachunek wynosi: " + rachunek);
                break;

            case 'b':
                minuty1 = minuty - 900;

                if (minuty1 > 0)
                {
                    rachunek = 59.99 + (minuty1 * 0.40);
                }
                if (minuty1 < 0)
                {
                    rachunek = 59.99;
                }
                System.out.println("Rachunek wynosi: " + rachunek);
                break;

            case 'c':

                System.out.println("Rachunek wynosi: 69.99 "  );
                break;
            default:
                System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
                break;

        }
    }
}