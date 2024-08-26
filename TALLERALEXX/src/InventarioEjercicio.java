import java.util.ArrayList;
import java.util.Scanner;

// Clase para representar un producto
class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public String toString() {
        return "Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: $" + precio;
    }
}

// Clase para manejar el inventario
class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, int cantidad, double precio) {
        productos.add(new Producto(nombre, cantidad, precio));
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarTodosLosProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public void actualizarCantidad(String nombre, int nuevaCantidad) {
        Producto p = buscarProducto(nombre);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Cantidad actualizada para " + nombre);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}

// Clase principal para interactuar con el usuario
public class InventarioEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Actualizar cantidad de producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar el buffer
                    inventario.agregarProducto(nombre, cantidad, precio);
                    System.out.println("Producto agregado.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    nombre = scanner.nextLine();
                    Producto producto = inventario.buscarProducto(nombre);
                    if (producto != null) {
                        System.out.println(producto);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    inventario.mostrarTodosLosProductos();
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del producto para actualizar la cantidad: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la nueva cantidad: ");
                    cantidad = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    inventario.actualizarCantidad(nombre, cantidad);
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
