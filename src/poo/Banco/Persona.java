package poo.Banco;

public abstract class Persona {
    private String nombre;
    private String dni;

    //region Constructores
    public Persona(String nombre,String dni){
        this.nombre =nombre;
        this.dni=dni;
    }

    public Persona(){};

    //endregion

    //region Get&Set

    public String getDNI() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    //endregion

}
