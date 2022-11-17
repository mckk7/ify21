import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        {


            double gramy;
            System.out.println("Podaj gramy tluszczu ");
            gramy = klawiatura.nextDouble();
            klawiatura.nextLine();

            double kalorietluszcz;
            kalorietluszcz = gramy * 9;

            double kalorie;
            System.out.println("podaj liczbe kalorii ");
            kalorie = klawiatura.nextDouble();
            klawiatura.nextLine();

            double procent;
            procent = kalorietluszcz / kalorie;
            System.out.println("procent " + procent);
            if (procent <30)
                System.out.println("produkt jest niskotluszczowy ");

        if ( kalorietluszcz>=kalorie )
            System.out.println("error ");

    }
    }
}
