package com.gabi;

import com.gabi.util.Consola;

public class Punto11 {
    // 11. Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los elementos del vector de forma recursiva
    // Tipo de complejidad: O(n)

    public static void main(String[] args) {
        Punto11 punto11 = new Punto11();
        System.out.println("Ingrese el número de valores: ");
        int n = Consola.pedirNumeroRecursivo();
        int[] vector = new int[n];
        punto11.leerValores(vector, 0, n);
        int suma = punto11.sumarValores(vector, 0, n);
        System.out.println("La suma de los valores del vector es: " + suma);
    }

    public void leerValores(int[] vector, int indice, int n) {
        if (indice == n) {
            return;
        }
        System.out.println("Ingrese el valor " + (indice + 1) + ": ");
        vector[indice] = Consola.pedirNumeroRecursivo();
        leerValores(vector, indice + 1, n);
    }

    public int sumarValores(int[] vector, int indice, int n) {
        if (indice == n) {
            return 0;
        }
        return vector[indice] + sumarValores(vector, indice + 1, n);
    }
}
        