package hr.modelo;

// contrato
// como la escribo?
// 1) no hay campos
// 2) los metodos/funciones, no tienen cuerpo. La funcion solo tiene el encabezado
// 3) no tienen ni publico ni privado
// 4) no hay constructor.

public interface IPersona {

    String getNombre();

    void setNombre(String nombre);

    String getDireccion();

    void setDireccion(String direccion);

    String getContacto();

    void setContacto(String contacto);

}
