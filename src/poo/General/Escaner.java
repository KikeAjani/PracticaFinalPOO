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

    public int leeInt(){
        boolean bucle = false;
        int numero=-1;
        Escaner escaner = new Escaner();
        while(!bucle){
            try {
                numero=Integer.parseInt(escaner.leeCadena());
                bucle=true;
            }catch (NumberFormatException e){
                System.out.println("El dato debe ser un numero entero, prueba de nuevo.");
            }
        }
        return numero;

    }

    public double leeReal() {
        boolean bucle = false;
        double numero = -1;
        Escaner escaner = new Escaner();
        while (!bucle) {
            try {
                numero = Double.parseDouble(escaner.leeCadena());
                bucle = true;
            } catch (NumberFormatException e) {
                System.out.println("El dato debe ser un numero real, separado por un '.'");
            }
        }
        return numero;
    }

    public static void close(){
        Escaner.close();
    }

}
