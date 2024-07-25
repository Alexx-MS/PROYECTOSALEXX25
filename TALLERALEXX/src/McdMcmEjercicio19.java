import java.util.Scanner;

public class McdMcmEjercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡HOLA! este programa te ayudara a saber el MCD y MCM de dos numeros, vamo´ a darle >-<");

        // Pedir al usuario que ingrese los dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Calcular el MCD y el MCM usando funciones
        int mcd = calcularMCD(num1, num2);
        int mcm = calcularMCM(num1, num2, mcd);

        // Mostrar los resultados
        System.out.println("El máximo común divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);
        System.out.println("El mínimo común múltiplo (MCM) de " + num1 + " y " + num2 + " es: " + mcm);

        scanner.close();
    }

    // Función para calcular el máximo común divisor (MCD) usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Función para calcular el mínimo común múltiplo (MCM) usando la relación MCM(a, b) = (a * b) / MCD(a, b)
    public static int calcularMCM(int a, int b, int mcd) {
        return Math.abs(a * b) / calcularMCD(a, b);
    }
}

