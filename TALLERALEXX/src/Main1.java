import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    private static List<String> productosDisponibles = new ArrayList<>();
    private static List<List<String>> historialCompras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    verProductos();
                    break;
                case 3:
                    comprarProductos();
                    break;
                case 4:
                    verHistorialCompras();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el programa! ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Añadir productos a la tienda");
        System.out.println("2. Ver la lista de productos disponibles");
        System.out.println("3. Comprar productos");
        System.out.println("4. Ver el historial de compras");
        System.out.println("5. Salir");
        System.out.print("Elija una opción: ");
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        String producto = nombre + " - $" + precio;
        productosDisponibles.add(producto);
        System.out.println("Producto añadido exitosamente.");
    }

    private static void verProductos() {
        if (productosDisponibles.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            System.out.println("Productos disponibles:");
            for (String producto : productosDisponibles) {
                System.out.println(producto);
            }
        }
    }

    private static void comprarProductos() {
        List<String> productosCompra = new ArrayList<>();
        while (true) {
            verProductos();
            System.out.print("Ingrese el nombre del producto a comprar (o 'fin' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            boolean encontrado = false;
            for (String producto : productosDisponibles) {
                if (producto.startsWith(nombre)) {
                    productosCompra.add(producto);
                    encontrado = true;
                    System.out.println("Producto añadido a la compra.");
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Producto no encontrado.");
            }
        }
        if (!productosCompra.isEmpty()) {
            historialCompras.add(productosCompra);
            System.out.println("Compra realizada con éxito.");
        } else {
            System.out.println("No se realizó ninguna compra.");
        }
    }

    private static void verHistorialCompras() {
        if (historialCompras.isEmpty()) {
            System.out.println("No hay historial de compras.");
        } else {
            System.out.println("Historial de compras:");
            int numCompra = 1;
            for (List<String> compra : historialCompras) {
                System.out.println("Compra " + numCompra + ":");
                double total = 0;
                for (String producto : compra) {
                    System.out.println(producto);
                    String[] partes = producto.split(" - \\$");
                    total += Double.parseDouble(partes[1]);
                }
                System.out.println("Total: $" + total);
                numCompra++;
            }
        }
    }
}
