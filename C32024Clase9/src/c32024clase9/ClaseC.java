/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase9;

import java.util.Date;

/**
 *
 * @author viti
 */
public class ClaseC {
    private ClaseB claseb;
    private Date fecha; //Puede calendar 

    public ClaseB getClaseb() {
        return claseb;
    }

    public void setClaseb(ClaseB claseb) {
        this.claseb = claseb;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ClaseC(ClaseB claseb, Date fecha) {
        this.claseb = claseb;
        this.fecha = fecha;
    }

    public ClaseC() {
    }

    @Override
    public String toString() {
        return "ClaseC{" + "claseb=" + claseb + ", fecha=" + fecha + '}';
    }
    
    
}
