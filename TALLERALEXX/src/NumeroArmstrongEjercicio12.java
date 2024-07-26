import java.util.Scanner;

public class NumeroArmstrongEjercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese un número
        System.out.print("Por favor, Ingresa un número para verificar si es un número de Armstrong: ");
        int numero = scanner.nextInt();

        // Calculamos el número de cifras del número ingresado
        int numeroCifras = String.valueOf(numero).length();

        // Calculamos la suma de los dígitos elevados a la potencia de numeroCifras
        int sum = 0;
        int numeroOriginal = numero; // Guardar el número original para comparar al final

        while (numero != 0) {
            int digito = numero % 10;
            sum += Math.pow(digito, numeroCifras);
            numero /= 10;
        }

        // Verificar si es un número de Armstrong
        if (sum == numeroOriginal) {
            System.out.println(numeroOriginal + " es un número de Armstrong.");
        } else {
            System.out.println(numeroOriginal + " no es un número de Armstrong.");
        }

        scanner.close();
    }
}
