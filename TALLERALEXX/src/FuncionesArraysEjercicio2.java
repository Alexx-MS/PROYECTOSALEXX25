public class FuncionesArraysEjercicio2 {
    public static void main(String[] args) {
        int [] array = {1,3,2,4,5,6,7,8,9,10,5}; /*creamos un array y colocamos cualquier nuemro duplicado que queramos
         o bien como el ejercicio lo pide tambien para que el programa no encuentre numeros  duplicados */

       boolean duplicate = false;//inicilizamos la variable "duplicate" de tipo boolean
//usamos ciclos para recorrer la lista y un condicional if para saber que  numero se encuentra repetido
        for (int n =0 ; n <array.length; n++){
            for (int m = n + 1; m < array.length; m++) {
                if (array[n] == array[m]) {
                    System.out.println("Este elemento: "+ array[n]+ ", se repite");
                    duplicate = true;
                }
            }
        }
        if (!duplicate) {
            System.out.println("No se encuentran valores duplicados ");
        }

    }
}
