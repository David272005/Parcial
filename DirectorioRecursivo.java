package com.dw.java.io;
import java.io.File;

public class DirectorioRecursivo {

    public static void buscarDirectorios(File carpeta) {
        File[] contenido = carpeta.listFiles();

        if (contenido != null) {
            for (File elemento : contenido) {
                if (elemento.isDirectory()) {
                    System.out.println("Directorio encontrado: " + elemento.getAbsolutePath());
                    buscarDirectorios(elemento);
                }
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese una ruta: ");
        String rutaIngresada = scanner.nextLine();
        scanner.close();

        File carpeta = new File(rutaIngresada);

        if (!carpeta.isDirectory()) {
            System.out.println("La ruta ingresada no es un directorio válido.");
            return;
        }

        System.out.println("Directorios encontrados:");
        buscarDirectorios(carpeta);
    }
}