/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author Estudiantes
 */
public class Sembrador {
    
    void sembrarminas(Celda lasceldas [] [], int cantidad){
        //For each en Java
        for (Celda[] lafila:lasceldas){
            for (Celda lacelda:lafila){
                Corazon cora=new Corazon();
                lacelda.setCorazon(cora);
            }
            
        }
    }
}
