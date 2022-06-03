package visual.servicio;

public class ClaseLineaV2 extends ClaseLinea {

    @Override // <--- anotacion
    public void dibujarFila(int tamano,String texto) {
        // 12345678901234567890
        // *hola--------------*
        int espacios;
        espacios=tamano-4-texto.length();
        System.out.print("| ");
        System.out.print(texto);
        for(int i=0;i<espacios;i++) {
            System.out.print(" ");
        }
        System.out.println(" |");
    }

}

