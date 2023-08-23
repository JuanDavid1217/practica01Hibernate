/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.practica01empleados;

import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author juan
 */
public class Practica01Empleados {

    public static void main(String[] args) {
        /*Empleado emp=new Empleado();
        emp.setNombreEmpleado("David");
        emp.setDireccionEmpleado("Monte Blanco");
        
        DAOEmpleado daoEmpleado=new DAOEmpleado();
        emp=daoEmpleado.create(emp);
        System.out.println("Hola");*/
        DAOEmpleado daoEmpleado=new DAOEmpleado();
        List<Empleado>lista=daoEmpleado.findAll();
        for(Empleado e:lista){
            System.out.println(e.getNombreEmpleado());
        }
    }
}

