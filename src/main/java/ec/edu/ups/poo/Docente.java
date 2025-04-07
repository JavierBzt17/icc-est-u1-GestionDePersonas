package ec.edu.ups.poo;

import java.util.List;

public class Docente extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areaEspecializacion;

    // Constructor
    public Docente(String cedula, String nombre, String apellido, String telefono,
                   String correoElectronico, List<Direccion> direcciones,
                   List<String> titulosAcademicos, List<String> areaEspecializacion) {
        super(cedula, nombre, apellido, telefono, correoElectronico, direcciones);
        this.titulosAcademicos = titulosAcademicos;
        this.areaEspecializacion = areaEspecializacion;
    }

    // Getters y Setters
    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(List<String> areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }
    @Override
    public String toString() {
        return "Docente{" +
                "tituloAcademico='" + titulosAcademicos + '\'' +
                ", areaEspecializacion='" + areaEspecializacion + '\'' +
                "} " + super.toString();
    }
}
