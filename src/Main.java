import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int calka;
        char metoda;
        int przedzialy;
        System.out.println("Ktora calke chcesz obliczyc? (Wprowadz 0, 1 lub 2)");
        Scanner ktoraCalka = new Scanner(System.in);
        calka=ktoraCalka.nextInt();
        System.out.println("Wybierz metode, ktora chcesz zastosowac: (Wprowadz T- Trapezow lub S-Simpsona");
        Scanner ktoraMetoda = new Scanner(System.in);
        metoda=ktoraMetoda.next().charAt(0);
        System.out.println("Wprowadz liczbe podprzedzialow (Musi byc wieksza niz 1, jesli wybrales metode Simpsona, musi byc parzysta)");
        Scanner liczbaPrzedzialow = new Scanner(System.in);
        przedzialy=liczbaPrzedzialow.nextInt();
        if(przedzialy<=1)
        {
            throw new Exception ("Nieprawidlowa liczba przedzialow, sprobuj ponownie");
        }
        if(metoda =='S'&& przedzialy%2!=0)
        {
            throw new Exception("Wprowadzono nieparzysta liczbe przedzialow dla metody Simpsona, w tej metodzie liczba przedzialow powinna byc parzysta ");
        }
        if(calka==1 && metoda=='S') {
            WzorSimpsona.SimpsonCalka1(przedzialy);
        }
        if(calka==2 && metoda=='S') {
            WzorSimpsona.SimpsonCalka2(przedzialy);
        }
        if(calka==0 && metoda=='S') {
            WzorSimpsona.SimpsonCalka0(przedzialy);
        }
        if(calka==1 && metoda=='T') {
            WzorTrapezow.TrapezCalka1(przedzialy);
        }
        if(calka==2 && metoda=='T')
        {
            WzorTrapezow.TrapezCalka2(przedzialy);
        }
        if(calka==0 && metoda=='T')
        {
            WzorTrapezow.TrapezCalka0(przedzialy);
        }

    }
}