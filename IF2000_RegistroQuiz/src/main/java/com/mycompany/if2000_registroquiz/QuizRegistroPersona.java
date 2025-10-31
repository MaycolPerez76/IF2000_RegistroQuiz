/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.if2000_registroquiz;

import Domain.ArchivoRegistro;
import Domain.Persona;
import Domain.ValidarRegistro;
import java.util.Scanner;

/**
 *
 * @author mayco
 */

public class QuizRegistroPersona {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("=== Registro de Persona ===");
        // Usamos los métodos estáticos de MetodosRegistro
        String nombre = ValidarRegistro.leerNoVacio(sc, "Ingrese el nombre completo: ");
        String id = ValidarRegistro.leerNoVacio(sc, "Ingrese la cedula: ");
        int edad = ValidarRegistro.leerEnteroPositivo(sc, "Ingrese la edad: ");
        String correo = ValidarRegistro.leerEmailValido(sc, "Ingrese su correo: ");
        String telefono = ValidarRegistro.leerTelefonoValido(sc, "Ingrese su telefono: ");

        // Crear objeto Persona
        Persona usuario = new Persona(nombre, id, edad, correo, telefono);

        // Guardar en archivo usando la clase RegistroArchivo
        ArchivoRegistro.guardarLinea(usuario.formatearRegistro());

        sc.close();
    }
}

