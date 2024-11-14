/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase9;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class UtilMatrixEstudiantes {
    
       
    public void printMatrix (Estudiante matrix[], int row){
        
        String result=""; 
        for (int i = 0; i < row; i++) {
            result=result + matrix[i].toString() ;
            //result=result + matrix[i] ; Es lo mismo pq internamente utiliza el toString
            result=result+"\n";
        }
        JOptionPane.showMessageDialog(null, result);
    
    }
    
    public void printMatrix (Estudiante matrix[]){
        
        String result=""; 
        for (int i = 0; i < matrix.length; i++) {
            result=result + matrix[i].toString() ;
            //result=result + matrix[i] ; Es lo mismo pq internamente utiliza el toString
            result=result+"\n";
        }
        JOptionPane.showMessageDialog(null, result);
    
    }
    
}
