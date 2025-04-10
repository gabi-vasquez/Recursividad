package com.gabi;
import com.gabi.util.Consola;

public class Punto2 {

    //2.Leer un numero entero e invertirlo. Ejemplo: Entrada: 123 Salida: 321
    //Tipo de bigout o tipo de complejidad de la funcion invertirNumero
    //O(n)
    public static void main(String[] args) {
        Punto2 punto2 = new Punto2();
        int numero = Consola.pedirNumeroRecursivo();
        int resultado = punto2.invertirNumero(numero, 0);
        System.out.println("El inverso del: " + numero + " es "+  resultado);
    }

    public int invertirNumero(int numero, int numeroInvertido){
        if (numero == 0){
            return numeroInvertido;
        } else {
            int ultimoDigito = numero % 10; //ultimo digito del numero
            return invertirNumero(numero / 10, numeroInvertido * 10 + ultimoDigito);
        }
    }

    

}
