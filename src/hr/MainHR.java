package hr;

import hr.modelo.Cliente;
import hr.modelo.Contacto;
import hr.modelo.Empleado;
import hr.modelo.Transportista;
import hr.servicio.EmpleadoSrv;

public class MainHR {

    public static void main(String[] args) {
        Empleado emp=new Empleado("John","sunset blv","john@email.com","tecnico",20);
        Cliente cli=new Cliente("Susan","Avenida 55","susan@email.com",600);
        Contacto co=new Contacto();
        co.setContacto("bob@correo.com");
        Transportista tr=new Transportista();
        tr.setNombre("Peter");
        tr.setDireccion("Calle #33");
        tr.setContacto("peter@correo.com");
        tr.setPatente("aa-4433");
        tr.setEmpresa("Transportes S.A.");

        EmpleadoSrv esrv=new EmpleadoSrv();
        esrv.envioCorreo(co);

        esrv.mostrar(tr);
        esrv.mostrar(cli);
        esrv.mostrar(emp);
        int calc= esrv.calculo(emp);
        System.out.println("el calculo es "+calc);
    }
}
