import java.util.Random;

public class JuegoTiradores {

    class Jugador {
        private int salud;
        private Random random;

        public Jugador(int salud) {
            this.salud = salud;
            this.random = new Random();
        }
        public void recibirDaño(int daño) {
            this.salud -= daño;
            if (this.salud < 0) {
                this.salud = 0;
            }
        }
        public int atacar() {
            int daño = random.nextInt(100) + 1;
            return daño;
        }
        public int getSalud() {
            return salud;
        }
    }
    public void iniciarPelea(Jugador jugador1, Jugador jugador2) {
        while (jugador1.getSalud() > 0 && jugador2.getSalud() > 0) {
            int daño1 = jugador1.atacar();
            jugador2.recibirDaño(daño1);
            System.out.println("Jugador 1 ha atacado a Jugador 2 con " + daño1 + " de daño. Salud de Jugador 2: " + jugador2.getSalud());

            if (jugador2.getSalud() <= 0) {
                System.out.println("Jugador 2 ha sido Eliminado. ¡Jugador 1 gana!");
                break;
            }

            int daño2 = jugador2.atacar();
            jugador1.recibirDaño(daño2);
            System.out.println("Jugador 2 ha atacado a Jugador 1 con " + daño2 + " de daño. Salud de Jugador 1: " + jugador1.getSalud());

            if (jugador1.getSalud() <= 0) {
                System.out.println("Jugador 1 ha sido Eliminado. ¡Jugador 2 gana!");
            }
        }
    }
    public static void main(String[] args) {
        JuegoTiradores juego = new JuegoTiradores();
        Jugador jugador1 = juego.new Jugador(1000);
        Jugador jugador2 = juego.new Jugador(1000);

        juego.iniciarPelea(jugador1, jugador2);
    }
}
