import java.util.ArrayList;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;





public class mercado { 
    Scanner sc = new Scanner(System.in);
    readme read = new readme();
    File archivo = new File("ListadoProducto.txt");
    ArrayList<String> lista_mercado_sucio = read._readfile("ListadoProducto (2).txt//");
    ArrayList<String> lista_mercado_limpio = new ArrayList<>();
    HashMap<String, ArrayList<String>> mapa = new HashMap<>();
    
    public void pasar_txt_a_Array_a_HashMap(){
        limpiar_dato();
    }
    
    public void limpiar_dato(){
        for (String linea : lista_mercado_sucio) {
            // Separar la línea en dos partes usando el carácter "|" como separador
            String[] datos = linea.split("\\|");

            // Obtener la clave y el valor de la línea
            String clave = datos[0].trim();
            String valor = datos[1].trim();

            if (!mapa.containsKey(clave)) {
                mapa.put(clave, new ArrayList<String>());
            }

            mapa.get(clave).add(valor);
        }

        
    }
    public void  imprimri (){
        limpiar_dato();
        System.out.println(mapa);
        System.out.println("\n\n");

        for (String clavea : mapa.keySet()) {
            System.out.println(clavea);
            System.out.println("\t"+mapa.get(clavea));
        }
        System.out.println("\n\n");
        for (String clave : mapa.keySet()) {
            System.out.println(clave + ": " + mapa.get(clave));
        }
    
    }
    public void prueba (){
        imprimri();        
    }
    public void agregar_elemento (){

    }

    
}