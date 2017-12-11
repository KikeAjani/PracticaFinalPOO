package poo.Banco;

import java.util.ArrayList;

public class ClientePremium extends Cliente {
    private GestorDeInversiones Gestor;

    public ClientePremium(String nombre,String dni,double saldo,GestorDeInversiones gestor){
        this.Nombre=nombre;
        this.DNI=dni;
        this.Saldo=saldo;
        this.Cartera= new ArrayList<PaqueteDeAcciones>();
        this.Gestor=gestor;
    }
}
