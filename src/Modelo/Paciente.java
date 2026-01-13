package Modelo;

public class Paciente {
    private String nombre;
    private String documento;
    private int edad;
    private String motivo_consulta;
    private String telefonos;
    private String tipo_paciente;
    private String estado;

    public Paciente(String nombre, String documento, int edad, String motivo_consulta, String telefonos, String tipo_paciente) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.motivo_consulta = motivo_consulta;
        this.telefonos = telefonos;
        this.tipo_paciente = tipo_paciente;
    }

    
    
}
