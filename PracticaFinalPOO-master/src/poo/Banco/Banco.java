package poo.Banco;

import poo.General.Escaner;

import java.util.*;

public class Banco {

    private static HashMap<String,Cliente> ListaClientes= new HashMap<>();


    public static void AñadirCliente(Cliente cliente){
        ListaClientes.put(cliente.getDNI(),cliente);
    }

    public static void AñadirCliente()  {
        String dni="";
        Escaner escaner= new Escaner();
        System.out.println("Introduzca el nombre del cliente:");
        String nombre=escaner.leeCadena();
        while (dni.length()!=9) {
        System.out.println("Introduzca el DNI:");
        dni = escaner.leeDNI();
        if (dni.length()!=9) {
        System.out.println("DNI no tiene 9 caracteres");
        } }
        System.out.println("Introduzca el saldo inicial:");
        //esto esta bien? meter el codigo dentro del try (entero)
        try{
            double saldo = escaner.leeReal();
            Cliente cliente= new Cliente(nombre,dni,saldo);
            ListaClientes.put(dni,cliente);
            System.out.println("Cliente añadido");
        }catch (InputMismatchException e){
            System.out.println("Error, operación cancelada");
            AñadirCliente();

        }
    }



    public static void ImprimirClientes(){
        Collection<Cliente> ColeccionClientes= ListaClientes.values();
        Iterator it=ColeccionClientes.iterator();
        while(it.hasNext()){
            Cliente texto= (Cliente)it.next();
            System.out.println(texto);
        }
    }

    public static void EliminarCliente(){
        System.out.println("Introduzca el DNI del cliente a eliminar");
        Escaner escaner = new Escaner();
        String dni = escaner.leeDNI();
        ListaClientes.remove(dni);

    }



   /* public static void EliminarCliente() {
        int indice=0;
        System.out.println("Introduzca el DNI del cliente a eliminar");
        Escaner escaner = new Escaner();
        String dni = escaner.leeDNI();
        Cliente cliente = new Cliente();

        for (Cliente cliente1 : ListaClientes) {
            if (cliente1.getDNI().equals(dni)) {
                cliente=cliente1;
            }
        }
        System.out.println("Eliminando a "+cliente.getNombre());
        ListaClientes.remove(cliente);
    }

*/

}
