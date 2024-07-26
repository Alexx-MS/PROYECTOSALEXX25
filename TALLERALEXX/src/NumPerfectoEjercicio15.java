import java.util.Scanner;

public class NumPerfectoEjercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, este programa te ayudara a saber si un numero es perfecto :) ");
        // Pedimos al usuario que ingrese el número para verificar si es perfecto
        System.out.print("Ingresa un número para verificar si es perfecto: ");
        int numero = scanner.nextInt();

        // se Verifica si el número es perfecto
        if (NumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        scanner.close();
    }

    // Función para verificar si un número es perfecto
    public static boolean NumeroPerfecto(int num) {
        if (num <= 0) {
            return false; // Los números negativos y cero no son perfectos
        }

        int sumDivisores = 0;

        // Iterar sobre todos los posibles divisores hasta la mitad de num
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sumDivisores += i;
            }
        }

        // Verificar si la suma de los divisores es igual al número original
        return sumDivisores == num;
    }
}
