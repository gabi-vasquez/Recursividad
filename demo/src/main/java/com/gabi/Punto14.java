package com.gabi;

import com.gabi.util.Consola;

public class Punto14 {
    //14.La función de Ackerman se define como:
    //Ackerman (m, n) = n + 1 si m = 0
    //Ackerman (m, n) = Ackerman (m - 1, 1) si m > 0 y n = 0
    //Ackerman (m, n) = Ackerman (m - 1, Ackerman (m, n - 1)) si m > 0 y n > 0
    //Ej. Si se tiene Ackermann (1, 2) = 4; Ackermann (3, 2) = 29
    //Realice un programa para encontrar el valor de la función de Ackerman, para dos valores enteros m, n.
    //Tipo de complejidad: 
    //Depende de que numero sea el numeroM, entre mas grande sea, mas compleja y genera un error de stack overflow  
     public static void main(String[] args) {
        Punto14 punto14 = new Punto14();
        System.out.println("Ingrese el valor de m: ");
        int numeroM = Consola.pedirNumeroRecursivo();
        System.out.println("Ingrese el valor de n: ");
        int numeroN = Consola.pedirNumeroRecursivo();
        int resultado = punto14.calcularAckerman(numeroM, numeroN);
        System.out.println("El valor de Ackermann (" + numeroM + ", " + numeroN + ") es: " + resultado);
    }

    public int calcularAckerman(int numeroM, int numeroN) {
        if (numeroM == 0) {
            return numeroN + 1;
        }
        if (numeroM > 0 && numeroN == 0) {
            return calcularAckerman(numeroM - 1, 1);
        }
        return calcularAckerman(numeroM - 1, calcularAckerman(numeroM, numeroN - 1));
    }
}
