package hardware.modelo;

public class Computador implements IProducto {
    private String modelo;
    private int precio;
    private String tipo;

    public Computador() {
    }

    public Computador(String modelo, int precio, String tipo) {
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
