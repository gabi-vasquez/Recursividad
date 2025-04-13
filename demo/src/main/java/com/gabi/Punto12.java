package com.gabi;

import com.gabi.util.Consola;

public class Punto12 {
    // 12. Cree una matriz de tamaño mXn y sume los elementos de la matriz.
    // Tipo de complejidad: O(m*n)
    public static void main(String[] args) {
        Punto12 punto12 = new Punto12();
        System.out.println("Ingrese el número de filas: ");
        int m = Consola.pedirNumeroRecursivo();
        System.out.println("Ingrese el número de columnas: ");
        int n = Consola.pedirNumeroRecursivo();
        int[][] matriz = new int[m][n];
        punto12.leerValores(matriz, 0, 0, m, n);
        int suma = punto12.sumarValores(matriz, 0, 0, m, n);
        System.out.println("La suma de los valores de la matriz es: " + suma);
    }

    public void leerValores(int[][] matriz, int fila, int columna, int m, int n) {
        if (fila == m) {
            return;
        }
        if (columna == n) {
            leerValores(matriz, fila + 1, 0, m, n);
            return;
        }
        System.out.println("Ingrese el valor en la fila " + (fila + 1) + " y columna " + (columna + 1) + ": ");
        matriz[fila][columna] = Consola.pedirNumeroRecursivo();
        leerValores(matriz, fila, columna + 1, m, n);
    }

    public int sumarValores(int[][] matriz, int fila, int columna, int m, int n) {
        if (fila == m) {
            return 0;
        }
        if (columna == n) {
            return sumarValores(matriz, fila + 1, 0, m, n);
        }
        return matriz[fila][columna] + sumarValores(matriz, fila, columna + 1, m, n);
    }
}
