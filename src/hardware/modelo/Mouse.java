package hardware.modelo;

public class Mouse implements IProducto {
    private String modelo;
    private int precio;
    private int numBotones;
    private boolean gamer;

    public Mouse() {
    }

    public Mouse(String modelo, int precio, int numBotones, boolean gamer) {
        this.modelo = modelo;
        this.precio = precio;
        this.numBotones = numBotones;
        this.gamer = gamer;
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

    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }

    public boolean isGamer() {
        return gamer;
    }

    public void setGamer(boolean gamer) {
        this.gamer = gamer;
    }
}
