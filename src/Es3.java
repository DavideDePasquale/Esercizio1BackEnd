import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Es3 {
    public static void main(String[] args) {

        System.out.println("il perimetro del rettangolo è : " + perimetroRettangolo(5,19));
        System.out.println("il numero passato come parametro è : " + pariDispari(5));
        System.out.println("L'area del triangolo è : " + perimetroTriangolo(2.3, 5.1, 5.4));
    }
    public static double perimetroRettangolo(double l1, double l2){

        return l1 + l2 + l1 + l2;
    }

    public static int pariDispari(int num) {
        return num % 2;
        }
    public static double perimetroTriangolo(double l1, double l2, double l3){
         double semiPerimetro = (l1 + l2 + l3) / 2;
         double areaTriangolo = Math.sqrt( semiPerimetro * (semiPerimetro - l1)* (semiPerimetro - l2) * (semiPerimetro - l3));
       return areaTriangolo;
    }


    }

