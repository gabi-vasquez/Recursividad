package com.gabi.util;

import java.util.Scanner;

public class Consola {

    private static final Scanner scanner = new Scanner(System.in);

    // Metodo de pedir un numero utlizando recursividad
    public static int pedirNumeroRecursivo() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, ingresa un número entero:");
            scanner.nextLine(); // limpiar el buffer
            return pedirNumeroRecursivo();
        }
    }

}
