public class FuncionesArraysEjercicio4 {

    public static void main(String[] args) {
        // Arreglo primario de entrada
        int[] arregloPrimario = {15,35,25,12,13,50,20};

        // Nuevo arreglo para almacenar las sumas de los elementos precedentes
        int[] arregloSumaPrecedentes = new int[arregloPrimario.length];

        // Calcular las sumas de los elementos precedentes
        calcularSumaPrecedentes(arregloPrimario, arregloSumaPrecedentes);

        // Imprimir el nuevo arreglo
        System.out.print("Arreglo original: ");
        imprimirArreglo(arregloPrimario);
        System.out.print("Arreglo con sumas de elementos precedentes: ");
        imprimirArreglo(arregloSumaPrecedentes);
    }

    public static void calcularSumaPrecedentes(int[] arregloOriginal, int[] arregloSumaPrecedentes) {
        // Variable para llevar la suma acumulada
        int sumaAcumulada = 0;

        // Recorrer el arreglo original y calcular las sumas de los elementos precedentes
        for (int i = 0; i < arregloOriginal.length; i++) {
            sumaAcumulada += arregloOriginal[i];
            arregloSumaPrecedentes[i] = sumaAcumulada;
        }
    }

    // Método para imprimir un arreglo de números enteros
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

