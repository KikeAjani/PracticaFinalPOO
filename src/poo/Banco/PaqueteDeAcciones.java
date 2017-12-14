package poo.Banco;

public class PaqueteDeAcciones {
    private String nombreEmpresa;
    private int nTitulos;
    private double precioTotal;
    private double precioInicial;

    public PaqueteDeAcciones(String nombreEmpresa,int nTitulos,double precioInicial){
        this.nombreEmpresa =nombreEmpresa;
        this.nTitulos=nTitulos;
        this.precioInicial =precioInicial;
        this.precioTotal =precioInicial;
    }

    @Override
    public String toString(){
        return "\nNombre de la empresa: "+ nombreEmpresa + "\nNumero de aciones: "+nTitulos+"\nPrecio actual: "+ precioTotal +"\nSu precio inicial fue: "+ precioInicial +"\n";
    }

}
