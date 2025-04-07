package com.gabi.util;

import java.util.Scanner;

public class Consola {

    private static final Scanner scanner = new Scanner(System.in);

    // Metodo de pedir un numero utlizando recursividad
    public static int pedirNumeroRecursivo() {
        int numero = 0;
        System.out.println("Introduce un número:");
        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return pedirNumeroRecursivo();
        } finally {
            scanner.close();
        }
        return numero;
    }
}
