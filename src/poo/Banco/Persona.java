package poo.Banco;

public class Persona {
    protected String Nombre;
    protected String DNI;

    //region Constructores
    public Persona(String nombre,String dni){
        this.Nombre=nombre;
        this.DNI=dni;
    }

    public Persona(){};

    //endregion

    //region Get&Set

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }
    //endregion

}
