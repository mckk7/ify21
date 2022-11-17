import java.util.Scanner;

public class petle2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String litera;
        boolean twierdzenie = true;

        while (twierdzenie) {
            System.out.println("Podaj litere T, t, N, n ");
            litera = klawiatura.nextLine();
            int znak = litera.charAt(0);
            if (znak == 't' || znak == 'T' || znak == 'N' || znak == 'n') {
                twierdzenie = false;
            } else {
                twierdzenie = true;
            }
            System.out.println("podales dobra litere");

        }

    }
}