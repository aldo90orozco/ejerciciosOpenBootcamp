
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
        
        //cliente
        System.out.println("***********CLIENTE*************");
        Cliente cliente= new Cliente();
        cliente.setEdad(32);
        cliente.setNombre("Juan");
        cliente.setTelefono(263454535);
        cliente.setCreadito("Tiene credito");
        //imprimir datos cliente
        
        System.out.println("El cliente tiene credito? "+cliente.getCreadito());
        
        //trabajador
        System.out.println("***********TRABAJADOR********");
        Trabajador trabajador=new Trabajador();
        trabajador.setSalario(95000);
        trabajador.setNombre("Pedro");
        trabajador.setEdad(54);
        trabajador.setTelefono(2645875);
        //imprimir datos trabajador
        System.out.println("El salario del trabjador es: "+trabajador.getSalario());
        System.out.println("El nombre del trabajador es: "+trabajador.getNombre());
        System.out.println("La edad del trabajador es: "+trabajador.getEdad());
        System.out.println("El telefono del trabajador es: "+trabajador.getTelefono());
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

class Cliente extends Persona{
    String creadito;

    public String getCreadito() {
        return creadito;
    }

    public void setCreadito(String creadito) {
        this.creadito = creadito;
    }   
}

class Trabajador extends Persona{
    float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
