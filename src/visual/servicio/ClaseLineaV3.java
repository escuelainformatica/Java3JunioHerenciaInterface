package visual.servicio;

import visual.modelo.Mensaje;

public class ClaseLineaV3 extends ClaseLineaV2 {

    public void dibujarEncabezado(int tamano) {
        for(int i=0;i<tamano-3;i++) {
            System.out.print("*");
        }
        System.out.println("[x]");
    }

    @Override
    public void dibujarRectangulo(int tamano, Mensaje msg) {
        dibujarEncabezado(tamano);
        dibujarFila(tamano,msg.getTitulo());
        dibujarFila(tamano,"");
        dibujarFila(tamano,msg.getDescripcion());
        dibujarFila(tamano,"");
        dibujarLinea(tamano);
    }
}
