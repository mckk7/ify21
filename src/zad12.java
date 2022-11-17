import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String material;
        System.out.println("wpisz powietrze woda lub stal ");
        material = klawiatura.nextLine();

        double odleglosc;
        System.out.println("odleglosc ");
        odleglosc = klawiatura.nextDouble();

        double czaspowietrze = odleglosc / 343;
        double czaswoda = odleglosc / 1490;
        double czasstal = odleglosc / 5100;

        if (material.equalsIgnoreCase("powietrze")) {
            System.out.println(czaspowietrze);

        } else if (material.equalsIgnoreCase("woda")) {
            System.out.println(czaswoda);

        }
        if (material.equalsIgnoreCase("stal")) {
            System.out.println(czasstal);

        }
    }
}

