/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Calificacion calificacion1 = new Calificacion(9.8, "Álgebra Lineal");
        Calificacion calificacion2 = new Calificacion(8.5, "Física Básica");
        
        calificacion1.establecerProfesor(prof1);
        calificacion2.establecerProfesor(prof2);
        
        // ArrayList
        ArrayList <Calificacion> calificaciones = new ArrayList<>();
        calificaciones.add(calificacion1);
        calificaciones.add(calificacion2);
        
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.println("--------------------------");
            Calificacion c = calificaciones.get(i);
            System.out.printf("Nombre del profesor: %s\n"
                    + "Nombre de la Materia: %s\n"
                    + "Nota: %.2f\n", 
                    c.obtenerProfesor().obtenerNombre(), 
                    c.obtenerNombreMateria(), c.obtenerNota());
        }
    }
}
