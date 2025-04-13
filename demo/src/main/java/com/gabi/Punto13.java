package com.gabi;

import com.gabi.util.Consola;

public class Punto13 {
    // 13. La serie de Fibonacci puede definirse en términos recursivos así:
    // (1) Fib(1) = 1 ; Fib(0) = 0
    // (2) Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2.
    // Lea un valor entero que representa el límite de la serie e imprima hasta el valor limite.

    public static void main(String[] args) {
        Punto13 punto13 = new Punto13();
        System.out.println("Ingrese el límite de la serie: ");
        int limite = Consola.pedirNumeroRecursivo();
        punto13.imprimirFibonacci(limite, 0, 1);
    }   

    public void imprimirFibonacci(int limite, int anterior, int actual){
        if(actual >= limite){
            return;
        }
        System.out.println(actual);
        imprimirFibonacci(limite , actual , anterior + actual);
    } 
}
