import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JuegoCartas {

    class Carta {
        private int attack;
        private int defense;
        private String elemento;

        public Carta (int atack,int defense,String elemento) {
            this.attack = atack;
            this.defense = defense;
            this.elemento = elemento;
        }

        public int getAttack() {
            return attack;
        }

        public int getDefense() {
            return defense;
        }

        public String getElemento() {
            return elemento;
        }
    }
    static final String[] ELEMENTOS = new String[]{"AGUA", "FUEGO", "RAYO", "VIENTO", "TIERRA"};
    public static Random random = new Random();

    public static void main(String[] args) {
        ArrayList <Carta> paloGeneral = new ArrayList<>();


        ArrayList<Carta> mazoJugador1 = new ArrayList<>(paloGeneral.subList(0, 5));
        ArrayList<Carta> mazoJugador2 = new ArrayList<>(paloGeneral.subList(5, 10));


    }

}
