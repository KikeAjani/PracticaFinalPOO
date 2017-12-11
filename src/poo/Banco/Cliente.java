package poo.Banco;

import java.util.ArrayList;

public class Cliente extends Persona {
    protected double Saldo;
    protected ArrayList<PaqueteDeAcciones> Cartera;

    //region CONSTRUCTORES

    public Cliente(){};

    public Cliente(String nombre,String dni,double saldo){
        this.Nombre=nombre;
        this.DNI=dni;
        this.Saldo=saldo;
        this.Cartera= new ArrayList<PaqueteDeAcciones> ();
    }

    //endregion

    //region Get&Set

    public ArrayList<PaqueteDeAcciones> getCartera() {
        return Cartera;
    }

    public double getSaldo() {
        return Saldo;
    }

    //endregion
}
