package poo.General;


import poo.Banco.*;
import poo.Bolsa.BolsaDeValores;

public class Simulador {
    /*private Banco banco;
      private Bolsa BolsaDeValores;
      private Interfaz InterfazDeUsuario;
      private Broker AgenteDeInversiones;

    */


    public Simulador() {
    }

    ;

    public void Simular() {
        int elec = -1;
        while (elec != 0) {
            InterfazDeUsuario.Menu();
            System.out.println("");
            elec = InterfazDeUsuario.Elegir();
                if ((elec < 0) || (elec > 18)) {
                    System.out.println("Numero introducido no corresponde a ninguna operación.");
                }else if ((elec > 0) && (elec <= 18)) {
                    switch (elec) {
                        case 1:
                            Banco.ImprimirClientes2();
                            break;
                        case 3:
                            Banco.AñadirCliente();
                            break;
                        case 4:
                            Banco.EliminarCliente();
                            break;
                        case 7:
                            Banco.HacerPremium();
                            break;
                        case 9:
                            BolsaDeValores.AñadirEmpresa();
                            break;
                        case 10:
                            BolsaDeValores.EliminarEmpresa();
                            break;
                        case 11:
                            BolsaDeValores.ActualizarBolsa();
                            break;
                        case 12:
                            BolsaDeValores.ImprimirEmpresas();
                            break;

                    }
                if (elec!=0){
                    System.out.println("Pulse cualquier boton para volver al menú");
                    Escaner escaner = new Escaner();
                    escaner.leeCadena();
                }
            }
        }
        System.out.println("Programa finalizado");
    }


}




