package poo.General;

public class InterfazDeUsuario {


    public InterfazDeUsuario(){}

    public void Menu(){
        System.out.println("--------MENÚ DE OPERACIONES--------");
        System.out.println("0.- Salir");
        System.out.println("----------------- ESTADO ------------------");
        System.out.println("1.- Imprimir estado de los clientes");
        System.out.println("2.- Imprimir estado de la bolsa");
        System.out.println("---------------- BANCO --------------------");
        System.out.println("3.- Añadir cliente");
        System.out.println("4.- Eliminar cliente");
        System.out.println("5.- Realizar copia de seguridad");
        System.out.println("6.- Restaurar copia de seguridad");
        System.out.println("7.- Mejorar cliente a premium");
        System.out.println("8.- Solicita recomendación de inversión");
        System.out.println("----------------- BOLSA --------------------");
        System.out.println("9.- Añadir empresa a la bolsa");
        System.out.println("10.- Eliminar empresa de la bolsa");
        System.out.println("11.- Actualizar valores");
        System.out.println("12.- Realizar copa de seguridad");
        System.out.println("13.- Restaurar copia de seguridad");
        System.out.println("------------- OPERACIONES -------------------");
        System.out.println("14.- Solicitar compra de acciones");
        System.out.println("15.- Solicitar venta de acciones");
        System.out.println("16.- Solicitar actualicación de valores");
        System.out.println("---------------- BROKER ---------------------");
        System.out.println("17.- Imprimir operaciones pendientes");
        System.out.println("18.- Ejecutar operaciones pendientes");

    }

    public void Elegir (){
        Escaner escaner = new Escaner();
        int elec= escaner.leeEntero();

        switch (elec) {
            case 1:
                System.out.println("Ha elegido la opcion 1");
                break;
            case 2:
                System.out.println("Ha elegido la opcion 2");
                break;
        }
    }
}


