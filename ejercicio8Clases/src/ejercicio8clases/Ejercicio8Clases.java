
package ejercicio8clases;


public class Ejercicio8Clases {


    public static void main(String[] args) {
       Persona persona=new Persona();
       
       persona.setEdad(32);
       persona.setNombre("Aldo");
       persona.setTelefono(263479007);
       
       //imprimirDatos
        System.out.println("La edad de la persona es: "+persona.getEdad());
        System.out.println("El nombre de la persona es: "+persona.getNombre());
        System.out.println("El telefono de la persona es: "+persona.getTelefono());
    }
    
}

class Persona{

    private int edad;
    private String nombre;
    private long telefono;
//getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }
    
    //setters

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
} 
