/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.practica01empleados;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author juan
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, Long>{

    @Override
    public Empleado create(Empleado t) {
        Session session=HibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        
        session.save(t);
        
        transaction.commit();
        session.close();
        
        return t;
    }

    @Override
    public boolean delete(Long id) {
        boolean pase=false;
        Session session=HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
        
        Empleado emp=session.get(Empleado.class, id);
        if (emp!=null){
            session.delete(emp);
            t.commit();
            pase=true;
        }
        
        session.close();
        return pase;
    }

    @Override
    public Empleado update(Empleado t, Long id) {
        Session session=HibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        
        Empleado emp=session.get(Empleado.class, id);
        if(emp!=null){
            session.merge(t);
            transaction.commit();
        }
        session.close();
        return t;
    }

    @Override
    public List<Empleado> findAll() {
        Session session=HibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        
        List<Empleado> listaEmpleados=session.createQuery("From Empleado e order by e.claveEmpleado").list();
        
        transaction.commit();
        session.close();
        
        return listaEmpleados;
    }

    @Override
    public Empleado findByID(Long id) {
        Session session=HibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        
        Empleado emp=session.get(Empleado.class, id);
        
        transaction.commit();
        session.close();
        return emp;
    }
    
}
