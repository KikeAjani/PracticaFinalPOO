package poo.General;
import java.util.Scanner;

public class Escaner {
    Scanner entradaDelTeclado;
    public Escaner(){
        this.entradaDelTeclado = new Scanner(System.in);
    }
    public String leeCadena(){
        String cadena = this.entradaDelTeclado.nextLine();
        return cadena;
    }

    public String leeDNI()  {
        String cadena = this.entradaDelTeclado.nextLine();
        return cadena;
    }
    public int leeEntero(){ ;
        int entero = this.entradaDelTeclado.nextInt();
        return entero;
    }
    public double leeReal(){
        double real = this.entradaDelTeclado.nextDouble();
        return real;
    }
}