package hardware.modelo;

public class Impresora implements IProducto {
    private String modelo;
    private int precio;
    private boolean color;
    private int tamano;

    public Impresora(String modelo, int precio, boolean color, int tamano) {
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.tamano = tamano;
    }

    public Impresora() {
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }


}
