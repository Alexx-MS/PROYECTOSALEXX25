import java.util.Scanner;

public class NumerosAmigosEjercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Hola! este programa te ayudara a saber si dos numeros son amigos o no :) ");
        //Le Pedimos al usuario que ingrese los dos números para verificar si son amigos o no
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Verificamos si los números son amigos
        if (NumerosAmigos(numero1, numero2)) {
            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
        }

        scanner.close();
    }

    // Función para verificar si dos números son amigos
    public static boolean NumerosAmigos(int numero1, int numero2) {
        // Calcular la suma de los divisores de num1 y num2
        int sumaDivisoresNumero1 = sumarDivisores(numero1);
        int sumaDivisoresNumero2 = sumarDivisores(numero2);

        // Verificar si son números amigos
        return (sumaDivisoresNumero1 == numero2 && sumaDivisoresNumero2 == numero1);
    }

    // Función para sumar los divisores de un número
    public static int sumarDivisores(int num) {
        int suma = 0;
        // Iterar desde 1 hasta la mitad de num
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
