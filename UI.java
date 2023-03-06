import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);
    static readme readFile = new readme();

    public static void main(String[] args) {
        System.out.println("\nBienvenido a el mercado local");
        ArrayList<String> postfix = readFile._readfile("datos.txt//");
        mercado calculadora = new mercado();
        jji
        System.out.println("Con que tipo de estructura de datos MAP quieres realizarlo");
        System.out.println("\n1.HashMap");
        System.out.println("\n2.TreeMap");
        System.out.println("\n3.LinkedHashMao");
        int opcionMAP = sc.nextInt();
        switch (opcionMAP) {
        case 1:
            
            break;
        case 2:
            
            break;
        case 3:
            
            break;
        default:
            throw new AssertionError();}
    }    
}
