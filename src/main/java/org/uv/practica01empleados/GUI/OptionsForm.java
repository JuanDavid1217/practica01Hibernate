/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.uv.practica01empleados.GUI;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import org.uv.practica01empleados.DAOEmpleado;
import org.uv.practica01empleados.Empleado;

/**
 *
 * @author juan
 */
public class OptionsForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateForm
     */
    private int option=1;
    private Empleado empleado;
    
    public OptionsForm(int option) {
        initComponents();
        this.option=option;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idEmpleado = new javax.swing.JLabel();
        idEntrada = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreEntrada = new javax.swing.JTextField();
        direccionEntrada = new javax.swing.JTextField();
        aceptarButton = new javax.swing.JButton();

        setClosable(true);

        idEmpleado.setText("ID:");

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Dirección:");

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(idEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(buscarButton)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(direccionEntrada)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(aceptarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEmpleado)
                    .addComponent(idEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(buscarButton))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(direccionEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(aceptarButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        if(empleado!=null){
            if (option==1){
                int pase=JOptionPane.showConfirmDialog(null, "Estas seguro de actualizar el empleado con id "+empleado.getClaveEmpleado()+"?", "Actualización", JOptionPane.YES_NO_OPTION);
                if(pase==0){
                    DAOEmpleado daoEmpleado=new DAOEmpleado();
                    Empleado emp=new Empleado();
                    emp.setClaveEmpleado(empleado.getClaveEmpleado());
                    emp.setNombreEmpleado(nombreEntrada.getText());
                    emp.setDireccionEmpleado(direccionEntrada.getText());
                    daoEmpleado.update(emp, empleado.getClaveEmpleado());
                    JOptionPane.showMessageDialog(null, "Empleado actualizado con exito!");
                    idEntrada.setText("");
                    nombreEntrada.setText("");
                    direccionEntrada.setText("");
                    empleado=null;
                }
                
            }else{
                int pase=JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar el empleado con id "+empleado.getClaveEmpleado()+"?", "Actualización", JOptionPane.YES_NO_OPTION);
                if(pase==0){
                    DAOEmpleado daoEmpleado=new DAOEmpleado();
                    daoEmpleado.delete(empleado.getClaveEmpleado());
                    JOptionPane.showMessageDialog(null, "Empleado borrado con exito!");
                    idEntrada.setText("");
                    nombreEntrada.setText("");
                    direccionEntrada.setText("");
                    empleado=null;
                }
            }
        }
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        if(!idEntrada.getText().equals("")){
        try{
            long id=0;
            id=Long.parseLong(idEntrada.getText());
            if(id!=0){
                DAOEmpleado daoEmpleado=new DAOEmpleado();
                empleado=daoEmpleado.findByID(id);
                if(empleado!=null){
                    nombreEntrada.setText(empleado.getNombreEmpleado());
                    direccionEntrada.setText(empleado.getDireccionEmpleado());
                }else{
                    JOptionPane.showMessageDialog(null, "El empleado no existe!");
                }
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Ingresa solo números");
        }
        }
    }//GEN-LAST:event_buscarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField direccionEntrada;
    private javax.swing.JLabel idEmpleado;
    private javax.swing.JTextField idEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nombreEntrada;
    // End of variables declaration//GEN-END:variables
}
