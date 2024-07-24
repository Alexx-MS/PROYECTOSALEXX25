import java.util.Scanner;

public class NumDigitosEjercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //le Pedimos al usuario que ingrese un número
        System.out.print("Ingrese un número entero: ");
        long numero = scanner.nextLong(); // Usamos el tipo long para manejar números grandes

        // Contar los dígitos del número
        int cantidadDigitos = contarDigitos(numero);

        // Mostrar la cantidad de dígitos
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");

        scanner.close();
    }

    // Función para contar los dígitos de un número
    public static int contarDigitos(long num) {
        // Manejamos números negativos convirtiéndolos a positivos
        num = Math.abs(num);

        // Caso para el número 0
        if (num == 0) {
            return 1; // El número 0 tiene un solo dígito
        }

        int cont = 0;

        // Iteramos dividiendo el número por 10 hasta que sea cero
        while (num > 0) {
            num = num / 10;
            cont++;
        }

        return cont;
    }
}
