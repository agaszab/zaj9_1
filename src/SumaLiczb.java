import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaLiczb {
    public static void main(String[] args) {
        int suma=0;
        Scanner scan=new Scanner(System.in);
        int[] liczby=new int[5];
        for (int i=0; i<5; i++ )
        {
            System.out.println("Podaj liczbę:");

            try {
                liczby[i] = scan.nextInt();
                suma += liczby[i];
            }
            catch (InputMismatchException e) {
                System.out.println("Podałeś nieprawidłowe dane - musisz podać liczbę");
                i--; // jak tego nie będzie to przejdzie do następnego elementu zamiast pisać ten jeden do skutku aż dobry

            }

            finally {
                scan.nextLine();

            }

        }
            System.out.println("Suma liczb wynosi: "+suma);
    }
}
