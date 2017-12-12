package poo.Banco;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Cliente extends Persona implements Cloneable {
    protected double Saldo;
    protected ArrayList<PaqueteDeAcciones> Cartera;

    //region CONSTRUCTORES

    public Cliente(){};


    public Cliente(String nombre,String dni,double saldo){
        super(nombre, dni);
        this.Saldo = saldo;
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

    @Override
    public String getDNI() {
        return super.getDNI();
    }

    public String  imprimirPaquetes(){
        String paquetes="";
        for(PaqueteDeAcciones e: Cartera){
            paquetes+= e.toString();
        }
        return paquetes;


    }


    public void añadirPaquete(PaqueteDeAcciones paqueteDeAcciones){
        this.Cartera.add(paqueteDeAcciones);

    }
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() +" DNI: " + getDNI() +" Saldo: "+ getSaldo() + "\n------------Paquete de acciones:-----------" + imprimirPaquetes();


    }

    /*public boolean equals (String dni) {
        if (this.getDNI().equals(dni)) {
            return true;
        }else {return false;}
    }*/

    /*public boolean equals (Object dni) {
            String temp=(String)dni;
            return(this.getDNI().equals(temp)) ;
   }*/



    //endregion
}
