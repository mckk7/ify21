import java.util.Scanner;
public class zada4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        int dni;

        double a=1,b,c;

        System.out.println("podaj dni ile pracownik pracuje: ");
        dni = klawiatura.nextInt();
        klawiatura.nextLine();



        for(int i = 1; i <=dni; i++)
        {

            b=a;
            a=b*2;
            c= a/100;
            System.out.println("podczas "+i+" pracownik zarobi "+ c + " złotych");

        }

    }
}