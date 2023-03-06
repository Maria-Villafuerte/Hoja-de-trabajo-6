import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);
    static readme readFile = new readme();

    public static void main(String[] args) {
        System.out.println("\nBienvenido a la Calculadora Postfix");
        ArrayList<String> postfix = readFile._readfile("datos.txt//");
        mercado calculadora = new mercado();

        for (String element: postfix) {
            System.out.println("\n\tOperación a realizar: " + element);

            System.out.println("\tResultado obtenido: " + Calculadora.calculate(element) + "\n");
        }
        System.out.println("\nSe han hecho los cálculos de todo el archivo");
    }    
}
