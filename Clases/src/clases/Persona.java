/*Este codigo define la clase Persona y la clase Profesor
como una extension de la primera.

Un profesor es una persona dedicada a la docendia, tanto
en colegios publicos como en el ambito privado.

El codigo ha sido hecho por Carlos Hernández en mayo de 2019*/

package clases;

import java.util.List;

/**
 *
 * @author Pablo
 */
public class Persona  {
    String numeroDeTelefono;
    
    public Persona (String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
}
public class Profesor extends Persona{
    String srt;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    
    public Profesor (String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    public void printInformacionPersonal(){
        System.out.println("Nombre: "+ srt);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+this.numeroDeTelefono);
        
    }
    public void printTodaInformacion(){
        System.out.println("Nombre: "+srt);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+this.numeroDeTelefono);
            for(Prestamo p: prestamos){
                System.out.println(p);
            }
    }
}
