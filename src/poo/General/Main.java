package poo.General;

import poo.Banco.*;
import poo.Bolsa.BolsaDeValores;
import poo.Bolsa.Empresa;

public class Main {

    public static void main(String[] args) {
        PaqueteDeAcciones p1= new PaqueteDeAcciones("Mercadona",4,3400.5);
        PaqueteDeAcciones p2= new PaqueteDeAcciones("Aldi",5,2000.5);
        Cliente c1=new Cliente("Kike","976767877F",12034.54);
        Cliente c2=new Cliente("Oscar","222222877F",100432.90);
        Cliente c3=new Cliente("Pedro","333337877F",5534.54);
        Cliente c4=new Cliente("Juan","2",34);
        c2.añadirPaquete(p2);
        c1.añadirPaquete(p1);
        c1.añadirPaquete(p2);

        Banco.AñadirCliente(c2);
        Banco.AñadirCliente(c3);
        Banco.AñadirCliente(c4);

        Empresa e1= new Empresa("Adidas",134.23);
        Empresa e2= new Empresa("Nike",4990.23);
        Empresa e3= new Empresa("Reebok",2000);

        BolsaDeValores.AñadirEmpresa(e1);
        BolsaDeValores.AñadirEmpresa(e2);
        BolsaDeValores.AñadirEmpresa(e3);

       Simulador simulador= new Simulador();
       simulador.Simular();
    }
}
