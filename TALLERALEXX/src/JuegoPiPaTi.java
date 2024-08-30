import javax.swing.JOptionPane;
import java.util.Random;

public class JuegoPiPaTi {
    public static void main(String[] args) {
        Random random = new Random();
        int victoriasJugador1 = 0;
        int victoriasJugador2 = 0;

        while (victoriasJugador1 < 10 && victoriasJugador2 < 10) {
            int eleccionJugador1 = random.nextInt(3) + 1;
            int eleccionJugador2 = random.nextInt(3) + 1;

            String mensajeJugador1 = "Jugador 1 eligio: " + convertirEleccion(eleccionJugador1);
            String mensajeJugador2 = "Jugador 2 eligio: " + convertirEleccion(eleccionJugador2);

            JOptionPane.showMessageDialog(null, mensajeJugador1 + "\n" + mensajeJugador2);

            if (eleccionJugador1 == eleccionJugador2) {
                JOptionPane.showMessageDialog(null, "¡Empate!");
            } else if (esGanador(eleccionJugador1, eleccionJugador2)) {
                JOptionPane.showMessageDialog(null, "¡Jugador 1 gana esta ronda!");
                victoriasJugador1++;
            } else {
                JOptionPane.showMessageDialog(null, "¡Jugador 2 gana esta ronda!");
                victoriasJugador2++;
            }

            JOptionPane.showMessageDialog(null, "Marcador actual: Jugador 1 - " + victoriasJugador1 + ", Jugador 2 - " + victoriasJugador2);
        }

        if (victoriasJugador1 == 10) {
            JOptionPane.showMessageDialog(null, "¡Jugador 1 es el ganador del juego!");
        } else {
            JOptionPane.showMessageDialog(null, "¡Jugador 2 es el ganador del juego!");
        }
    }

    private static boolean esGanador(int eleccion1, int eleccion2) {
        return (eleccion1 == 1 && eleccion2 == 3) ||
                (eleccion1 == 2 && eleccion2 == 1) ||
                (eleccion1 == 3 && eleccion2 == 2);
    }

    private static String convertirEleccion(int eleccion) {
        switch (eleccion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "Opción inválida";
        }
    }
}
