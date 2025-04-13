package com.gabi;

import com.gabi.util.Consola;
public class Punto9 {
    //9. Leer 2 números enteros y calcular el cociente de la división entera. (sugerencia: use restas sucesivas)
    //Tipo de complejidad: O(n)
    public static void main(String[] args) {
        Punto9 punto9 = new Punto9();
        System.out.println("Ingrese el primer numero: ");
        int dividendo = Consola.pedirNumeroRecursivo();
        System.out.println("Ingrese el segundo numero: ");
        int divisor = Consola.pedirNumeroRecursivo();
        int resultado = punto9.calcularCociente(dividendo, divisor);
        System.out.println("El cociente de la división entera de " + dividendo + " y " + divisor + " es " + resultado);
    }

    public int calcularCociente(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("División por cero no está permitida.");
        }
        if (dividendo < divisor) {
            return 0;
        }
        return 1  + calcularCociente(dividendo - divisor, divisor);
    }
}
