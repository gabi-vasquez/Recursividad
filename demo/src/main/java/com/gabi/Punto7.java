package com.gabi;

import com.gabi.util.Consola;

public class Punto7 {
    // 7. 7.Leer dos números enteros y calcular el máximo común divisor (M.C.D.), de
    // dos números enteros (M, N)
    // utilizando el algoritmo de Euclides.
    // Si M>= N una función recursiva para MCD es
    // MCD = M si N =0
    // MCD = MCD (N, M % N) si N &lt;&gt; 0
    // Ejemplo: M = 12, N = 8
    // Salida: MCD = 4
    // Tipo de complejidad: O(log(min(M,N)))
    public static void main(String[] args) {
        Punto7 punto7 = new Punto7();
        System.out.println("Ingrese el primer numero: ");
        int numeroM = Consola.pedirNumeroRecursivo();
        System.out.println("Ingrese el segundo numero: ");
        int numeroN = Consola.pedirNumeroRecursivo();
        int mcd = punto7.calcularMCD(numeroM, numeroN);
        System.out.println("El MCD de " + numeroM + " y " + numeroN + " es: " + mcd);
    }

    public int calcularMCD(int m, int n) {
        // Verificar la condición M >= N requerida por el algoritmo de Euclides
        if (m < n) {
            // Si M < N, intercambiar los valores para cumplir la condición
            return calcularMCDEuclides(n, m);
        } else {
            return calcularMCDEuclides(m, n);
        }
    }

    // Implementación del algoritmo de Euclides donde se garantiza que M >= N
    private int calcularMCDEuclides(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return calcularMCDEuclides(n, m % n);
        }
    }
}