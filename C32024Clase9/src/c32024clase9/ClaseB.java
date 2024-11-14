/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase9;

/**
 *
 * @author viti
 */
public class ClaseB {
    private ClaseA claseA;
    private Enum1 estado;

    public ClaseA getClaseA() {
        return claseA;
    }

    public void setClaseA(ClaseA claseA) {
        this.claseA = claseA;
    }

    public Enum1 getEstado() {
        return estado;
    }

    public void setEstado(Enum1 estado) {
        this.estado = estado;
    }

    public ClaseB() {
    }

    public ClaseB(ClaseA claseA, Enum1 estado) {
        this.claseA = claseA;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ClaseB{" + "claseA=" + claseA + ", estado=" + estado + '}';
    }
    
    
    
    
}
