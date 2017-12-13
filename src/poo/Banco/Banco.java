package poo.Banco;

import poo.General.Escaner;

import java.util.*;

public class Banco {

    private static HashMap<String,Cliente> ListaClientes= new HashMap<String, Cliente>();



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

    public static void  Borrar(){
        ListaClientes.clear();

    }

    public static void ImprimirUn(String dni){
        Cliente texto=(Cliente)ListaClientes.get(dni);
        System.out.println(texto);
    }



    public static void ImprimirClientes(){
        Collection<Cliente> ColeccionClientes= ListaClientes.values();
        Iterator it=ColeccionClientes.iterator();
        while(it.hasNext()){
            Cliente texto= (Cliente)it.next();
            System.out.println(texto);
        }
    }

    public static void ImprimirClientes2(){
        Iterator it=ListaClientes.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            System.out.println(e.getValue());
        }
    }


    public static void EliminarCliente(){
        System.out.println("Introduzca el DNI del cliente a eliminar");
        Escaner escaner = new Escaner();
        String dni = escaner.leeDNI();
        if (ListaClientes.containsKey(dni)){
          ListaClientes.remove(dni);
        }else{
            System.out.println("Este cliente no existe.");

        }

    }


    public static void HacerPremium(){
        String dniGestor="";
        System.out.println("Introduzca el DNI del cliente que desea hacer premium");
        Escaner escaner = new Escaner();
        String dni = escaner.leeDNI();
        if (ListaClientes.containsKey(dni)){
            System.out.println("Introduzca el nombre del gestor que se le va asignar:");
            String gestor = escaner.leeCadena();
            while (dniGestor.length()!=9) {
                System.out.println("Introduzca el DNI del gestor:");
                dniGestor = escaner.leeDNI();
                if (dniGestor.length()!=9) {
                    System.out.println("DNI no tiene 9 caracteres");
                } }
            Cliente cliente=ListaClientes.get(dni);

            ClientePremium clientePremium = new ClientePremium(cliente,new GestorDeInversiones(gestor,dniGestor) );

            ListaClientes.remove(dni);
            ListaClientes.put(clientePremium.getDNI(),clientePremium);
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
