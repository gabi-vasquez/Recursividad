package com.gabi;
import com.gabi.util.Consola;

public class Punto5 {
    //  5. Leer un numero entero y calcular la sumatoria hasta el numero leído.
    //Tipo de bigout o tipo de complejidad de la funcion calcularSumatoria
    //O(n)
    public static void main(String[] args) {
        Punto5 punto5 = new Punto5();
        int numero = Consola.pedirNumeroRecursivo();
        int resultado = punto5.calcularSumatoria(numero);
        System.out.println("La sumatoria de " + numero + " es " + resultado);
    }

    public int calcularSumatoria(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + calcularSumatoria(numero - 1);
        }
    }
}
