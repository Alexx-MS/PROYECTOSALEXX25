import java.util.Scanner;

public class IMCEjercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese peso en kg y estatura en metros
        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la estatura en metros: ");
        double estatura = scanner.nextDouble();

        // Calcular IMC
        double imc = peso / (estatura * estatura);

        //Determinar categoría de peso usando if-else
        String categoria = "";
        if (imc < 18.5) {
            categoria = "Peso inferior al normal";
        } else if (imc >= 18.5 && imc < 25) {
            categoria = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            categoria = "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            categoria = "Obesidad grado I";
        } else if (imc >= 35 && imc < 40) {
            categoria = "Obesidad grado II";
        } else {
            categoria = "Obesidad grado III";
        }

        // Mostrar resultados usando switch para categoría
        System.out.printf("El IMC calculado es: %.2f\n", imc);
        switch (categoria) {
            case "Peso inferior al normal":
                System.out.println("Tienes un peso inferior al normal.");
                break;
            case "Peso normal":
                System.out.println("Tienes un peso normal.");
                break;
            case "Sobrepeso":
                System.out.println("Tienes sobrepeso.");
                break;
            case "Obesidad grado I":
                System.out.println("Tienes obesidad grado I.");
                break;
            case "Obesidad grado II":
                System.out.println("Tienes obesidad grado II.");
                break;
            case "Obesidad grado III":
                System.out.println("Tienes obesidad grado III.");
                break;
            default:
                System.out.println("No se pudo determinar la categoría.");
        }

        scanner.close();
    }
}

