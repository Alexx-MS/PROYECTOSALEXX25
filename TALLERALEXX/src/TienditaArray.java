import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TienditaArray {
    private static List<String> productosDisponibles = new ArrayList<>();
    private static List<List<String>> historialCompras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir){
            System.out.println("¡HOLA BIENVENIDO! ¿Que deseas hacer hoy? ");
            System.out.println("** MENU **");
            System.out.println("1.Agregar Producto");
            System.out.println("2.Ver Lista de Productos Disponibles");
            System.out.println("3.Comprar Productos");
            System.out.println("4.Ver Historial de Compras");
            System.out.println("5.Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    comprarProductos();
                    break;
                case 4:
                    mostrarHistorial();
                    break;
                case 5:
                    System.out.println("¡Gracias por preferirnos!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida, por favor ingresa una opcion valida");
                    break;
            }

        }

    }

    public static void agregarProducto() {
        System.out.println("Ingresa el nombre del producto");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa el precio del producto");
        double precio = scanner.nextDouble();
        System.out.println("Ingresa la cantidad disponible");
        int cantidad = scanner.nextInt();
        String producto ="Producto :"+ nombre + "Precio $" + precio +"Cantidad"+ cantidad;
        productosDisponibles.add(producto);
    }

    public static void mostrarProductos() {
        if (productosDisponibles.isEmpty()) {
            System.out.println("No hay productos disponibles");
        } else {
            System.out.println("Productos disponibles");
            for (String producto : productosDisponibles) {
                System.out.println(producto);
            }

        }

    }

    public static void comprarProductos() {
        ArrayList<String> productosCompra = new ArrayList<>();
        while (true) {
            mostrarProductos();
            System.out.println("Ingresa el nombre del producto a comprar o para finalizar (fin)");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")){
                break;
            }
            boolean encontrado = false;
            for (String producto : productosDisponibles) {
                if (producto.startsWith(nombre)) {
                    productosCompra.add(producto);
                    encontrado = true;
                    System.out.println("Producto añadido a la compra ");
                    break;
                }

            }
            if (!encontrado) {
                System.out.println("Producto no encontrado ");
            }
        }
        if (!productosCompra.isEmpty()) {
            historialCompras.add(productosCompra);
            System.out.println("Compra realizada con exito");
        } else {
            System.out.println("No se realizo la compra");
        }
    }
    public static void mostrarHistorial (){
        if (!historialCompras.isEmpty()){
            System.out.println("No hay historial de compras");
        } else {
            System.out.println("------Historial de compras----- ");
            int numerocompra = 1;
            for (List<String> compra : historialCompras){
                System.out.println("Compra" + numerocompra+ ":");
                double total = 0;
                for (String producto : compra){
                    System.out.println(producto);
                    String[] partes = producto.split("- \\$");
                    total += Double.parseDouble(partes[1]);

                }
                System.out.println("total de compra :$"+ total);
                numerocompra++;
            }

        }

    }

}

