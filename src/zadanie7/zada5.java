import java.util.Scanner;
public class zada5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        String name;

        String litera;

        int c=0;

        System.out.println("podaj słowo: ");
        name = klawiatura.nextLine();


        System.out.println("podaj litere: ");
        litera = klawiatura.nextLine();


        int dlugosc = name.length();


        char inicjal;

        char litera1 = litera.charAt(0);
        for(int i = 0; i < dlugosc; i++)
        {
            inicjal = name.charAt(i);
            if(inicjal==litera1)
            {
                c=c+1;
            }



        }
        System.out.println("Litera "+ litera+" wystepuje " + c + " razy w słowie "+ name);

    }
}