/*Este codigo define la clase Persona y la clase Profesor
como una extension de la primera.

Un profesor es una persona dedicada a la docendia, tanto
en colegios publicos como en el ambito privado.

El codigo ha sido hecho por Carlos Hernández en mayo de 2019*/

package clases;

import java.util.List;

/**
 * Codigo para una clase de un istituto.
 *@version 1.0
 * @author Pablo Blanco
 */
public class Persona  {
    String numeroDeTelefono;
    /**
     * Este es un cambio que se ha hecho 1
     * @param numeroDeTelefono 
     */
    public Persona (String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }
    /**
     * 
     * @return numeroDeTelefono
     */
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    /**
     * Este no se cambia
     * @param numeroDeTelefono 
     */
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono = numeroDeTelefono;
    }
    /**
     * este sigue igual
     */
}
public class Alumno extends Persona{
     String srt;
    int edad;
    String numeroDeTelefono;
}
/**
 * Este es una clase alumno nueva
 * @author Pablo
 * @param numeroDeTelefono
 */
public class Profesor extends Persona{
    String srt;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    
    /**
     * 
     * @param numeroDeTelefono 
     */
    public Profesor (String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    /**
     * Este es tanto para profesor como para alumno
     */
    public void printInformacionPersonal(){
        System.out.println("Nombre: "+ srt);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+this.numeroDeTelefono);
        
    }
    /**
     * @return numeroDeTelefono
     * @since 2019
     */
    public void printTodaInformacion(){
        System.out.println("Nombre: "+srt);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+this.numeroDeTelefono);
            for(Prestamo p: prestamos){
                System.out.println(p);
            }
    }
    /**
     * Este es el final del programa hecho en clase.
     * 
     */
}
