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
    
    void sembrarminas(Celda misceldas [] [], int cantidad){
        //For each en Java
        for (Celda[] fila:misceldas){
            for (Celda celda:fila){
                
                celda.getMina();
            }
            
        }
    }
}
