package com.gabi;

import com.gabi.util.Consola;
public class Punto9 {
    //9. Leer 2 números enteros y calcular el cociente de la división entera. (sugerencia: use restas sucesivas)
    public static void main(String[] args) {
        Punto9 punto9 = new Punto9();
        System.out.println("Ingrese el primer numero: ");
        int numero1 = Consola.pedirNumeroRecursivo();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = Consola.pedirNumeroRecursivo();
        int resultado = punto9.calcularCociente(numero1, numero2);
        System.out.println("El cociente de la división entera de " + numero1 + " dividido " + numero2 + " es " + resultado);
    }

    public int calcularCociente(int numero1, int numero2) {
        if (numero1 < numero2) {
            return 0;
        }
        return 1 + calcularCociente(numero1 - numero2, numero2);
    }
}
