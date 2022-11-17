import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        {
            String nazwisko1;
            System.out.println("Podaj nazwisko1 ");
            nazwisko1 = klawiatura.nextLine();
            klawiatura.nextLine();

            String nazwisko2;
            System.out.println("Podaj nazwisko2 ");
            nazwisko2 = klawiatura.nextLine();
            klawiatura.nextLine();

            String nazwisko3;
            System.out.println("Podaj nazwisko3");
            nazwisko3 = klawiatura.nextLine();
            klawiatura.nextLine();
        }
        double czas1;
        System.out.println("Podaj czas1 ");
        czas1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double czas2;
        System.out.println("Podaj czas2 ");
        czas2 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double czas3;
        System.out.println("Podaj czas3 ");
        czas3 = klawiatura.nextDouble();
        klawiatura.nextLine();

        if (czas1>czas2 && czas1>czas3);
        System.out.println(" top1 " + czas1);

        if (czas1>czas2 && czas1>czas3);
        System.out.println(" top2 " + czas2);

        if (czas1>czas2 && czas1>czas3);
        System.out.println(" top3 " + czas3);

        if (czas1>czas2 && czas1>czas3);
        System.out.println(" top1 " + czas1);






    }


}
