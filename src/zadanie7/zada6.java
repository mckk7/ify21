import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class zada6 {
    public static void main(String[] args) throws IOException {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku z rozszerzenim");
        String nazwapliku;
        nazwapliku = klawiatura.nextLine();
        klawiatura.nextLine();
        File mojPlik = new File (nazwapliku);
        Scanner fileScanner = new Scanner (mojPlik);

        String linia;
        String litera;

        linia = fileScanner.nextLine();

        int h=0;



        System.out.println("podaj litere; ");
        litera = klawiatura.nextLine();
        int dlugosc = linia.length();


        char inicjal;
        char litera1 = litera.charAt(0);
        for(int i = 0; i < dlugosc; i++)
        {
            inicjal = linia.charAt(i);
            if(inicjal==litera1)
            {
                h++;
            }

        }
        System.out.println("Litera "+ litera+" wystepuje " + h + " razy w pliku danie "+ linia);

    }
}