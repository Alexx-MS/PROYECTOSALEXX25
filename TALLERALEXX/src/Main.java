import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Selecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            int opcion = scanner.nextInt();

            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: "+sumar(num1,num2) );
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: "+restar(num1,num2) );
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: "+multip(num1,num2) );
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("El resultado de la división es: " +dividir(num1,num2) );
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            // Preguntar si el usuario desea continuar
            System.out.print("¿Deseas realizar otra operación? (si/no): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("si"));

        // Cerrar el escáner
        scanner.close();

        System.out.println("Gracias por usar la calculadora.");
    }
    public static double sumar(double numero1,double numero2){
       double suma = numero1 + numero2;
        return suma;
    }
    public static double restar(double numero1,double numero2){
       double resta = numero1 - numero2;
        return resta;
    }
    public static double multip(double numero1,double numero2) {
        double producto = numero1 - numero2;
        return producto;
    }
    public static double dividir(double numero1, double numero2){
        double division = numero1 / numero2;
        return division;
    }
}





