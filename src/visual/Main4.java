package visual;

import visual.modelo.Mensaje;
import visual.servicio.ClaseLinea;
import visual.servicio.ClaseLineaV2;
import visual.servicio.ClaseLineaV3;

public class Main4 {
    public static void main(String[] args) {

        Mensaje msj=new Mensaje("Titulo","este es el contenido");

        ClaseLineaV2 cl=new ClaseLineaV2();
        cl.dibujarRectangulo(40,msj);
        ClaseLinea cl1=new ClaseLinea();
        cl1.dibujarRectangulo(40,msj);
        ClaseLineaV3 cl2=new ClaseLineaV3();
        cl2.dibujarRectangulo(40,msj);

    }
}

