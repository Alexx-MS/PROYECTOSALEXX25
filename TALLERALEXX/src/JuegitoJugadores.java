import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JuegitoJugadores {
    private static final int META_PUNTOS = 50;
    private static final int NUM_JUGADORES = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] puntos = new int[NUM_JUGADORES];
        boolean ganadorEncontrado = false;

        for (int i = 0; i < NUM_JUGADORES; i++) {
            puntos[i] = 0;
        }

        System.out.println("¡Bienvenido al Juego de Dados!");

        while (!ganadorEncontrado) {
            for (int i = 0; i < NUM_JUGADORES; i++) {
                JOptionPane.showMessageDialog(null,"Jugador " + (i + 1) + ", es tu turno.");
                JOptionPane.showMessageDialog(null,"Presiona Enter para tirar el dado...");
                scanner.nextLine();
                int resultadoDado = random.nextInt(6) + 1;
                JOptionPane.showInputDialog("Sacaste un " + resultadoDado);

                puntos[i] += resultadoDado;

                JOptionPane.showMessageDialog(null,"Puntos actuales del Jugador " + (i + 1) + ": " + puntos[i]);

                if (puntos[i] >= META_PUNTOS) {
                    JOptionPane.showMessageDialog(null,"¡Jugador " + (i + 1) + " ha ganado con " + puntos[i] + " puntos!");
                    ganadorEncontrado = true;
                    break;
                }
            }
        }

        scanner.close();
    }
}
