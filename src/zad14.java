import java.util.Scanner;
public class zad14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Pakiet A: ");
        System.out.println("Cena to 39.99zł miesięcznie 450 darmowych minut + 0,45zł za każdą następną minutę");

        System.out.println("Pakiet B: ");
        System.out.println("Cena to 59.99zł miesięcznie 900 darmowych minut + 0,40zł za każdą następną minutę: ");

        System.out.println("Pakiet C: ");
        System.out.println("Cena to 69.99zł miesięcznie bez limitu minut ");

        System.out.println("Podaj pakiet który wybierasz (a,b,c): ");
        String answer = scan.nextLine().toLowerCase();

        double minuty;


        System.out.println("Podaj ilość minut: ");
        minuty = klawiatura.nextDouble();
        klawiatura.nextLine();

        double rachuneka = 0;
        double rachunekb = 0;
        double rachunekc = 69.99;
        double minutya = 0;
        double minutyb = 0;
        double oszczedzaniea=0;
        double oszczedzanieb=0;
        double oszczedzaniec=0;

        char litera = answer.charAt(0);
        int liczba = 5;
        String napis = " ";

        minutya = minuty - 450;
        minutyb = minuty - 900;

        if (minutya > 0)
        {
            rachuneka = 39.99 + (minutya * 0.45);

        }
        if (minutya < 0)
        {
            rachuneka = 39.99;

        }

        if (minutyb > 0)
        {
            rachunekb = 59.99 + (minutyb * 0.40);

        }
        if (minutyb < 0)
        {
            rachunekb = 59.99;

        }


        switch (litera) {
            case 'a':

                System.out.println("Rachunek wynosi: " + rachuneka +"zł");
                oszczedzanieb = rachuneka - rachunekb;
                oszczedzaniec = rachuneka - rachunekc;

                if(rachuneka - rachunekb <0)
                {
                    System.out.println("wybierając pakiet b nic byś nie zaoszczędził");
                }
                if(rachuneka - rachunekb >0)
                {
                    System.out.println("wybierając pakiet b zaoszczędził byś: " + oszczedzanieb+"zł");
                }


                if(rachuneka - rachunekc <0)
                {
                    System.out.println("wybierając pakiet c nic byś nie zaoszczędził");
                }
                if(rachuneka - rachunekc >0)
                {
                    System.out.println("wybierając pakiet c zaoszczędził byś: " + oszczedzaniec+"zł");
                }


                break;


            case 'b':

                System.out.println("Rachunek wynosi: " + rachunekb +"zł");
                oszczedzaniea = rachunekb - rachuneka;
                oszczedzaniec = rachunekb - rachunekc;

                if(rachunekb - rachuneka <0)
                {
                    System.out.println("wybierając pakiet a nic byś nie zaoszczędził");
                }
                if(rachunekb - rachuneka >0)
                {
                    System.out.println("wybierając pakiet a zaoszczędził byś: " + oszczedzaniea+"zł");
                }


                if(rachunekb - rachunekc <0)
                {
                    System.out.println("wybierając pakiet c nic byś nie zaoszczędził");
                }
                if(rachunekb - rachunekc >0)
                {
                    System.out.println("wybierając pakiet c zaoszczędził byś: " + oszczedzaniec+"zł");
                }


                break;

            case 'c':
                System.out.println("Rachunek wynosi: " + rachunekc +"zł");
                oszczedzanieb = rachunekc - rachunekb;
                oszczedzaniea = rachunekc - rachuneka;

                if(rachunekc - rachuneka <0)
                {
                    System.out.println("wybierając pakiet a nic byś nie zaoszczędził");
                }
                if(rachunekc - rachuneka >0)
                {
                    System.out.println("wybierając pakiet a zaoszczędził byś: " + oszczedzaniea+"zł");
                }


                if(rachunekc - rachunekb <0)
                {
                    System.out.println("wybierając pakiet b nic byś nie zaoszczędził");
                }
                if(rachunekc - rachunekb >0)
                {
                    System.out.println("wybierając pakiet b zaoszczędził byś: " + oszczedzanieb+"zł");
                }
                break;

            default:
                System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
                break;

        }
    }
}