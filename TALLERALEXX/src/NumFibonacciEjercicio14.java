import java.util.Scanner;

public class NumFibonacciEjercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese el número de términos de Fibonacci que desea calcular
        System.out.print("Ingrese el número de términos de Fibonacci que desee calcular: ");
        int n = scanner.nextInt();

        // Calcular los primeros n términos de Fibonacci
        int x = 0, y = 1; // Inicialización de los dos primeros términos
        System.out.println("Los primeros " + n + " términos de Fibonacci son:");

        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            int suma = x + y;
            x = y;
            y = suma;
        }

        scanner.close();
    }
}
