package Controlador;

import java.util.Scanner;

public class Validaciones {
    
    public static int validacion(int valorminimo, int valormaximo, String mensaje) {
        boolean validar = true;
        int opcion = 0;
        do {
            try {
                System.out.println(mensaje);
                opcion = new Scanner(System.in).nextInt();
                while (opcion < valorminimo || op > valormaximo) {
                    System.out.println("Opcion no valida, intente nuevamente. ");
                    opcion = new Scanner(System.in).nextInt();
                }
                validar = true;
            } catch (Exception e) {
                System.out.println("Error, solo se admiten numeros. ");
            }
        } while (validar == true);
        return opcion;
    }
}
