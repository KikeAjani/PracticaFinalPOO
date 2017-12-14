package poo.Bolsa;

public class Empresa {
    private String nombre;
    private double valorAccionActual;
    private double valorAccionPrevio;
    private double incremento;


    public Empresa(String nombre,double valor){
        this.nombre =nombre;
        this.valorAccionActual =valor;
        this.valorAccionPrevio =valor;
        this.incremento =0;
    }


    public String getNombre() {
        return nombre;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setValorAccionActual(double valorAccionActual) {
        this.valorAccionActual = valorAccionActual;
    }

    public void setValorAccionPrevio(double valorAccionPrevio) {
        this.valorAccionPrevio = valorAccionPrevio;
    }

    public void setIncremento(double incremento){
        this.incremento =incremento;
    }

    public double getValorAccionActual(){
        return this.valorAccionActual;
    }





    public String toString() {
        return "\nnombre de empresa: "+ nombre + "\nValor actual: "+ valorAccionActual + "\nValor previo: "+ valorAccionPrevio
                + "\nValor del último incremento: " + incremento +"%\n";
    }
}



