package Empresa;

import java.util.List;

public class Cliente extends Persona{
    private String Nombre_empresa;
    private int telefono_de_contacto;


    public void mostrar(){
        System.out.println("Nombre de la empresa: " + Nombre_empresa + " con numero de telefono: " + telefono_de_contacto);
    }
}
