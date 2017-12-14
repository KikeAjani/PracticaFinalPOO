package poo.Bolsa;

import poo.General.Escaner;
import poo.General.Utilidades;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;

public class BolsaDeValores {
    private final static String NOMBRE = "LaBolsa";
    private static Map<String, Empresa> listaEmpresas = new HashMap<>();


    //Métodos públicos

    public static void ImprimirEmpresas(){
        Iterator it= listaEmpresas.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            System.out.println(e.getValue());
        }
    }

    public static void EliminarEmpresa() {
        System.out.println("Introduzca el nombre de la empresa a eliminar:");
        Escaner escaner = new Escaner();
        String nombre = escaner.leeCadena();
        if (listaEmpresas.containsKey(nombre)) {
            listaEmpresas.remove(nombre);
        } else {
            System.out.println("Esta empresa no existe.");

        }
    }

    public static void ActualizarBolsa(){
        double Temp;
        double RandomTemp;
        Empresa EmpresaTemporal;
        Iterator it= listaEmpresas.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            EmpresaTemporal= (Empresa) e.getValue();
            Temp=EmpresaTemporal.getValorAccionActual();
            RandomTemp= Utilidades.getRandomInt();
            EmpresaTemporal.setValorAccionActual(RandomTemp);
            EmpresaTemporal.setIncremento((double)((int)((((RandomTemp-Temp) / Temp)*100)*100)/100.0));
            }
    }


    public static void AñadirEmpresa(Empresa empresa){
        listaEmpresas.put(empresa.getNombre(),empresa);
    }



    public static void AñadirEmpresa(){
            Escaner escaner= new Escaner();
            System.out.println("Introduzca el nombre de la empresa:");
            String nombre=escaner.leeCadena();
            if (listaEmpresas.containsKey(nombre)){
                System.out.println("Esta empresa ya está registrada en la bolsa");
            }else {
                System.out.println("Introduzca el valor de la empresa:");
                try {
                    double valor = escaner.leeReal();
                    Empresa empresa = new Empresa(nombre, valor);
                    listaEmpresas.put(nombre, empresa);
                    System.out.println("Empresa añadida");
                }catch (InputMismatchException e){
                    System.out.println("Error, operación cancelada. Vuelvalo a intentar");
                    AñadirEmpresa();
                }
            }

        }


}
