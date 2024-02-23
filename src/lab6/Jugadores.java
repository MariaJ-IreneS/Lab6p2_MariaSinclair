package lab6;

public class Jugadores {

    private String nombre;
    private String posicion;
    private int edad;

    public Jugadores() {
    }

    public Jugadores(String nombre, String posicion, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
