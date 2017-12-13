package poo.Bolsa;

public class Empresa {
    private String Nombre;
    private double ValorAccionActual;
    private double ValorAccionPrevio;
    private double Incremento;


    public Empresa(String nombre,double valor){
        this.Nombre=nombre;
        this.ValorAccionActual=valor;
        this.ValorAccionPrevio=valor;
        this.Incremento=0;
    }


    public String getNombre() {
        return Nombre;
    }

    public double getIncremento() {
        return Incremento;
    }

    public void setValorAccionActual(double valorAccionActual) {
        this.ValorAccionActual = valorAccionActual;
    }

    public void setValorAccionPrevio(double valorAccionPrevio) {
        this.ValorAccionPrevio = valorAccionPrevio;
    }

    public void setIncremento(double incremento){
        this.Incremento=incremento;
    }

    public double getValorAccionActual(){
        return this.ValorAccionActual;
    }





    public String toString() {
        return "\nNombre de empresa: "+ Nombre + "\nValor actual: "+ValorAccionActual+ "\nValor previo: "+ValorAccionPrevio
                + "\nValor del último incremento: " + Incremento +"%\n";
    }
}



