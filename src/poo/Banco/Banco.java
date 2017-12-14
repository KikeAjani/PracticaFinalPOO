package poo.Banco;

import poo.General.Escaner;

import java.util.*;

public class Banco {

    private static Map<String,Cliente> listaClientes = new HashMap<String, Cliente>() ;



    public static void AñadirCliente(Cliente cliente){
        listaClientes.put(cliente.getDNI(),cliente);
    }

    public static void AñadirCliente()  {
        String dni="";
        Escaner escaner= new Escaner();
        System.out.println("Introduzca el nombre del cliente:");
        String nombre=escaner.leeCadena();
        while (dni.length()!=9) {
            System.out.println("Introduzca el DNI:");
            dni = escaner.leeCadena();
            if (dni.length()!=9) {
                System.out.println("DNI no tiene 9 caracteres");
            }
        }if (!listaClientes.containsKey(dni)) {
            System.out.println("Introduzca el saldo inicial:");
            double saldo = escaner.leeReal();
            Cliente cliente = new Cliente(nombre, dni, saldo);
            listaClientes.put(dni, cliente);
            System.out.println("Cliente añadido");
        }else{
            System.out.println("Este cliente ya existe");
        }
    }


    public static void  Borrar(){
        listaClientes.clear();

    }

    public static void ImprimirUn(String dni){
        Cliente texto=(Cliente) listaClientes.get(dni);
        System.out.println(texto);
    }



    public static void ImprimirClientes(){
        Collection<Cliente> ColeccionClientes= listaClientes.values();
        Iterator it=ColeccionClientes.iterator();
        while(it.hasNext()){
            Cliente texto= (Cliente)it.next();
            System.out.println(texto);
        }
    }

    public static void ImprimirClientes2(){
        Iterator it= listaClientes.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            System.out.println(e.getValue());
        }
    }


    public static void EliminarCliente(){
        System.out.println("Introduzca el DNI del cliente a eliminar");
        Escaner escaner = new Escaner();
        String dni = escaner.leeCadena();
        if (listaClientes.containsKey(dni)){
          listaClientes.remove(dni);
        }else{
            System.out.println("Este cliente no existe.");

        }

    }


    public static void HacerPremium(){
        String dniGestor="";
        System.out.println("Introduzca el DNI del cliente que desea hacer premium");
        Escaner escaner = new Escaner();
        String dni = escaner.leeCadena();
        if (listaClientes.containsKey(dni)){
            System.out.println("Introduzca el nombre del gestor que se le va asignar:");
            String gestor = escaner.leeCadena();
            while (dniGestor.length()!=9) {
                System.out.println("Introduzca el DNI del gestor:");
                dniGestor = escaner.leeCadena();
                if (dniGestor.length()!=9) {
                    System.out.println("DNI no tiene 9 caracteres");
                } }
            Cliente cliente= listaClientes.get(dni);
            ClientePremium clientePremium = new ClientePremium(cliente,new GestorDeInversiones(gestor,dniGestor) );
            listaClientes.put(clientePremium.getDNI(),clientePremium);
            System.out.println("El cliente con DNI :" +dni +" ha sido añadido.");

        }else{
            System.out.println("Este cliente no existe.");

        }

    }
   /* public static void EliminarCliente() {
        int indice=0;
        System.out.println("Introduzca el DNI del cliente a eliminar");
        Escaner escaner = new Escaner();
        String dni = escaner.leeDNI();
        Cliente cliente = new Cliente();

        for (Cliente cliente1 : listaClientes) {
            if (cliente1.getDNI().equals(dni)) {
                cliente=cliente1;
            }
        }
        System.out.println("Eliminando a "+cliente.getNombre());
        listaClientes.remove(cliente);
    }

*/

}
