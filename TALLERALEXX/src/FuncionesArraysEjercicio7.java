public class FuncionesArraysEjercicio7 {

    public static void main(String[] args) {
        //* Arreglo original de entrada **//
        String[] arreglo = {"lunes","martes","miercoles","jueves","sabado","domingo"};
        // Elemento a insertar
        String nuevoElemento = "viernes";
        // Posición donde se va a insertar el nuevo elemento (índice 2)
        int posicion = 4;

        // Llamar al método para insertar el nuevo elemento
        arreglo = insertarElemento(arreglo, nuevoElemento, posicion);

        // Imprimir el arreglo con el nuevo elemento insertado
        System.out.print("Arreglo con el nuevo elemento insertado: ");
        imprimirArreglo(arreglo);
    }

    public static String[] insertarElemento(String[] arreglo, String elemento, int posicion) {
        // Crear un nuevo arreglo con una longitud mayor en uno para acomodar el nuevo elemento
        String[] nuevoArreglo = new String[arreglo.length + 1];

        // Copiamos los elementos desde el arreglo original hasta la posición deseada
        for (int i = 0; i < posicion; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        // Insertar el nuevo elemento en la posición especificada
        nuevoArreglo[posicion] = elemento;

        // Copiamos los elementos restantes desde la posición siguiente en el arreglo original
        for (int i = posicion; i < arreglo.length; i++) {
            nuevoArreglo[i + 1] = arreglo[i];
        }

        // Retornamos el nuevo arreglo con el elemento insertado
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
