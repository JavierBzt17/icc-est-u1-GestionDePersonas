package ec.edu.ups.poo;

public class Direccion {
    private String type;
    private String callePrincipal;
    private String calleSecundaria;
    private String numeracion;
    private String ciudad;
    private String provincia;
    private String pais;

    // Constructor
    public Direccion(String tipo, String callePrincipal, String calleSecundaria,
                     String numeracion, String ciudad, String provincia, String pais) {
        this.type = type;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numeracion = numeracion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Direccion{" +
                "pais='" + pais + '\'' +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", callePrincipal='" + callePrincipal + '\'' +
                ", calleSecundaria='" + calleSecundaria + '\'' +
                ", numeracion='" + numeracion + '\'' +
                ", tipo='" + type + '\'' +
                '}';
    }
}