import java.util.Scanner;

public class CalculadoraEjercicio {
    public static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double numero1, numero2;
        int opcion;
        mostrarMenu();
        opcion = scanner.nextInt();
        System.out.println("Ingresa el primer numero");
        numero1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero");
        numero2 = scanner.nextDouble();

        switch (opcion) {
            case 1:
                double suma = sumar(numero1, numero2);
                System.out.println("El resultado de la suma es:" + suma);
                break;
            case 2:
                double resta = restar(numero1, numero2);
                System.out.println("El resultado de la resta es:" + resta);
                break;
            case 3:
                double multiplicacion = multiplicar(numero1,numero2);
                System.out.println("El resultado de la multiplicacion es "+ multiplicacion);
                break;
            case 4:
                if (numero2 != 0){
                    System.out.println("El resultado de la multiplicacion es:" +dividir(numero1, numero2) );
                } else {
                    System.out.println("¡Error!, no es posible dividir por cero(0)");
                }
                break;
            case 5:
                System.out.println();
                break;
            case 6:
                System.out.println("Gracias por usar nuestra calculadora :)");
                break;
            default:
                System.out.println("Por favor,Ingresa una opcion valida(1-5)");
                break;
        }
        scanner.close();
    }

    public static double sumar(double numero1, double numero2) {
        double suma = numero1 + numero2;
        return suma;
    }

    public static double restar(double numero1, double numero2) {
        double resta = numero1 - numero2;
        return resta;

    }

    public static double multiplicar(double numero1, double numero2) {
        double producto = numero1 + numero2;
        return producto;
    }
    public static double dividir(double numero1, double numero2) {
       double division = numero1 / numero2;
       return division;

    }
    public static void mostrarMenu(){
        System.out.println("*** MENU >-< ***");
        System.out.println("¡Hola!, Bienvenido a nuestra calculadora ¿que deseas hacer hoy?  ");
        System.out.println("1.Sumar\n" +
                "2.Restar\n" +
                "3.Multiplicar\n" +
                "4.Dividir\n" +
                "5.Saber si dos numero es amigo/n" +
                "6.Salir");

    }
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

    public static void imprimirResultado(int num1, int num2) {
        System.out.println(sonAmigos(num1, num2));
        if (sonAmigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }

        scanner.close();
    }
}
