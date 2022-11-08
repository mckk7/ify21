import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double waga;

        System.out.println("podaj wage w kg: ");
        waga = klawiatura.nextDouble();
        klawiatura.nextLine();

        double wzrost;

        System.out.println("podaj wzrost w metrach: ");
        wzrost = klawiatura.nextDouble();
        klawiatura.nextLine();



        double wzrost2;
        wzrost2 = 2*wzrost;

        double BMI;
        BMI = waga / wzrost2;

        System.out.println("BMI wynosi: " + BMI);
    }
}