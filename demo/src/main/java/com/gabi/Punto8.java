package com.gabi;

public class Punto8 {
    // 8. Realizar un programa que permita copiar una cadena en otra.
    // Tipo de complejidad: O(n)

    public String copiarCadena(String palabraActual) {
        return copiarRecursivo(palabraActual, "", 0);
    }

    private String copiarRecursivo(String palabraActual, String copiaPalabra, int indice) {
        // Caso base: si llegamos al final de la cadena, devolvemos la copia
        if (indice >= palabraActual.length()) {
            return copiaPalabra;
        }

        // Caso recursivo: añadimos el carácter actual a la cadena destino
        // y llamamos recursivamente para el siguiente carácter
        char caracterActual = palabraActual.charAt(indice);
        return copiarRecursivo(palabraActual, copiaPalabra + caracterActual, indice + 1);
    }

    public static void main(String[] args) {
        Punto8 punto8 = new Punto8();

        String original = "Estructura de Datos";
        String copia = punto8.copiarCadena(original);

        System.out.println("Cadena original: " + original);
        System.out.println("Cadena copiada: " + copia);
        System.out.println("¿Son la misma referencia? " + (original == copia));
        System.out.println("¿Tienen el mismo contenido? " + original.equals(copia));
    }
}