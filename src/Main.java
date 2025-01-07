import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int x = 20;
     int y = 41;
     String str = "Sono il numero ";
     String[] arrStr = {"uno", "due", "tre", "quattro", "cinque"};


        System.out.println("il prodotto calcolato fra i numeri " + x + " e " + y + " è uguale a " + moltiplica( x, y ));

        System.out.println(concatena(str,x));

        System.out.println(Arrays.toString(inserisciInArray(arrStr, "Nuovo")));

       }
    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String s, int n){
        return s + n;

    }
    public static String[] inserisciInArray(String[] arr, String s){
        String[] arrayDiSei = new String[6];
       /* arrayDiSei[0] = arr[0];
        arrayDiSei[1] = arr[1];
        arrayDiSei[2] = s;
        arrayDiSei[3] = arr[2];
        arrayDiSei[4] = arr[3];
        arrayDiSei[5] = arr[4]; */
        for (int i = 0; i<arrayDiSei.length; i++){
            if(i<2){
                arrayDiSei[i] = arr[i];
            } else if (i == 2){
                arrayDiSei[i] = s;

            } else {
                arrayDiSei[i] = arr[i-1];
            }
        }
        return arrayDiSei;



    }
}