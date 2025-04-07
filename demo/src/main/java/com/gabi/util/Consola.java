package com.gabi.util;

import java.util.Scanner;

public class Consola {
    public static int pedirNumero(){
        int numero = 0;
        System.out.println("Introduce un número:");
        Scanner sc = new Scanner(System.in);
        try{
            numero = sc.nextInt();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Introduce un número:");
        } finally{
            sc.close();
        }
        return numero;
    }
}