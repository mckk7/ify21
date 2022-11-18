package zadanie7;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int n, liczby, suma;
        System.out.println("podaj liczbe ");
        n = klawiatura.nextInt();
        System.out.println("suma z liczb: ");
        for (int i = 0; i<n; i++) {
            liczby = i+1;
            System.out.println(" " + liczby);
            suma = n+(i+i);
            System.out.println("suma wynosi: " + suma);



        }
    }
}

