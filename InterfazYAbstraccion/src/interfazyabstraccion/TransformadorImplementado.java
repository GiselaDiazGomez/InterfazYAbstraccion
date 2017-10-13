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
public class TransformadorImplementado implements ITransformador{
    double dato;

    @Override
    public double grado2radian() {
       double resultado=(dato*Math.PI)/180;
       return resultado;
    }

    @Override
    public double kelvin2celsius() {
        return dato-272.15;
    }
    
    
}
