import java.util.Scanner;

public class NotasFinalesEjercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo para almacenar las notas
        double[] notas = new double[5];

        // Solicitar al usuario que ingrese las 5 notas finales
        System.out.println("Ingrese las 5 notas finales:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Contar cuántas notas son mayores o iguales a 3.0
        int contadorNotas = contarNotas(notas);

        // Mostrar el resultado
        System.out.println("Número de notas mayores o iguales a 3.0: " + contadorNotas);

        scanner.close();
    }

    // Función para contar cuántas notas son mayores o iguales a 3.0
    public static int contarNotas(double[] notas) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 3.0) {
                contador++;
            }
        }
        return contador;
    }
}
