import java.util.Scanner;

public class petle3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String napisy;
        boolean twierdzenie = true;

        while (twierdzenie) {
            System.out.println("Podaj odpowiedz tak lub nie ");
            napisy = klawiatura.nextLine();
            if(napisy.equalsIgnoreCase( "tak")|| napisy.equalsIgnoreCase("nie")){
                twierdzenie = false;
            }else{
                twierdzenie = true;
            }

        }
System.out.println("podales dobra odpowiedz");
    }
}