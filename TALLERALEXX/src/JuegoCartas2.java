import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Carta {
   int atk;
   int def;
   String elemento;

    public Carta(int atk, int def, String elemento) {
        this.atk = atk;
        this.def = def;
        this.elemento = elemento;
    }
}

public class JuegoCartas2 {

    static final String[] ELEMENTOS = {"🔥FUEGO🔥", "🍃VIENTO🍃", "🌩️RAYO🌩️", "🌍TIERRA🌍", "💧AGUA💧"};
    static final Random random = new Random();

    public static void main(String[] args)
    {
        ArrayList<Carta> mazoGeneral = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int atk = 100 + random.nextInt(901);
            int def = 100 + random.nextInt(901);
            String elemento = ELEMENTOS[random.nextInt(ELEMENTOS.length)];
            mazoGeneral.add(new Carta(atk, def, elemento));
        }
        Collections.shuffle(mazoGeneral);

        ArrayList<Carta> mazoJugador1 = new ArrayList<>(mazoGeneral.subList(0, 5));
        ArrayList<Carta> mazoJugador2 = new ArrayList<>(mazoGeneral.subList(5, 10));

        Scanner scanner = new Scanner(System.in);

        int dado = 1 + random.nextInt(6);
        System.out.println("El dado muestra: " + dado);
        boolean jugador1Inicia = dado > 3;
        if (jugador1Inicia) {
            System.out.println("Jugador 1 inicia.");
        } else {
            System.out.println("Jugador 2 inicia.");
        }

        while (!mazoJugador1.isEmpty() && !mazoJugador2.isEmpty()) {
            if (jugador1Inicia) {
                jugarTurno(scanner, mazoJugador1, mazoJugador2);
                if (mazoJugador2.isEmpty()) {
                    System.out.println("¡Jugador 1 gana!");
                    break;
                }
                jugador1Inicia = false;
            } else {
                jugarTurno(scanner, mazoJugador2, mazoJugador1);
                if (mazoJugador1.isEmpty()) {
                    System.out.println("¡Jugador 2 gana!");
                    break;
                }
                jugador1Inicia = true;
            }
        }

        scanner.close();
    }

    private static void jugarTurno(Scanner scanner, ArrayList<Carta> atacante, ArrayList<Carta> defensor) {
        System.out.println("Elige una carta para atacar:");
        mostrarCartas(atacante);
        int cartaAtacanteIdx = obtenerIndiceCarta(scanner, atacante);
        Carta cartaAtacante = atacante.get(cartaAtacanteIdx);
        atacante.remove(cartaAtacante);

        System.out.println("Elige una carta para defender:");
        mostrarCartas(defensor);
        int cartaDefensorIdx = obtenerIndiceCarta(scanner, defensor);
        Carta cartaDefensor = defensor.get(cartaDefensorIdx);

        int ataque = cartaAtacante.atk;
        int defensa = cartaDefensor.def;

        if (elementoMasFuerte(cartaAtacante.elemento, cartaDefensor.elemento)) {
            ataque += ataque * 0.20;
            defensa -= defensa * 0.30;
        }

        int dadoAtacante = 1 + random.nextInt(20);
        int dadoDefensor = 1 + random.nextInt(20);
        ataque += dadoAtacante;
        defensa += dadoDefensor;

        System.out.println(" ⚔️😈 Ataque final del atacante 😈⚔️ ️ : " + ataque);
        System.out.println(" 🛡️ Defensa final del defensor 🛡️ : " + defensa);

        if (ataque > defensa) {
            System.out.println(" ⚔️😈 ¡El atacante gana el turno!  😈⚔️ ");
            defensor.remove(cartaDefensor);
        } else {
            System.out.println(" 🛡️ ¡El defensor gana el turno! 🛡️ ");
            atacante.remove(cartaAtacante);
        }
    }

    private static boolean elementoMasFuerte(String elementoAtacante, String elementoDefensor) {
        Map<String, String> fortalezas = new HashMap<>();
        fortalezas.put("Fuego", "Agua");
        fortalezas.put("Viento", "Tierra");
        fortalezas.put("Rayo", "Agua");
        fortalezas.put("Tierra", "Fuego");
        fortalezas.put("Agua", "Fuego");

        return fortalezas.getOrDefault(elementoAtacante, "").equals(elementoDefensor);
    }

    private static void mostrarCartas(ArrayList<Carta> mazo) {
        for (int i = 0; i < mazo.size(); i++) {
            Carta carta = mazo.get(i);
            System.out.println((i + 1) + ": ⚔️ ATTACK ⚔️ : " + carta.atk + ", 🛡️ DEFENSE 🛡️ : " + carta.def + ", Elemento: " + carta.elemento);
        }
    }

    private static int obtenerIndiceCarta(Scanner scanner, ArrayList<Carta> mazo) {
        int idx;
        while (true) {
            idx = scanner.nextInt() - 1;
            if (idx >= 0 && idx < mazo.size()) break;
            System.out.println("Índice no válido. Elige una carta válida:");
        }
        return idx;
    }
}
