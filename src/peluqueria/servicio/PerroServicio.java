package peluqueria.servicio;

import peluqueria.modelo.Animal;

public class PerroServicio {

    public int calculoPrecio(Animal animal) {
        int resultado=0;
        resultado= animal.getPeso()*100;

        return resultado;
    }
}
