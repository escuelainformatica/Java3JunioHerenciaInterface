package visual.servicio;

import visual.modelo.Mensaje;

public class ClaseLinea {

    public void dibujarLinea(int tamano) {
        for(int i=0;i<tamano;i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public void dibujarFila(int tamano,String texto) {
        // 12345678901234567890
        // *hola--------------*
        int espacios;
        espacios=tamano-2-texto.length();
        System.out.print("*");
        System.out.print(texto);
        for(int i=0;i<espacios;i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
    public void dibujarRectangulo(int tamano, Mensaje msg) {
        dibujarLinea(tamano);
        dibujarFila(tamano,msg.getTitulo());
        dibujarFila(tamano,"");
        dibujarFila(tamano,msg.getDescripcion());
        dibujarFila(tamano,"");
        dibujarLinea(tamano);
    }

}
