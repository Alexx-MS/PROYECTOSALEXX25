import java.util.ArrayList;
import java.util.Scanner;

public class Siuuuu {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una línea de texto: ");

        String userInput = scanner.nextLine();

        System.out.println("Has ingresado: " + userInput);

        scanner.close();
    }

}

