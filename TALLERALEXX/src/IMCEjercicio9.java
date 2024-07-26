import java.util.Scanner;

public class IMCEjercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //mensaje para indicarle al usuario que este programa es para calcular su IMC :)
        System.out.println("¡Hola! este programa te ayudara a saber cual es tu IMC :) ");
        System.out.println();

        // Pedir al usuario que ingrese peso en kg y estatura en metros
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingresa tu estatura en metros: ");
        double estatura = Double.parseDouble(scanner.nextLine());

        // Calcular el IMC con la funcion creada
        double imc = calcularIMC(peso, estatura);


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
                System.out.println("Por favor, trata de comer mas para que subas de peso :)");
                break;
            case "Peso normal":
                System.out.println("Tienes un peso normal.");
                System.out.println("Muy bien estas en un peso normal ¡sigue asi, cuidandote!");
                break;
            case "Sobrepeso":
                System.out.println("Tienes sobrepeso.");
                System.out.println("Ten cuidado por favor haz dieta y alimentate bien, no comas mucha comida chatarra >_<");
                break;
            case "Obesidad grado I":
                System.out.println("Tienes obesidad grado I.");
                System.out.println("Visita al medico tienes problemas de obesidad  :(");
                break;
            case "Obesidad grado II":
                System.out.println("Tienes obesidad grado II.");
                System.out.println("Visita al medico tienes problemas severos de obesidad  :/");
                break;
            case "Obesidad grado III":
                System.out.println("Tienes obesidad grado III.");
                System.out.println("Visita al medico tienes problemas severos de obesidad  :/");
                break;
            default:
                System.out.println("No se pudo determinar la categoría.");
        }

        scanner.close();
    }
    //funcion para calculr el IMC
    public static double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }
}

