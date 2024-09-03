import java.util.Random;

public class JuegoTiradores2 {

    class Jugador {
        private int salud;
        private Random random;
        private int specialSkill;

        public Jugador(int salud, int specialSkill) {
            this.salud = salud;
            this.random = new Random();
            this.specialSkill = specialSkill;
        }

        public void recibirDaño(int daño) {
            this.salud -= daño;
            if (this.salud < 0) {
                this.salud = 0;
            }
        }

        public int atacar() {
            return random.nextInt(100) + 1;
        }

        public int getSalud() {
            return salud;
        }

        public int getSpecialSkill() {
            return specialSkill;
        }
    }

    public void iniciarPelea(Jugador jugador1, Jugador jugador2) {
        while (jugador1.getSalud() > 0 && jugador2.getSalud() > 0) {
            int daño1 = jugador1.atacar();
            jugador2.recibirDaño(daño1);
            System.out.println("🤜🎇🤛 Jugador 1 ha atacado a Jugador 2 con " + daño1 + " de daño 🤜🎇🤛 . ⛑  Salud de Jugador 2 ⛑ : " + jugador2.getSalud());

            if (jugador1.getSalud() <= 100 && daño1 <= 20) {
                aplicarHabilidadEspecial(jugador1, jugador2);
            }

            if (jugador2.getSalud() <= 0) {
                System.out.println(" ☠ Jugador 2 ha sido Eliminado ☠ . 🏆 ¡Jugador 1 gana! 🏆 ");
                break;
            }

            int daño2 = jugador2.atacar();
            jugador1.recibirDaño(daño2);
            System.out.println("🤜🎇🤛 Jugador 2 ha atacado a Jugador 1 con " + daño2 + " de daño  🤜🎇🤛 . ⛑ Salud de Jugador 1 ⛑ : " + jugador1.getSalud());

            if (jugador2.getSalud() <= 100 && daño2 <= 20) {
                aplicarHabilidadEspecial(jugador2, jugador1);
            }

            if (jugador1.getSalud() <= 0) {
                System.out.println(" ☠ Jugador 1 ha sido Eliminado ☠ . 🏆 ¡Jugador 2 gana! 🏆 ");
            }
        }
    }

    private void aplicarHabilidadEspecial(Jugador atacante, Jugador defensor) {
        String nombreAtacante = (atacante == defensor ? "jugador 1" : "juagdor 2");
        System.out.println(" 💀  El " + nombreAtacante  + " ha activado la habilidad especial. Su daño automático es : " + atacante.getSpecialSkill() + " 💀");
        defensor.recibirDaño(atacante.getSpecialSkill());
    }

    public static void main(String[] args) {
        JuegoTiradores2 juego = new JuegoTiradores2();
        Jugador jugador1 = juego.new Jugador(1000, 500);
        Jugador jugador2 = juego.new Jugador(1000, 500);

        juego.iniciarPelea(jugador1, jugador2);
    }
}
