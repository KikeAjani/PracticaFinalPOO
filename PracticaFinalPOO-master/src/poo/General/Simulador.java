package poo.General;

import com.sun.jdi.InvalidTypeException;
import poo.Banco.AgenteDeInversiones;
import poo.Banco.Banco;
import poo.Banco.Cliente;
import poo.Banco.PaqueteDeAcciones;
import poo.Bolsa.BolsaDeValores;

public class Simulador {
    /*private Banco banco;
      private Bolsa BolsaDeValores;
      private Interfaz InterfazDeUsuario;
      private Broker AgenteDeInversiones;

    */


    public Simulador(){
    };

    public void Simular(){


        PaqueteDeAcciones p1= new PaqueteDeAcciones("Mercadona",4,3400.5);
        PaqueteDeAcciones p2= new PaqueteDeAcciones("Aldi",5,2000.5);
        Cliente c1=new Cliente("Kike","976767877F",12034.54);
        Cliente c2=new Cliente("Oscar","222222877F",100432.90);
        Cliente c3=new Cliente("Pedro","333337877F",5534.54);
        Cliente c4=new Cliente("Juan","11111111F",34);
        c2.añadirPaquete(p2);
        c1.añadirPaquete(p1);
        c1.añadirPaquete(p2);
        Banco.AñadirCliente(c1);
        Banco.AñadirCliente(c2);
        Banco.AñadirCliente(c3);
        Banco.AñadirCliente(c4);

        int elec=-1;
        while ((elec<0)||(elec>18)) {
            InterfazDeUsuario.Menu();
            System.out.println("");
            elec = InterfazDeUsuario.Elegir();
            if ((elec<0)||(elec>18)){
                System.out.println("Numero introducido no corresponde a ninguna operación. Vuélvalo a intentar.");
            }
        }
        switch (elec) {
            case 1:
                Banco.ImprimirClientes();
                break;
            case 2:
                System.out.println("Opcion2");
                break;
            case 3:
                Banco.AñadirCliente();
                break;
            case 4:
                Banco.EliminarCliente();
                break;


        }

        Simular();
    }
}






