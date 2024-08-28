import java.util.Random;

public class NumerosPrimos {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random numrandom = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numrandom.nextInt(200);
        }
        System.out.print("Vector de Numeros Aleatorios: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Resultado numeros : ");
        for (int num : vector) {
            if (esPrimoo(num)) {
                System.out.print(num + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
        System.out.println();
    }
    public static boolean esPrimoo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}