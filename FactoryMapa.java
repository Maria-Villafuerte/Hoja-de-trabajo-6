import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FactoryMapa<K,V> {
    public Map<K,V> Instace (int opcion){
        Map<K,V> mapa_de_usuario;
        switch (opcion) {
            case 1:
                mapa_de_usuario = new HashMap<K,V>();
                break;
                case 2:
                mapa_de_usuario = new TreeMap<K,V>();
                break;
                case 3:
                mapa_de_usuario = new LinkedHashMap<K,V>();
                break;
            default:
                throw new AssertionError();
        }  return mapa_de_usuario;
    }
}
