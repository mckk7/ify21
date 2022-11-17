import java.util.Scanner;

public class petle1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbe ");
        int liczba;
        liczba = klawiatura.nextInt();

        while (liczba < 10 || liczba > 24) {
            System.out.println("Podaj liczbe ");
            liczba = klawiatura.nextInt();


            System.out.println("podales dobra liczbe ");

        }
    }
}