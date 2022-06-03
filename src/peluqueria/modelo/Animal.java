package peluqueria.modelo;

// JAVA PARTIO A MITAD DE LOS 90'S (

// abstract es una clase que no puedo usar directamente.

public abstract class Animal {

    private String nombre;
    private int peso;
    private String propietario;

    public Animal() {
    }

    public Animal(String nombre, int peso, String propietario) {
        this.nombre = nombre;
        this.peso = peso;
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
