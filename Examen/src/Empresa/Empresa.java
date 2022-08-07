package Empresa;

public class Empresa {
    private String Nombre;
    public Empleado empleados;
    public Cliente clientes;

    public Empresa(){
        empleados = new Empleado();
        clientes = new Cliente();
    }

}
