import static java.lang.Math.pow;

public class WzorTrapezow {
    public static void TrapezCalka1(int podprzedzialy)
    {
        double h= (2*Math.PI-0)/podprzedzialy;
        double xi[] = new double [podprzedzialy+1];
        double a =0;
        for(int i=0;i<podprzedzialy+1;i++)
        {
            xi[i]=a+ i*h;
        }
        double fi[] = new double[podprzedzialy+1];
        for(int i=0;i<podprzedzialy+1;i++)
        {
            fi[i]=pow(Math.sin(xi[i]),2)+2;

        }
        double sumaIndeksow = 0;
        for(int i=1;i<=podprzedzialy-1;i+=1)
        {
            sumaIndeksow+=fi[i];
        }

        double wynik;
        wynik= h*((0.5)*fi[0]+sumaIndeksow+(0.5)*fi[podprzedzialy]);

        System.out.println("Wynik wynosi: "+wynik);








    }

    public static void TrapezCalka2(int podprzedzialy)
    {
        double h= (2.0)/podprzedzialy;
        double xi[] = new double [podprzedzialy+1];
        double a =0;
        for(int i=0;i<podprzedzialy+1;i++)
        {
            xi[i]=a+ i*h;
        }
        double fi[] = new double[podprzedzialy+1];
        for(int i=0;i<podprzedzialy+1;i++)
        {
            fi[i]=pow(Math.E,xi[i])*2*pow(xi[i],3);

        }
        double sumaIndeksow = 0;
        for(int i=1;i<=podprzedzialy-1;i+=1)
        {
            sumaIndeksow+=fi[i];
        }

        double wynik;
        wynik= h*((0.5)*fi[0]+sumaIndeksow+(0.5)*fi[podprzedzialy]);

        System.out.println("Wynik wynosi: "+wynik);









    }public static void TrapezCalka0(int podprzedzialy)
    {
        double h= (1.0)/podprzedzialy;
        double xi[] = new double [podprzedzialy+1];
        double a =0;
        for(int i=0;i<podprzedzialy+1;i++)
        {
            xi[i]=a+ i*h;
        }
        double fi[] = new double[podprzedzialy+1];
        for(int i=0;i<podprzedzialy+1;i++)
        {
            fi[i]=Math.sqrt(xi[i]+1.0);

        }
        double sumaIndeksow = 0;
        for(int i=1;i<=podprzedzialy-1;i+=1)
        {
            sumaIndeksow+=fi[i];
        }

        double wynik;
        wynik= h*((0.5)*fi[0]+sumaIndeksow+(0.5)*fi[podprzedzialy]);

        System.out.println("Wynik wynosi: "+wynik);


    }
}