package hr.modelo;

// Cliente implementa IPersona

// que significa implementa: indicando el codigo

public class Cliente implements IPersona,IEnvioCorreo {
    private String nombre;
    private String direccion;
    private String contacto;
    private int deuda;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, String contacto, int deuda) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.deuda = deuda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }
}
