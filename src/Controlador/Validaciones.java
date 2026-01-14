package Controlador;

import java.util.Scanner;

public class Validaciones {

    public static int validacion(int min, int max, String mensaje) {
        int opcion;
        while (true) {
            try {
                System.out.println(mensaje);
                opcion = new Scanner(System.in).nextInt();
                if (opcion >= min && opcion <= max) {
                    return opcion;
                } else {
                    System.out.println("Opcion invalida. Intente nuevamente!");
                }
            } catch (Exception e) {
                System.out.println("Error: solo se aceptan numeros!");
            }
        }
    }
}
