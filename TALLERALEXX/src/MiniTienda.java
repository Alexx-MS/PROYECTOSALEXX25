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
        listaProductos.add(new Producto(nombre,precio, cantidad));
        System.out.println("El Producto:"+nombre+" ha sido agregado");
    }

    public static void main(String[] args) {
        MiniTienda tienda = new MiniTienda();
        int opcion;
        tienda.mostrarMenu();
        opcion = scanner.nextInt(); // antes de procesar una opcion(despuesd de usar un scanner de tipo int )
        // limpiar el buffer sino el cree que esa opcion ya esta y la salta.
        scanner.nextLine();
        switch (opcion) {
            case 1:
                tienda.agregarNuevoProducto();
                break;
            case 2:
                tienda.mostrarProductosAgregados();
                break;
        }

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
