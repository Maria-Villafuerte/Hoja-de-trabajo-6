import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class UI {
    static Scanner sc = new Scanner(System.in);
    static mercado mercadito = new mercado();
    static FactoryMapa<String, ArrayList<String>> factory_mapa = new FactoryMapa<>();
    public static void funcion_mercado (Map mapa_de_factory){
        System.out.println("\n\tElige una de las opciones");
        //Agregar_producto :D
        System.out.println("\n\t\t1.Agregar un producto a tu listado");
        //Mostrar_categoría :D
        System.out.println("\t\t2.Mostrar la categoría de un producto");
        //Mostrar_listado
        System.out.println("\t\t3.Mostrar Listado");
        //Mostrar_inventario_ordenado
        System.out.println("\t\t4.Mostrar Listado ordenado");
        //Mostrar_investario_mercado :D
        System.out.println("\t\t5.Mostrar inventario del mercado");
        //Mostrar_investario_mercado_ordenado
        System.out.println("\t\t6.Mostrar inventario ordenado");
        System.out.println("\t\t7.Salir");

        int opcion_mercado = sc.nextInt();
        switch (opcion_mercado) {
            case 1:
                mercadito.Agregar_producto(mapa_de_factory);
                break;
            case 2:
                System.out.println("Que producto quiere buscar");
                String ss = sc.next();
                mercadito.Mostrar_categoria(ss);
                break;
            case 3:
                mercadito.Mostrar_listado(mapa_de_factory);
                break;
            case 4:
                mercadito.Mostrar_inventario_ordenado(mapa_de_factory);
                break;
            case 5:
                mercadito.Mostrar_investario_mercado();
                break;
            case 6:
                mercadito.Mostrar_investario_mercado_ordenado(mapa_de_factory);
                break;
            case 7:
                break;
            default:
                throw new AssertionError();
        }
        
    }
    public static void main(String[] args) {
        System.out.println("\nBienvenido a el mercado local");
        System.out.println("Con que tipo de estructura de datos MAP quieres realizarlo");
        System.out.println("\n\t1.HashMap");
        System.out.println("\t2.TreeMap");
        System.out.println("\t3.LinkedHashMao");
        System.out.println("\t4.Salir");
        
        int opcionMAP = sc.nextInt();
        mercadito.pasar_txt_a_Array_a_HashMap();
        switch (opcionMAP) {
        case 1:
        ///De la opción que elija se manda a factory para que este le dica cuál de toda eligió y crea un tabla con estas
            Map<String, ArrayList<String>> mapa = factory_mapa.Instace(opcionMAP);
            funcion_mercado(mapa);
        case 2:
            Map<String, ArrayList<String>> mapa2 = factory_mapa.Instace(opcionMAP);
            funcion_mercado(mapa2);
        case 3:
            Map<String, ArrayList<String>> mapa3 = factory_mapa.Instace(opcionMAP);
            funcion_mercado(mapa3);
            case 4:
            break;
        default:
            throw new AssertionError();}
    }    

    
}
