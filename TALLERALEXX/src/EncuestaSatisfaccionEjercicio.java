import java.util.Scanner;

public class EncuestaSatisfaccionEjercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número de preguntas y opciones
        final int NUM_PREGUNTAS = 5;
        final int OPCIONES = 5;

        // Crear una matriz para contar las respuestas de cada pregunta
        int[][] respuestas = new int[NUM_PREGUNTAS][OPCIONES];

        // Solicitar el número de clientes que completaron la encuesta
        int numClientes = obtenerNumeroClientes(scanner);

        // Recolectar respuestas
        recolectarRespuestas(scanner, respuestas, numClientes);

        // Mostrar resumen de respuestas
        mostrarResumen(respuestas);

        scanner.close();
    }

    // Función para obtener el número de clientes
    private static int obtenerNumeroClientes(Scanner scanner) {
        System.out.print("Ingrese el número de clientes que completaron la encuesta: ");
        return scanner.nextInt();
    }

    // Función para recolectar las respuestas de los clientes
    private static void recolectarRespuestas(Scanner scanner, int[][] respuestas, int numClientes) {
        for (int cliente = 1; cliente <= numClientes; cliente++) {
            System.out.println("\nCliente " + cliente + ":");
            for (int pregunta = 0; pregunta < respuestas.length; pregunta++) {
                while (true) {
                    System.out.print("  Respuesta a la pregunta " + (pregunta + 1) + " (1-5): ");
                    int respuesta = scanner.nextInt();
                    if (respuesta >= 1 && respuesta <= 5) {
                        respuestas[pregunta][respuesta - 1]++;
                        break;
                    } else {
                        System.out.println("Por favor, ingrese un número entre 1 y 5.");
                    }
                }
            }
        }
    }

    // Función para mostrar el resumen de respuestas
    private static void mostrarResumen(int[][] respuestas) {
        System.out.println("\nResumen de respuestas:");
        for (int pregunta = 0; pregunta < respuestas.length; pregunta++) {
            System.out.println("\nPregunta " + (pregunta + 1) + ":");
            for (int opcion = 0; opcion < respuestas[pregunta].length; opcion++) {
                System.out.println("  Opción " + (opcion + 1) + ": " + respuestas[pregunta][opcion] + " respuesta(s)");
            }
        }
    }
}
