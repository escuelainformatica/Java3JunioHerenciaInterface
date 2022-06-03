package hr.modelo;

public class Contacto implements IEnvioCorreo {
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    private String contacto;

}
