import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JueguitoJugadores2 {

    public static class Obstaculo {
        private String description;
        private int penalty; // Penalty in points

        public Obstaculo(String description, int penalty) {
            this.description = description;
            this.penalty = penalty;
        }

        public String getDescription() {
            return description;
        }

        public int getPenalty() {
            return penalty;
        }
    }

    public static class Jugador {
        private String nombre;
        private int puntos;
        private List<Obstaculo> obstacles;

        public Jugador(String nombre) {
            this.nombre = nombre;
            this.puntos = 0;
            this.obstacles = new ArrayList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public void addObstacle(Obstaculo obstacle) {
            obstacles.add(obstacle);
        }

        public void lanzarDados() {
            Random random = new Random();
            int puntosLanzados = random.nextInt(100) + 1;
            puntos += puntosLanzados;

            JOptionPane.showMessageDialog(null, nombre + " lanza: " + puntosLanzados + " | Total: " + puntos);

            if(puntosLanzados >40 && puntosLanzados <= 50 ){
                for (Obstaculo obstacle : obstacles) {
                    puntos -= obstacle.getPenalty();
                    JOptionPane.showMessageDialog(null, nombre + " ha encontrado un obstáculo: " + obstacle.getDescription() + " y pierde " + obstacle.getPenalty() + " puntos.");
                }
            }

        }

        public boolean haGanado(int meta) {
            return puntos >= meta;
        }
    }

    public static class Juego {
        private Jugador jugador1;
        private Jugador jugador2;
        private int meta;

        public Juego(String nombreJugador1, String nombreJugador2, int meta) {
            this.jugador1 = new Jugador(nombreJugador1);
            this.jugador2 = new Jugador(nombreJugador2);
            this.meta = meta;

            jugador1.addObstacle(new Obstaculo("Lodo", 5));
            jugador2.addObstacle(new Obstaculo("Roca", 5));

        }

        public void iniciar() {
            int turno = 1;

            while (true) {
                if (turno == 1) {
                    JOptionPane.showMessageDialog(null, "Turno de " + jugador1.getNombre() + ". Presiona OK para lanzar los dados...");
                    jugador1.lanzarDados();
                    if (jugador1.haGanado(meta)) {
                        JOptionPane.showMessageDialog(null, "¡" + jugador1.getNombre() + " ha ganado!");
                        break;
                    }
                    turno = 2;
                } else {
                    JOptionPane.showMessageDialog(null, "Turno de " + jugador2.getNombre() + ". Presiona OK para lanzar los dados...");
                    jugador2.lanzarDados();
                    if (jugador2.haGanado(meta)) {
                        JOptionPane.showMessageDialog(null, "¡" + jugador2.getNombre() + " ha ganado!");
                        break;
                    }
                    turno = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        String nombreJugador1 = JOptionPane.showInputDialog("Ingrese el nombre del Jugador 1:");
        String nombreJugador2 = JOptionPane.showInputDialog("Ingrese el nombre del Jugador 2:");
        int meta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de meta (puntos para ganar):"));

        Juego juego = new Juego(nombreJugador1, nombreJugador2, meta);
        juego.iniciar();
    }
}
