package hr.modelo;


public class Empleado implements IPersona,IEnvioCorreo {
    private String nombre;
    private String direccion;
    private String contacto;
    private String cargo;
    private int antiguedad;

    public Empleado() {
    }

    public Empleado(String nombre, String direccion, String contacto, String cargo, int antiguedad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.cargo = cargo;
        this.antiguedad = antiguedad;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
