package hr.modelo;

public class Transportista implements IPersona,IEnvioCorreo {

    private String nombre;
    private String direccion;
    private String contacto;
    private String patente;
    private String empresa;


    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getContacto() {
        return contacto;
    }

    @Override
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
