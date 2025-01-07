import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     moltiplica();
     concatena();
     inserisciInArray();


       }
    public static int moltiplica() {
        int x = 15;
        int y = 4;
        int sum = x * y;
        System.out.println(sum);
        return sum;
    }

    public static void concatena(){
        String stringa = "Ciao";
        int numero = 2;
        System.out.println(stringa + numero);

    }
    public static void inserisciInArray(){
        String[] array1 = {"Davide", "Carlo", "Ele", "Licia", "Mauro"};
        String stringaAgg = "Undefined";
        String[] arrayDiSei = new String[6];
        arrayDiSei[0] = array1[0];
        arrayDiSei[1] = array1[1];
        arrayDiSei[2] = stringaAgg;
        arrayDiSei[3] = array1[2];
        arrayDiSei[4] = array1[3];
        arrayDiSei[5]= array1[4];
        for (int i = 0; i < arrayDiSei.length; i++) {
            System.out.println(arrayDiSei[i]);
        }


    }
}