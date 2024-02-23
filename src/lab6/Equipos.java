package lab6;

public class Equipos {

    private String pais;
    private String equipo;
    private String ciudad;
    private String estadio;

    public Equipos() {
    }

    public Equipos(String pais, String equipo, String ciudad, String estadio) {
        this.pais = pais;
        this.equipo = equipo;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return equipo;
    }

}
