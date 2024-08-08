import java.util.Scanner;

public class NumerosAmigos {
 public  static    Scanner scanner = new Scanner(System.in);
 
    public static int sumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }


    public static boolean sonAmigos(int num1, int num2) {
        return sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1;
    }

    public static void main(String[] args) {
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        if (sonAmigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }

        scanner.close();
    }
}
