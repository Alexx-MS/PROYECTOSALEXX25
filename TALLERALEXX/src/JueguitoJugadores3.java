import javax.swing.JOptionPane;
import java.util.Random;

public class JueguitoJugadores3 {

    public static class Jugador {
        private String nombre;
        private int puntos;
        private static final int TIROS_MAXIMOS = 10;
        private Random random;

        public Jugador(String nombre) {
            this.nombre = nombre;
            this.puntos = 0;
            this.random = new Random();
        }

        public String getNombre() {
            return nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public void realizarTiros() {
            for (int i = 1; i <= TIROS_MAXIMOS; i++) {
                int puntosTiro = random.nextInt(11);
                puntos += puntosTiro;
                JOptionPane.showMessageDialog(null, nombre + " ha lanzado el tiro " + i + " y ha obtenido " + puntosTiro + " puntos. Total puntos: " + puntos);
            }
        }
    }

    public static void main(String[] args) {
        String nombreJugador1 = JOptionPane.showInputDialog("Ingresa el nombre del Jugador 1:");
        String nombreJugador2 = JOptionPane.showInputDialog("Ingresa el nombre del Jugador 2:");

        Jugador jugador1 = new Jugador(nombreJugador1);
        Jugador jugador2 = new Jugador(nombreJugador2);

        JOptionPane.showMessageDialog(null, nombreJugador1 + " empieza a lanzar.");
        jugador1.realizarTiros();

        JOptionPane.showMessageDialog(null, nombreJugador2 + " empieza a lanzar.");
        jugador2.realizarTiros();

        String ganador;
        if (jugador1.getPuntos() > jugador2.getPuntos()) {
            ganador = jugador1.getNombre();
        } else if (jugador1.getPuntos() < jugador2.getPuntos()) {
            ganador = jugador2.getNombre();
        } else {
            ganador = "Ninguno (empate)";
        }

        JOptionPane.showMessageDialog(null, "Resultados finales:\n" +
                jugador1.getNombre() + " - Puntos: " + jugador1.getPuntos() + "\n" +
                jugador2.getNombre() + " - Puntos: " + jugador2.getPuntos() + "\n" +
                "Ganador: " + ganador);
    }
}


