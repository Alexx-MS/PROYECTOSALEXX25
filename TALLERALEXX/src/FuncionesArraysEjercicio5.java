public class FuncionesArraysEjercicio5 {

    public static void main(String[] args) {
        // Arreglo original de entrada (numeros que deseemos)
        int[] arregloOriginal = {10,13,15,17,18,19,20};
        // Número de posiciones a desplazar
        int n = 4;

        // Realizar el desplazamiento
        desplazarArreglo(arregloOriginal , n);

        // Imprimir el arreglo desplazado y original
        System.out.println();
        System.out.print("Arreglo Desplazado: ");
        imprimirArray(arregloOriginal );
    }

    public static void desplazarArreglo(int[] arreglo, int n) {
        // Validar si el arreglo está vacío o n es 0
        if (arreglo.length == 0 || n == 0) {
            return; // No se hace nada si no hay elementos o no hay desplazamiento
        }

        // Normalizamos n para evitar desplazamientos innecesarios
        n = n % arreglo.length;
        if (n < 0) {
            n = n + arreglo.length; // Ajuste para desplazamientos negativos
        }

        // Creamos un arreglo auxiliar para almacenar los elementos desplazados
        int[] auxi = new int[arreglo.length];

        // Copiamos los elementos que se desplazan al inicio del arreglo auxiliar
        System.arraycopy(arreglo, 0, auxi, arreglo.length - n, n);

        // Copiamos los elementos restantes al final del arreglo auxiliar
        System.arraycopy(arreglo, n, auxi, 0, arreglo.length - n);

        // Copiamos el arreglo auxiliar de vuelta al arreglo original
        System.arraycopy(auxi, 0, arreglo, 0, arreglo.length);
    }

    // Método para imprimir el arreglo de números enteros
    public static void imprimirArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
