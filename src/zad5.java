import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double masa;
        System.out.println("Podaj mase ");
        masa = klawiatura.nextDouble();
        klawiatura.nextLine();

        double ciezar;
        System.out.println("Podaj ciezar ");
        ciezar = klawiatura.nextDouble();
        klawiatura.nextLine();

        double masa1;
        masa1 = (masa * 9.8);


        System.out.println("ciezar w niutonach to " + masa1);

        if (masa1 > 1000) {
            System.out.println("przedmiot jest za ciezki");

        }
        if (masa1 < 10) {
            System.out.println("przedmiot jest za lekki");
        }
    }
}


