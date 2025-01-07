import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Es3 {
    public static void main(String[] args) {

      perimetroRettangolo();
      pariDispari();
      perimetroTriangolo();
    }
    public static int perimetroRettangolo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il primo lato del rettangolo");
        int x = sc.nextInt();
        System.out.println("Inserisci il secondo lato del rettangolo");
        int y = sc.nextInt();
        int perimetro = (x + y) * 2 ;
        System.out.println("il perimetro del rettangolo è : " + perimetro);
        return perimetro;
    }

    public static int pariDispari() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci qui un numero intero");
        int a = sc.nextInt();
        int divisibile = a % 2;
        if (divisibile == 0) {
            System.out.println("Il numero scelto è pari!");
            return divisibile;

        } else {
            System.out.println("Il numero scelto è dispari!");
            return divisibile;
        }

    }
    public static void perimetroTriangolo(){
        double lato1 = 10;
         double  lato2 = 12;
          double lato3 = 5;
          double perimetroTri = lato1 + lato2 + lato3;
        System.out.println("il perimetro del triangolo è : " + perimetroTri);
         double s = (lato1 + lato2 + lato3) / 2;
         double areaTriangolo = Math.sqrt( s * (s - lato1)* (s - lato2) * (s - lato3));
        System.out.println("L'area del triangolo è : " + areaTriangolo);

    }


    }

