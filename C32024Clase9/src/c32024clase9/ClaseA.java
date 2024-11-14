/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase9;

/**
 *
 * @author viti
 */
public class ClaseA {
    private int atributoA;
    private int atributoB;

    public int getAtributoA() {
        return atributoA;
    }

    public void setAtributoA(int atributoA) {
        this.atributoA = atributoA;
    }

    public int getAtributoB() {
        return atributoB;
    }

    public void setAtributoB(int atributoB) {
        this.atributoB = atributoB;
    }

    public ClaseA() {
    }

    public ClaseA(int atributoA, int atributoB) {
        this.atributoA = atributoA;
        this.atributoB = atributoB;
    }

    @Override
    public String toString() {
        return "ClaseA{" + "atributoA=" + atributoA + ", atributoB=" + atributoB + '}';
    }
    
    
            
    
}
