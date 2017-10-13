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
public class ConversorConcreto extends AConversor {

    @Override
    double grado2radian() {
        double resultado=(dato*Math.PI)/180;
        return resultado;
    }

    @Override
    double fahrenheit2kelvin() {
        return ((dato+459.67)*5)/9;
    }
    
}
