package poo.Banco;

public class PaqueteDeAcciones {
    private String NombreEmpresa;
    private int nTitulos;
    private double PrecioTotal;
    private double PrecioInicial;

    public PaqueteDeAcciones(String nombreEmpresa,int nTitulos,double precioInicial){
        this.NombreEmpresa=nombreEmpresa;
        this.nTitulos=nTitulos;
        this.PrecioInicial=precioInicial;
        this.PrecioTotal=precioInicial;
    }

    @Override
    public String toString(){
        return "\nNombre de la empresa: "+ NombreEmpresa+ "\nNumero de aciones: "+nTitulos+"\nPrecio actual: "+PrecioTotal+"\nSu precio inicial fue: "+PrecioInicial +"\n";
    }

}
