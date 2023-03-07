import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class mercado implements IMercado { 
    static Scanner sc = new Scanner(System.in);
    readme read = new readme();
    ArrayList<String> lista_mercado_sucio = read._readfile("ListadoProducto (2).txt//");
    ArrayList<String> lista_del_usuario = new ArrayList<>();
    HashMap<String, ArrayList<String>> mapa = new HashMap<>();
    ArrayList<Object> values = new ArrayList<>();
    ArrayList<String> Keys = new ArrayList<>();



    
    public void pasar_txt_a_Array_a_HashMap(){
            limpiar_dato();
            for (ArrayList strinaag : mapa.values()) {
                for (Object objaect : strinaag) {
                    values.add(objaect);
                }
            }
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
        for (String key : mapa.keySet()) 
             {
            Keys.add(key); 
        }

        
    }
    public static <K, V> K getKey(Map<K, V> map, String value)
    {
        return map.entrySet().stream()
                .filter(entry -> value.equals(entry.getValue()))
                .findFirst().map(Map.Entry::getKey)
                .orElse(null);
    }

    @Override
    public void Agregar_producto(Map<String, ArrayList<String>> mapa) {
        System.out.println("Qué porducto quieres agregar");
        String pructo_a_agregar = sc.nextLine();
        String respeusta = "";
        for (Object aa : values) {
            if(pructo_a_agregar.equals(aa)){
            lista_del_usuario.add(pructo_a_agregar);
                respeusta = "Agregado";
                break;
        }
            else {
                respeusta = "Intenta con otro producto";
            }
        }
        System.out.println(lista_del_usuario);
       System.out.println(respeusta);
    }

    @Override
    public void Mostrar_categoria(String producto) {
        String cateora = ""; 
        String mes = "";
        boolean verif = mapa.containsValue(producto);
    
        for (Object aa : values) {
            if(producto.equals(aa)){
                verif = true;                
                break;
        }
            else {
                verif = false;
            }
        }
        for (String string : mapa.keySet()) {
                    if (mapa.containsValue(producto)== true){
                        cateora = string;
                        break;
                        }
                        else  {
                            cateora = "Lo sentimos, no tenemos este producto";
                        }
        }

        if (verif == true ){
            mes = "Sí tenemos este producto, es de la categoría ";
        }
        else {
            mes = " :(";
        }
        System.out.println(mes + cateora);
    }

    @Override
    public void Mostrar_listado(Map<String, ArrayList<String>> mapa) {
        System.out.println(lista_del_usuario);
        if (lista_del_usuario.isEmpty()){
            System.out.println("Debes de agregar algo en tu lista de compras");
        }
    }

    @Override
    public void Mostrar_inventario_ordenado(Map<String, ArrayList<String>> mapa) {
        Collections.sort(lista_del_usuario);
        System.out.println(lista_del_usuario);
        if (lista_del_usuario.isEmpty()){
            System.out.println("Debes de agregar algo en tu lista de compras");
        }

    }

    @Override
    public void Mostrar_investario_mercado() {
        System.out.println("\n\n");
        for (String clavea : mapa.keySet()) {
            System.out.println(clavea);
            System.out.println("\t"+mapa.get(clavea));
        }
    }

    @Override
    public void Mostrar_investario_mercado_ordenado(Map<String, ArrayList<String>> mapa) {
        Collections.sort(Keys);
        System.out.println(Keys);
        System.out.println(values);
    }


}