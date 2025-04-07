package com.gabi;

public class CalcularFactorial {

    public int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }

    //Tipo de bigout o tipo de complejidad de la funcion calcularFactorial
    //O(n)
    //El tiempo de ejecucion es O(n) porque la funcion se llama a si misma n veces

}
