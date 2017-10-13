/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazyabstraccion;

/**
 *
 * @author Estudiantes
 */
public class InterfazYAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorConcreto miConversorConcreto= new ConversorConcreto();
        TransformadorImplementado miTransformadorImplementado = new TransformadorImplementado();
        
        miConversorConcreto.dato=10;
        
        System.out.println("Grados a radianes con abstracción= "+miConversorConcreto.grado2radian());
        System.out.println("Fahrenheit a Kelvin= "+miConversorConcreto.fahrenheit2kelvin());
        System.out.println("Grados a radianes con implementación= "+miTransformadorImplementado.grado2radian());
        System.out.println("Kelvin a Celsius= "+miTransformadorImplementado.kelvin2celsius());
    }
    
}
