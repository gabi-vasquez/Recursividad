package com.gabi;
import com.gabi.util.Consola;

public class Punto4 {
    //4. Leer un número y sumar los dígitos de un número. Ejemplo: Entrada: 123 Resultado:6
    //Tipo de bigout o tipo de complejidad de la funcion calcularSumatoria
    //O(n)
    public static void main(String[] args) {
        Punto4 punto4 = new Punto4();
        int numero = Consola.pedirNumeroRecursivo();
        int resultado = punto4.sumarDigitosNumero(numero);
        System.out.println("La sumatoria de los digitos de " + numero + " es " + resultado);
    }


    public int  sumarDigitosNumero(int numero){
        if(numero == 0){
            return 0;
        }else{
            return numero % 10 + sumarDigitosNumero(numero / 10);
        }
    }
}