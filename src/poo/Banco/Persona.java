package poo.Banco;

public abstract class Persona {
    private String Nombre;
    private String DNI;

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
