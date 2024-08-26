import java.util.Scanner;

public class DeterminarAñoBisiestoEjercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ESTE PROGRAMA TE AYUDARA A SABER SI EL AÑO QUE DESEES INGRESAR ES BISIESTO O NO ");
        System.out.println("Ingresa el año que desees:");
        int year = scanner.nextInt();

        if ((year % 4 == 0 ) && ((year % 100 != 0)  || (year % 400 == 0))) {
            System.out.println("EL AÑO "+ year +" ES BISIESTO");
        } else  {
            System.out.println("EL AÑO "+ year +" NO ES BISIESTO");
        }
    }
}
