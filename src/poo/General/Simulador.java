package poo.General;

public class Simulador {
    public Simulador(){};

    public void Simular(){
        InterfazDeUsuario interfaz = new InterfazDeUsuario();
        interfaz.Menu();
        System.out.println("");
        interfaz.Elegir();
    }
}






