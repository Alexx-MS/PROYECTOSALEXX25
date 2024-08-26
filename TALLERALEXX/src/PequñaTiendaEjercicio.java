import java.util.ArrayList;

public class PequñaTiendaEjercicio {
    public static void main(String[] args) {
        ArrayList<Producto> lista = new ArrayList<Producto>();

        lista.add(new Producto("CPU", 5, 1500000));
        lista.add(new Producto("Tarjeta Grafica", 15, 1000000));
        lista.add(new Producto("SSD", 12, 1000000));
        lista.add(new Producto("Monitor", 30, 2000000));
        lista.add(new Producto("Teclado", 30, 700000));
        lista.add(new Producto("Fuente de Poder", 50, 550000));
        System.out.println("-----for-----");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Producto :" + lista.get(i).getNombre()+"\nCantidad :"+ lista.get(i).getCantidad()+"\nPrecio :"+ lista.get(i).getPrecio());

        }
        for (Producto aux : lista){
            System.out.println(aux.toString());
        }

    }


}


