package ec.edu.ups.poo;

import java.util.GregorianCalendar;
import java.util.List;


public class Visitante extends Persona {
    private String motivoVisita;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    // Constructor
    public Visitante(String cedula, String nombre, String apellido, String telefono,
                     String correoElectronico, List<Direccion> direcciones,
                     String motivoVisita, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        super(cedula, nombre, apellido, telefono, correoElectronico, direcciones);
        this.motivoVisita = motivoVisita;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    // Getters y Setters
    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    @Override
    public String toString() {
        return "Visitante{" +
                "motivo='" + motivoVisita + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                "} " + super.toString();
    }
}

