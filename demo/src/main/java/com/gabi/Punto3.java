package com.gabi;
import com.gabi.util.Consola;
public class Punto3 {
    //3.Leer un valor entero y calcular la sumatoria 1 + ½ +1/3+ … 1/n.
    //Tipo de bigout o tipo de complejidad de la funcion calcularSumatoriaFracciones
    //O(n)
    public static void main(String[] args) {
        Punto3 punto3 = new Punto3();
        int numero = Consola.pedirNumeroRecursivo();
        double resultado = punto3.calcularSumatoriaFracciones(numero);
        System.out.println("La sumatoria de 1 + ½ + … 1/" + numero + " es " + resultado);
    }
    
    public double calcularSumatoriaFracciones(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return 1.0 / numero + calcularSumatoriaFracciones(numero - 1);
        }
    }
}
