package com.gabi;

import com.gabi.util.Consola;

public class Main {
    public static void main(String[] args) {
        CalcularSumatoria calcularSumatoria = new CalcularSumatoria();
        CalcularFactorial calcularFactorial = new CalcularFactorial();
        int numero = Consola.pedirNumeroRecursivo();
        int resultadoFactorial = calcularFactorial.calcularFactorial(numero);
        int resultadoSumatoria = calcularSumatoria.calcularSumatoria(numero);
        double resultadoSumatoriaRecursiva = calcularSumatoria.calcularSumatoriaFracciones(numero);
        System.out.println("El factorial de " + numero + " es: " + resultadoFactorial);
        System.out.println("La sumatoria de " + numero + " es: " + resultadoSumatoria);
        System.out.println("La sumatoria recursiva de " + numero + " es: " + resultadoSumatoriaRecursiva);    
    }
}