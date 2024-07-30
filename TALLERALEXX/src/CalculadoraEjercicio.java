import java.util.Scanner;

public class CalculadoraEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        int opcion;

        System.out.println("*** menu ***");
        System.out.println("¡Hola!, Bienvenido a nuestra calculadora ¿que deseas hacer hoy?  ");
        System.out.println("1.sumar\n" +
                "2.restar\n" +
                "3.multiplicar\n" +
                "4.dividir\n" +
                "5.salir");
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
}