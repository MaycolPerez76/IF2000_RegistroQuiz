/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;
import java.util.Scanner;

public class ValidarRegistro {
    public static String leerNoVacio(Scanner sc, String prompt) {
        String valor;
        do {
            System.out.print(prompt);
            valor = sc.nextLine().trim();
            if (valor.isEmpty()) {
                System.out.println("El valor no puede estar vacio.");
            }
        } while (valor.isEmpty());
        return valor;
    }

    public static int leerEnteroPositivo(Scanner sc, String prompt) {
        int numero = -1;
        while (numero <= 0) {
            System.out.print(prompt);
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero <= 0) {
                    System.out.println("Ingrese un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número valido.");
            }
        }
        return numero;
    }

    public static String leerEmailValido(Scanner sc, String prompt) {
        String email;
        do {
            System.out.print(prompt);
            email = sc.nextLine().trim();
            if (!email.contains("@") || email.startsWith("@") || email.endsWith("@")) {
                System.out.println("Correo inválido. Debe contener '@' y texto antes y despues");
                email = "";
            }
        } while (email.isEmpty());
        return email;
    }

    public static String leerTelefonoValido(Scanner sc, String prompt) {
        String tel;
        do {
            System.out.print(prompt);
            tel = sc.nextLine().trim();
            if (!tel.matches("\\d{8,}")) {
                System.out.println("El teléfono debe contener solo dígitos y tener al menos 8 caracteres.");
                tel = "";
            }
        } while (tel.isEmpty());
        return tel;
    }
}
