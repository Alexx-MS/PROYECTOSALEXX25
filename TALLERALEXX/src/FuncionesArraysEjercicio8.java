public class FuncionesArraysEjercicio8 {

    public static void main(String[] args) {
        // Arreglo original de entrada
        String[] arreglo = {"arroz","cebolla","sal","plato","condimentos","agua"};
        // Posición del elemento a eliminar
        int posicionEliminar = 3;

        // Llamar al método para eliminar el elemento
        arreglo = eliminarElemento(arreglo, posicionEliminar);

        // Imprimir el arreglo resultante después de eliminar el elemento
        System.out.print("Arreglo después de eliminar el elemento: ");
        imprimirArreglo(arreglo);
    }

    public static String[] eliminarElemento(String[] arreglo, int posicionEliminar) {
        // Creamos un nuevo arreglo con una longitud menor en uno para eliminar el elemento
        String[] nuevoArreglo = new String[arreglo.length - 1];

        // Copiamos los elementos desde el arreglo original hasta la posición anterior a la eliminada
        for (int i = 0; i < posicionEliminar; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        // Copiamos los elementos restantes desde la posición siguiente en el arreglo original
        for (int i = posicionEliminar + 1; i < arreglo.length; i++) {
            nuevoArreglo[i - 1] = arreglo[i];
        }

        // Retornamos el nuevo arreglo con el elemento eliminado
        return nuevoArreglo;
    }

    // Método para imprimir un arreglo de strings
    public static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
