package ec.edu.ups.poo;

import java.util.List;

public class Institucion extends Direccion {
    private String id;
    private List<Direccion> ubicacion;

    public Institucion(String id, List<Direccion> ubicacion,
                       String tipo, String callePrincipal, String calleSecundaria,
                       String numeracion, String ciudad, String provincia, String pais) {
        super(tipo, callePrincipal, calleSecundaria, numeracion, ciudad, provincia, pais);
        this.id = id;
        this.ubicacion = ubicacion;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Direccion> getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(List<Direccion> ubicacion) {
        this.ubicacion = ubicacion;
    }
    @Override
    public String toString() {
        return "Institucion{" +
                "id='" + id + '\'' +
                ", nombre='" + id + '\'' +
                ", sede='" + ubicacion + '\'' +
                '}';
    }
}