package Empresa;

import java.util.List;

public class Empleado extends Persona{
    private int sueldo_bruto;
    public void mostrar(){
        System.out.println(sueldo_bruto);
    }

    public int calcular_salario(){
        return sueldo_bruto;
    }
    private List<Empresa> empleados;
}
