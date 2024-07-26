import java.util.ArrayList;
import java.util.Scanner;

public class Siuuuu {
    public static void main(String[] args) {
        {
            // Crear un objeto Scanner para leer la entrada desde la consola
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese una línea de texto
            System.out.print("Ingrese una línea de texto: ");

            // Leer la línea completa ingresada por el usuario
            String userInput = scanner.nextLine();

            // Mostrar la entrada del usuario
            System.out.println("Has ingresado: " + userInput);

            // Cerrar el scanner
            scanner.close();
        }
    }

}