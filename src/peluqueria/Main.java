package peluqueria;

import peluqueria.modelo.Gato;
import peluqueria.modelo.Perro;
import peluqueria.servicio.PerroServicio;

public class Main {
    public static void main(String[] args) {

        Perro snoopy=new Perro("Snoopy",20,"Charlie Brown");
        snoopy.setMuerde(false);

        Gato garfield=new Gato("Garfield",5,"John");

     //   Animal ardilla=new Animal("Ardilla",3,"Peter");


        PerroServicio ps=new PerroServicio();

        int total=ps.calculoPrecio(snoopy);
        System.out.println("El precio del corte del pelo de snoopy es "+total);

        int totalgato=ps.calculoPrecio(garfield);
        System.out.println("El precio del corte del pelo de garfield es "+totalgato);


    }
}