/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mayco
 */
public class Persona {
    private String nombre;
    private String id;
    private int edad;
    private String correo;
    private String telefono;
    private LocalDateTime fechaRegistro;

    public Persona(String nombre, String id, int edad, String correo, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaRegistro = LocalDateTime.now();
    }

    // Método que devuelve la línea formateada para guardar en el archivo
    public String formatearRegistro() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return String.format("%s|%s|%d|%s|%s|%s",
                nombre, id, edad, correo, telefono, fechaRegistro.format(formato));
    }
}

