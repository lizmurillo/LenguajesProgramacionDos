package tienda_InterfazMap;

import java.util.*;

public class ejecutableProductos {

    public static void main(String[] args) {
        int op;
        String clave, producto;

        Scanner sc = new Scanner(System.in);
        productos opp = new productos();

        do {
            System.out.println("MENÚ TIENDA"
                    + "\n 1.Ingresar Productos"
                    + "\n 2.Modificar Producto"
                    + "\n 3.Imprimir Productos"
                    + "\n 4.Eliminar Productos"
                    + "\n 5.Salir");
            System.out.println("Ingrese su Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese código del producto: ");
                    clave = sc.next();
                    System.out.println("Ingrese Nombre del producto:");
                    producto = sc.next();
                    opp.agregar(clave, producto);
                    break;
                case 2:
                    System.out.println("Ingrese el código del producto que desea modificar:");
                    clave = sc.next();
                    System.out.println("Ingrese el nombre del producto:");
                    producto = sc.next();
                    opp.modificar(clave, producto);
                    break;
                case 3:
                    opp.imprimir();
                    break;
                case 4:
                    System.out.println("Ingrese el código del producto a eliminar:");
                    clave = sc.next();
                    opp.eliminar(clave);
                    break;
                case 5:
                    System.out.println("Gracias, ¡Vuelva Pronto!");
                    break;
                default:
                    System.out.println("Opción NO Válida!");
                    break;
            }
        } while (op != 5);
    }

}
