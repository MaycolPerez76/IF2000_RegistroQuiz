/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author mayco
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoRegistro {
    private static final String registro = "personas.txt";

    // Método para guardar la línea en el archivo (modo append)
    public static void guardarLinea(String linea) {
          File archivo = new File(registro);
          
             if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado con exito");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo");
                return;
            }
        }
             
 try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            if (linea.length() != 0) {
                bw.write(linea);
                bw.newLine();
                System.out.println("Registro guardado en " + registro);
            } else {
                System.out.println("No se escribió nada porque la línea esta vacia.");
            }

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
             
             
             
    }