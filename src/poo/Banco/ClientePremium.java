package poo.Banco;

import java.util.ArrayList;

public class ClientePremium extends Cliente {
    private GestorDeInversiones Gestor;

    public ClientePremium(String nombre,String dni,double saldo,GestorDeInversiones gestor){
        super(nombre, dni, saldo);
        this.Cartera= new ArrayList<PaqueteDeAcciones>();
        this.Gestor=gestor;
    }

    public ClientePremium(Cliente cliente,GestorDeInversiones gestor){
        super(cliente.getNombre(),cliente.getDNI(),cliente.getSaldo());
        this.Cartera=cliente.getCartera();
        this.Gestor=gestor;
    }

    public GestorDeInversiones getGestor(){
        return Gestor;
    }

    public String toString() {
        return "\nPREMIUM Nombre: " + getNombre() +" DNI: " + getDNI() +" Saldo: "+ getSaldo() + "\n------------Paquete de acciones:-----------" + imprimirPaquetes()
                +"\nSu gestor de inversiones es: " + Gestor  ;


    }
}
