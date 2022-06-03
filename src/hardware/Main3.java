package hardware;

import hardware.modelo.Computador;
import hardware.modelo.IProducto;
import hardware.modelo.Impresora;
import hardware.modelo.Mouse;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        Computador hp=new Computador("hp-20",5000,"desktop");
        Impresora epson2=new Impresora("epson qt",7000,false,32);
        Mouse raze2=new Mouse("razer-233",30,3,true);

        IProducto hp2=new Computador("hp-30",6000,"desktop");



        System.out.println("modelo: "+hp2.getModelo());
        System.out.println("precio: "+hp2.getPrecio());
        System.out.println("tipo: "+( (Computador)hp2).getTipo());

        List<IProducto> productos=new ArrayList<>();
        productos.add(hp);
        productos.add(epson2);
        productos.add(hp2);
        productos.add(raze2);



    }
}
