import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();

        int numLines = 3;

        System.out.println("Ingrese " + numLines + " líneas de texto:");

        for (int i = 0; i < numLines; i++) {
            System.out.print("Línea " + (i + 1) + ": ");

            String line = scanner.nextLine();

            lines.add(line);
        }

        System.out.println("\nLas líneas ingresadas son:");
        for (String line : lines) {
            System.out.println(line);
        }

        scanner.close();
    }
}




