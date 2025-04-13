package com.gabi;

import com.gabi.util.Consola;

public class Punto10 {
    // 10. Leer 2 números enteros y realizar la multiplicación de los 2 números mediante sumas sucesivas.
    // Tipo de complejidad: O(n)

    public static void main(String[] args) {
        Punto10 punto10 = new Punto10();
        System.out.println("Ingrese el primer numero: ");
        int numero1 = Consola.pedirNumeroRecursivo();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = Consola.pedirNumeroRecursivo();
        int resultado = punto10.multiplicarRecursivo(numero1, numero2);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es " + resultado);
    }

    public int multiplicarRecursivo(int numero1, int numero2) {
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        }
        return numero1 + multiplicarRecursivo(numero1, numero2 - 1);
    }
}
