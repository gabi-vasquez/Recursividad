package com.gabi;

public class CalcularSumatoria {

    public int calcularSumatoria(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + calcularSumatoria(numero - 1);
        }
    }

    public double calcularSumatoriaFracciones(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return 1.0 / numero + calcularSumatoriaFracciones(numero - 1);
        }
    }
}
//Tipo de bigout o tipo de complejidad de la funcion CalcularSumatoria
//O(n)
//Tipo de bigout o tipo de complejidad de la funcion CalcularSumatoriaFracciones
//O(n)
//El tiempo de ejecucion es O(n) porque la funcion se llama a si misma n veces