import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la prima parola");
        String primaParola = sc.nextLine();
        System.out.println("Inserisci qui la seconda parola");
        String secondaParola = sc.nextLine();
        System.out.println("Inserisci qui la terza parola");
        String terzaParola = sc.nextLine();
        System.out.println(terzaParola + secondaParola + primaParola);
        System.out.println(primaParola + secondaParola + terzaParola);

    }

}
