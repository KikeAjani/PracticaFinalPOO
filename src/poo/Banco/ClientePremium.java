package poo.Banco;

public class ClientePremium extends Cliente {
    private GestorDeInversiones gestor;

    public ClientePremium(String nombre,String dni,double saldo,GestorDeInversiones gestor){
        super(nombre, dni, saldo);
        this.gestor =gestor;
    }

    public ClientePremium(Cliente cliente,GestorDeInversiones gestor){
        this(cliente.getNombre(),cliente.getDNI(),cliente.getSaldo(),gestor);
    }

    public GestorDeInversiones getGestor(){
        return gestor;
    }

    public String toString() {
        return "\nPREMIUM Nombre: " + getNombre() +" DNI: " + getDNI() +" Saldo: "+ getSaldo() + "\n------------Paquete de acciones:-----------" + imprimirPaquetes()
                +"\nSu gestor de inversiones es: " + gestor;


    }
}
