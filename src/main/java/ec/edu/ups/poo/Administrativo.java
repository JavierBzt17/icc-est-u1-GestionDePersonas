package ec.edu.ups.poo;

import java.util.List;

public class Administrativo extends Persona {

    private String[] cargo;
    private String[] responsabilidad;

    public Administrativo(String cedula, String nombre, String apellido, String telefono,
                          String correoElectronico, List<Direccion> direcciones,
                          String[] cargo, String[] responsabilidad) {
        super(cedula, nombre, apellido, telefono, correoElectronico, direcciones);
        this.cargo = cargo;
        this.responsabilidad = responsabilidad;
    }

    public String[] getCargo() {
        return cargo;
    }

    public void setCargo(String[] cargo) {
        this.cargo = cargo;
    }

    public String[] getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String[] responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargo=" + String.join(", ", cargo) + // Convertir el array a una cadena legible
                ", responsabilidad=" + String.join(", ", responsabilidad) + // Convertir el array a una cadena legible
                "} " + super.toString();
    }
}