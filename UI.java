import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);
    static mercado mercadito = new mercado();

    public static void main(String[] args) {
        mercadito.prueba();
        System.out.println("\nBienvenido a el mercado local");
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
