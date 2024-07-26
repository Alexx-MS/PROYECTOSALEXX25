import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un ArrayList para almacenar las líneas de texto
        ArrayList<String> lines = new ArrayList<>();

        // Número de líneas a ingresar
        int numLines = 3;

        System.out.println("Ingrese " + numLines + " líneas de texto:");

        // Leer varias líneas de texto desde la entrada estándar
        for (int i = 0; i < numLines; i++) {
            System.out.print("Línea " + (i + 1) + ": ");
            // Leer la línea completa ingresada por el usuario
            String line = scanner.nextLine();
            // Añadir la línea al ArrayList
            lines.add(line);
        }

        // Mostrar las líneas ingresadas
        System.out.println("\nLas líneas ingresadas son:");
        for (String line : lines) {
            System.out.println(line);
        }

        // Cerrar el scanner
        scanner.close();
    }
}




