package poo.General;

import java.util.Random;

public class Utilidades {


    public static double getRandomInt() {
        int limite=5000;
        Random generadorDeNumerosAleatorios = new Random();
        int numeroEnteroAleatorio = generadorDeNumerosAleatorios.nextInt(limite);
        double numeroAleatorio = generadorDeNumerosAleatorios.nextDouble();
        numeroAleatorio=numeroEnteroAleatorio*numeroAleatorio;
        numeroAleatorio=(double)((int)(numeroAleatorio*100)/100.0);
        return numeroAleatorio;
    }
}
