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
    private Mina mina;
    private Bandera bandera;
    private int minasalrededor;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mina getMina() {
        return mina;
    }

    public void setMina(Mina mina) {
        this.mina = mina;
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
