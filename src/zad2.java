import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double dzien;

        System.out.println("Podaj dzien: ");
        dzien = klawiatura.nextInt();
        klawiatura.nextLine();

        double miesiac;

        System.out.println("Podaj miesiąć: ");
        miesiac = klawiatura.nextInt();
        klawiatura.nextLine();

        double rok;

        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        rok = klawiatura.nextInt();
        klawiatura.nextLine();

        double info1 = dzien*miesiac;

        if(info1 == rok)
        {
            System.out.println("Data jest magiczna");
        }

        if(info1 != rok)
        {
            System.out.println("Data nie jest magiczna");
        }
    }
}