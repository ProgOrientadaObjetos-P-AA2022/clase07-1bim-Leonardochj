/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("ERSSA", "Loja");
        Empresa e2 = new Empresa("TÍA", "Guayaquil");
        Empresa e3 = new Empresa("NESTLÉ", "Quito");
        
        // ArrayList
        ArrayList <Empresa> empresas = new ArrayList<>();
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);
        
        
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println("--------------------------");
            Empresa c = empresas.get(i);
            System.out.printf("Nombre de la empresa: %s\n"
                    + "Ciudad donde se ubica a empresa: %s\n",
                    c.obtenerNombre(), c.obtenerCiudad());
        }
    }
}
