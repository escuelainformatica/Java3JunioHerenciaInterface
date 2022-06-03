package hr.servicio;

import hr.modelo.Empleado;
import hr.modelo.IEnvioCorreo;
import hr.modelo.IPersona;

public class EmpleadoSrv {
    public void mostrar(IPersona emp) {
        System.out.println("Nombre: "+emp.getNombre());
        System.out.println("Direccion: "+emp.getDireccion());
        System.out.println("Contacto: "+emp.getContacto());
    }

    public void envioCorreo(IEnvioCorreo obj) {
        System.out.println("Enviando correo a ..."+obj.getContacto());
    }

    public int calculo(Empleado emp) {
        // tecnico: 20 x años.   (20 x20 = 400)
        // ingeniero: 25 x años.
        // auxiliar: 5 x año.
        int resultado=0;

        // == igualdad (no la puedo ocupar cuando comparo texto)
        // != no igualdad
        // <, >, <=, >=

        if(emp.getCargo()=="tecnico") {
            resultado=emp.getAntiguedad()*20;
        }
        if(emp.getCargo()=="ingeniero") {
            resultado=emp.getAntiguedad()*25;
        }
        if(emp.getCargo()=="auxiliar") {
            resultado=emp.getAntiguedad()*5;
        }



        return resultado;
    }
}
