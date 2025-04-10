package com.gabi;
import com.gabi.util.Consola;

public class Punto1 {
    //1. Leer un numero entero y n calcular la factorial de dicho número.
    //Tipo de bigout o tipo de complejidad de la funcion calcularFactorial
    //O(n)

    public static void main(String[] args) {
        Punto1 punto1 = new Punto1();
        int numero = Consola.pedirNumeroRecursivo();
        int resultado = punto1.calcularFactorial(numero);
        System.out.println("El factorial de 5 es: " + resultado);
    }

    public int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }

    

}
