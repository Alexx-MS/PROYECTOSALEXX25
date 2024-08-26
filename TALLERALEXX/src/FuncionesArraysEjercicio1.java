public class FuncionesArraysEjercicio1 {
    public static void main(String[] args) {
        int [] array = {1,3,2,4,5,6,7,8,9,10}; //creamos una lista con numeros tipo entero
//generamos un numero objetivo  el que queramos
        int numeroObjetivo= 15;
/*usamos ciclos for en estte caso para recorrer los arrays
 y condicional if para saber quepar de  numeros me dan la suma de el numero objetivo */
        for (int i =0 ; i <array.length; i ++){
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] ==numeroObjetivo ) {
                    System.out.println("par encontrado (" + array [i] +","+array [j]+")" );
                }
            }

        }


    }
}