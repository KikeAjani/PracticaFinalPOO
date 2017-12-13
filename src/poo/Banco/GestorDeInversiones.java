package poo.Banco;

public class GestorDeInversiones extends Persona{

   public GestorDeInversiones(String nombre,String dni){
       super(nombre, dni);
   }

   public String toString(){
       return "\n Nombre: " + getNombre() +" DNI: " + getDNI();
   }
    //tiene que acceder a la bolsa generando un mensaje de actualizacion. Le manda a la bolsa ese mensaje, y con el mensaje de respuesta
    //generar una recomendacion
}
