package poo.Banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona implements Cloneable {
    private double saldo;
    private List<PaqueteDeAcciones> cartera;

    //region CONSTRUCTORES

    public Cliente(){};


    public Cliente(String nombre,String dni,double saldo){
        super(nombre, dni);
        this.saldo = saldo;
        this.cartera= new ArrayList<PaqueteDeAcciones> ();
    }

    //endregion

    //region Get&Set

    public List<PaqueteDeAcciones> getCartera() {
        return cartera;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String getDNI() {
        return super.getDNI();
    }

    public String  imprimirPaquetes(){
        String paquetes="";
        for(PaqueteDeAcciones e: cartera){
            paquetes+= e.toString();
        }
        return paquetes;


    }


    public void añadirPaquete(PaqueteDeAcciones paqueteDeAcciones){
        this.cartera.add(paqueteDeAcciones);

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
