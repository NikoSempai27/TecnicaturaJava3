
package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{//Bloque de inicializacion statico
        System.out.println("Ejecucion bloque estattico");
        ++Persona.contadorPersonas;
        //idPersona = 10;  No es un atributo estatico por eso tenemos un error
    }
    
    { //Bloque de inicializacion no estatico (contexto dinamico)
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++; //Inclementamos el atributo
    }
    
    //Los bloques de inicializacion se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
        
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
