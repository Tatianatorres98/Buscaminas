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
public class Celda {

    private boolean estado;
    private Corazon corazon;
    private Bandera bandera;
    private int minasalrededor;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Bandera getBandera() {
        return bandera;
    }

    public void setBandera(Bandera bandera) {
        this.bandera = bandera;
    }

    public int getMinasalrededor() {
        return minasalrededor;
    }

    public void setMinasalrededor(int minasalrededor) {
        this.minasalrededor = minasalrededor;
    }
    
    
    

}
