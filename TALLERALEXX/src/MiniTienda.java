import java.util.ArrayList;
import java.util.Scanner;

public class MiniTienda {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Producto> listaProductos = new ArrayList<>();

    class  Producto {
        private String  nombre;
        private Double precio;
        private int cantidad;

        public Producto (String nombre,Double precio,int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }
        public String getNombre() {
            return nombre;
        }
        public Double getPrecio() {
            return precio;
        }
        public int getCantidad() {
            return cantidad;
        }
        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad;
        }

    }
    public void agregarNuevoProducto (){
        System.out.println("AGREGAR NUEVO PRODUCTO:");
        System.out.println("Ingresa el nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa el precio del producto:");
        Double precio = scanner.nextDouble();
        System.out.println("Ingresa la cantidad del producto: "+nombre );
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        listaProductos.add(new Producto(nombre,precio,cantidad));
        System.out.println("El Producto:"+nombre+" ha sido agregado");
    }

    public static void main(String[] args) {
        MiniTienda tienda = new MiniTienda();
        int opcion;
        do {
            tienda.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    tienda.agregarNuevoProducto();
                    break;
                case 2:
                    tienda.mostrarProductosAgregados();
                    break;
                default:
                    if (opcion != 0) {
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                    }
            }
        } while (opcion != 0);

    }
    public static void mostrarMenu (){
        System.out.println("¡HOLA BIENVENIDO A LA TIENDA DE PEPE 🤗!");
        System.out.println("¡Que Deseas Hacer Hoy?");
        System.out.println("1.Agregar Nuevo Producto");
        System.out.println("2.Mostrar Productos Agregados");
    }
    public void mostrarProductosAgregados() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos agregados.");
            return;
        }
        System.out.println("Lista de productos agregados:");
        for (Producto aux : listaProductos) {
            System.out.println(aux);
        }

    }
}
