package com.gabi;

import com.gabi.util.Consola;
public class Punto10 {
    //10. Leer 2 números enteros y realizar la multiplicación de los 2 números mediante sumas sucesivas.
    public static void main(String[] args) {
        Punto10 punto10 = new Punto10();
        System.out.println("Introduce el primer número:");
        int numero1 = Consola.pedirNumeroRecursivo();
        System.out.println("Introduce el segundo número:");
        int numero2 = Consola.pedirNumeroRecursivo();
        int resultado = punto10.multiplicar(numero1, numero2);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public int multiplicar(int numero1, int numero2) {
        if (numero2 == 0) {
            return 0;
        }
        return numero1 + multiplicar(numero1, numero2 - 1);
    }
}
