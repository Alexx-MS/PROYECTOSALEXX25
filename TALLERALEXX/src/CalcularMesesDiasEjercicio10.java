import java.util.Scanner;

public class CalcularMesesDiasEjercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Hola! este programa te ayuda a saber cuantos dias tiene el mes que tu quieras  :)");

        // Solicitamos al usuario el número de mes
        System.out.print("Ingresa el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        // Determinar el nombre del mes y la cantidad de días usando switch
        String nombreMes;
        int totalDias;

        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                totalDias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                totalDias = 28; // cuando es un año no bisiesto
                break;
            case 3:
                nombreMes = "Marzo";
                totalDias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                totalDias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                totalDias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                totalDias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                totalDias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                totalDias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                totalDias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                totalDias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                totalDias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                totalDias = 31;
                break;
            default:
                nombreMes = "Mes inválido";
                totalDias = 0; // considerar dar un valor por default para meses inválidos
                break;
        }

        // Mostrar el resultado
        System.out.println("Mes: " + nombreMes);
        System.out.println("Cantidad de días: " + totalDias);

        scanner.close();
    }
}


