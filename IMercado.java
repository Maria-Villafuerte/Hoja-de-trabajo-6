import java.util.*;
public interface IMercado {
    //Agregar un producto a tu listado
    void Agregar_producto(Map<String, ArrayList<String>> mapa);
    //Mostrar la categoría de un producto
    void Mostrar_categoria(String producto);
    //Mostrar_listado
    void Mostrar_listado(Map<String, ArrayList<String>> mapa);
    //Mostrar_inventario_ordenado
    void Mostrar_inventario_ordenado(Map<String, ArrayList<String>> mapa);
    //Mostrar_investario_mercado
    void Mostrar_investario_mercado();
    //Mostrar_investario_mercado_ordenado
    void Mostrar_investario_mercado_ordenado(Map<String, ArrayList<String>> mapa);
}
