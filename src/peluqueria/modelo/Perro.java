package peluqueria.modelo;

// Perro hereda de animal

public class Perro extends Animal {

    private boolean muerde;

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    public Perro(String nombre, int peso, String propietario) {
        super(nombre, peso, propietario); // llama al constructor de animal.
    }



}
