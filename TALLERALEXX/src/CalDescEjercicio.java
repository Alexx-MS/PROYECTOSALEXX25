import java.util.Scanner;

public class CalDescEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String producto = "laptop";
        System.out.println("ingrese el precio original del producto, "+ producto+":");
        double precioOriginal = scanner.nextDouble();
        System.out.println("ingrese el descuento para el producto: "+ producto);
        double descuento = scanner.nextInt();
        double precioFinal = obtenerDescuento(precioOriginal,descuento);

        System.out.println("precio original: $"+ precioOriginal);
        System.out.println("descuento aplicado: "+ descuento+ "%");
        System.out.println("precio final: $"+precioFinal+" del producto: "+producto);

    }
    public static double obtenerDescuento(double precioOriginal,double descuento){
        descuento = (precioOriginal * descuento)/ 100;
     double   precioFinal = precioOriginal - descuento ;
     return precioFinal;
    }
}
