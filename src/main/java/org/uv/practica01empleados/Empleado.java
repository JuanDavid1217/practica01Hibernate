/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.practica01empleados;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 *
 * @author juan
 */
@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long claveEmpleado;
    
    @Column(name="nombre")
    private String nombreEmpleado;
    
    @Column(name="dirección")
    private String direccionEmpleado;
    
    public void setClaveEmpleado(long claveEmpleado){
        this.claveEmpleado=claveEmpleado;
    }
    public long getClaveEmpleado(){
        return this.claveEmpleado;
    }
    
    public void setNombreEmpleado(String nombreEmpleado){
        this.nombreEmpleado=nombreEmpleado;
    }
    public String getNombreEmpleado(){
        return this.nombreEmpleado;
    }
    
    public void setDireccionEmpleado(String direccionEmpleado){
        this.direccionEmpleado=direccionEmpleado;
    }
    public String getDireccionEmpleado(){
        return this.direccionEmpleado;
    }
}
