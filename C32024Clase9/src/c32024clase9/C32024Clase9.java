/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c32024clase9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author viti
 */
public class C32024Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        ClaseA claseA = new ClaseA(123,456);
        System.out.println(claseA.toString());
        ClaseB claseB = new ClaseB(claseA, Enum1.cerrado);
        System.out.println(claseB.toString());
        Date fecha =new Date();
        Date fecha1 =new Date(2000, 0, 1, 12, 10);
        
        System.err.println("fecha: " + fecha);
        System.out.println("fecha: " + fecha1);
        
        
        /**Bloque de formateo de fechas  */
        DateFormat formateador= new SimpleDateFormat("dd/M/yy");
        Date fecha2= formateador.parse("10/01/2022");
        // creamos un calendario
        Calendar calendario= new GregorianCalendar();
        //hacemos calculos sobre el calendario
        calendario.setTime(fecha2);
        //movemos el ccalendario
        //calendario.add(Calendar.DATE,5);
        //usamos el formateador y volvemos a mostrar la fecha
        System.out.println(formateador.format(calendario.getTime()));
        
        ClaseC claseC = new ClaseC(claseB, fecha);
        System.out.println(claseC.toString());
        
        
        
        /////////////////////// Vector de objetos ***************************************
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" /////////////////////// Vector de objetos *************************************** " );
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Estudiante estudiantes[] = new Estudiante[2];
        estudiantes[0]=new Estudiante(123, "Juan", "Perico");
        estudiantes[1]=new Estudiante(321, "Hector", "Gallina");
        //estudiantes[2]=new Estudiante(321, "Hector", "Gallina"); Error de index
        if (estudiantes[0]!=null)
            System.out.println("estudiantes[0] " + estudiantes[0].toString());
        if (estudiantes[1]!=null)
            System.out.println("estudiantes[1] " + estudiantes[1].toString());
        
        UtilMatrixEstudiantes utilMatrixEstudiantes = new UtilMatrixEstudiantes();
        utilMatrixEstudiantes.printMatrix(estudiantes, 2);
}
    
}
