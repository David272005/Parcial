package com.dw.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
      
        String nombreSinEspacios = nombre.replaceAll("\\s", "");
        
     
        String nombreArchivo = nombreSinEspacios + ".txt";
        
        
        System.out.println("Ingrese el contenido del archivo:");
        String texto = scanner.nextLine();
        
     
        scanner.close();
        
      
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(texto);
            System.out.println("Se creo el archivo \"" + nombreArchivo + "\" correctamente :)");
        } catch (IOException e) {
            System.err.println("Ocurrio un error :(");
            e.printStackTrace();
        }
    }
}

