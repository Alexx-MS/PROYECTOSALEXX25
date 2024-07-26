<<<<<<< HEAD
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            // Mostrar el menú de operaciones
            System.out.println("Selecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            // Leer la opción del usuario
            int opcion = scanner.nextInt();

            // Leer los números para operar
            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();

            // Variable para almacenar el resultado
            double resultado = 0;

            // Ejecutar la operación según la opción seleccionada
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
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
}











=======
>>>>>>> 8b13e10b1a5ed576617539c9685b4ffb3be3efd0
