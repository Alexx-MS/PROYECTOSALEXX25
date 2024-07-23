public class FuncionesArraysEjercicio6 {

    public static void main(String[] args) {
        // Arreglo original de entrada
        int[] arreglo = {0,1,0,1,1,0,0,1,0,1,1,0,1};

        // Llamar al método para ordenar el arreglo
        ordenarBinarios(arreglo);

        // Imprimir el arreglo ordenado
        System.out.print("Arreglo ordenado: ");
        imprimirArreglo(arreglo);
    }

    public static void ordenarBinarios(int[] arreglo) {
        // Usaremos dos índices: uno para los ceros hacia izquierda y otro para los unos hacia derecha
        int indiceCeros = 0;
        int indiceUnos = arreglo.length - 1;

        // Recorremos el arreglo desde el principio hasta que los índices se crucen
        while (indiceCeros <= indiceUnos) {
            // Si encontramos un 0 lo dejamos donde está y avanzamos el índice de ceros
            if (arreglo[indiceCeros] == 0) {
                indiceCeros++;
            }
            // Si encontramos un 1, lo colocamos al final y retrocedemos el índice de unos
            else if (arreglo[indiceUnos] == 1) {
                indiceUnos--;
            }
            // Si encontramos un 1 en la posición de los ceros y un 0 en la posición de los unos los intercambiamos
            else {
                int tempor = arreglo[indiceCeros];
                arreglo[indiceCeros] = arreglo[indiceUnos];
                arreglo[indiceUnos] = tempor;
                indiceCeros++;
                indiceUnos--;
            }
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
