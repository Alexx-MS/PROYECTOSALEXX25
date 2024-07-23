public class FuncionesArraysEjercicio3 {

    public static void main(String[] args) {
        // Arreglo primario de números enteros
        int[] primerArreglo = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        // Arreglos para almacenar números pares e impares
        int[] pares = new int[primerArreglo.length];
        int[] impares = new int[primerArreglo.length];

        //inicimanos variables para los  Contadores para los índices de los arreglos pares e impares
        int contPares = 0;
        int contImpares = 0;

        // Iterar sobre el arreglo original
        for (int numero : primerArreglo) {
            if (numero % 2 == 0) {
                // Es par, agregar al arreglo de pares
                pares[contPares] = numero;
                contPares++;
            } else {
                // Es impar, agregar al arreglo de impares
                impares[contImpares] = numero;
                contImpares++;
            }
        }

        // Imprimir resultados
        System.out.print("Arreglo original: ");
        imprimirArreglo(primerArreglo);
        System.out.print("Pares: ");
        imprimirArreglo(pares, contPares);
        System.out.print("Impares: ");
        imprimirArreglo(impares, contImpares);
    }

    // Método para imprimir un arreglo de números enteros
    public static void imprimirArreglo(int[] arreglo, int cantidadElementos) {
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    // Método  para imprimir un arreglo completo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
