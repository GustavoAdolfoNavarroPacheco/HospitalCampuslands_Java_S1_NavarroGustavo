package Controlador;

import Modelo.Paciente;

public class ControlPaciente {
    private Paciente[] pacientes;
    private int contador;

    public ControlPaciente(int tamaño) {
        pacientes = new Paciente[tamaño];
        contador = 0;
    }

    public String registrarPaciente(Paciente p) {
        if (contador < pacientes.length) {
            pacientes[contador] = p;
            contador++;
            return "Paciente registrado correctamente";
        } else {
            return "No se pueden registrar mas pacientes";
        }
    }

    public void verPacientes() {
        if (contador == 0) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + pacientes[i].getNombre() + 
                                   " - CC: " + pacientes[i].getDocumento());
            }
        }
    }

    public Paciente consultarPaciente(String documento) {
        for (int i = 0; i < contador; i++) {
            if (pacientes[i].getDocumento().equals(documento)) {
                return pacientes[i];
            }
        }
        return null;
    }
    
    public Paciente atenderPaciente(String documento) {
    for (int i = 0; i < contador; i++) {
        if (pacientes[i].getDocumento().equals(documento)) {
            pacientes[i].setEstado("Atendido");
            System.out.println("El paciente " + pacientes[i].getNombre() + " fue atendido.");
            return pacientes[i];
        }
    }
    System.out.println("Paciente no encontrado.");
    return null;
}

}
