package com.gabi;

import com.gabi.util.Consola;

public class Punto6 {
    // Leer un numero llamado base y otro exponente y calcular la potencia elevando
    // la base al exponente.
    // Tipo de bigout o tipo de complejidad de la funcion calcularPotencia
    // O(n)
    public static void main(String[] args) {
        Punto6 punto6 = new Punto6();
        System.out.println("Ingrese la base: ");
        int base = Consola.pedirNumeroRecursivo();
        System.out.println("Ingrese el exponente: ");
        int exponente = Consola.pedirNumeroRecursivo();
        int resultado = punto6.calcularPotencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
    }

    public int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, (exponente - 1));

        }
    }

}
