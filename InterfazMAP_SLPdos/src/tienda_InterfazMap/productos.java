package tienda_InterfazMap;

import java.util.*;

public class productos {

    Map<String, String> productos = new HashMap<String, String>();

    public void agregar(String clave, String producto) {
        if (productos.containsKey(clave)) {
            System.out.println("¡Código existente!\nNo se Agregó el producto");
        } else {
            productos.put(clave, producto);
            System.out.println("Producto Agregado");
        }
    }

    public void modificar(String clave, String producto) {
        if (productos.containsKey(clave)) {
            productos.put(clave, producto);
            System.out.println("Producto Modificado");
        } else {
            System.out.println("¡Código inexistente!\nNo se modicó nada");
        }
    }

    public void eliminar(String clave) {
        if (productos.containsKey(clave)) {
            productos.remove(clave);
            System.out.println("Producto Eliminado");
        } else {
            System.out.println("¡Código inexistente!\nNo se eliminó nada");
        }
    }

    public void imprimir() {
        for (Map.Entry<String, String> elemento : productos.entrySet()) {
            System.out.println("----PRODUCTOS----");
            System.out.println(elemento.getKey() + "  " + elemento.getValue());
        }
    }
}
