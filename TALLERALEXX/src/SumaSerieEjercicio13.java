import java.util.Scanner;

public class SumaSerieEjercicio13 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n;
        double result = 0;
        while (true) {

            System.out.println("INGRESA UN NUMERO ENTERO POSITIVO: ");
            n = num.nextInt();

            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    result = result + (1 / (double) i);

                }

                System.out.println("El resultado es: " + result);
                {
                    break;
                }

            } else {
                System.out.println("El numero ingresado no es correcto, ingrese un numero valido nuevamente ");
            }
        }
    }
}

