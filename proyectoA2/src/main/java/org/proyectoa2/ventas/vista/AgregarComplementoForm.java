/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.ventas.vista;

import javax.swing.DefaultListModel;
import org.marcos.dto.DetalleComplementos;
import org.marcos.dto.DetalleOrden;
import org.marcos.dto.Inventario;
import org.proyectoa2.ventas.controller.ManejoListaComplementos;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class AgregarComplementoForm extends javax.swing.JFrame {
    private ManejoListaComplementos manejador;
    private DetalleComplementos detalleComplemento;
    private DetalleOrden detalle;
    private AgregarPlatilloForm agregarPlatillo;
    
    /**
     * Creates new form AgregarComplementoForm
     */
    public AgregarComplementoForm() {
        initComponents();
    }
    public AgregarComplementoForm(AgregarPlatilloForm agregarPlatillo, DetalleOrden detalle) {
        initComponents();
        manejador = ManejoListaComplementos.getManejador();
        DefaultListModel modelo = new DefaultListModel();
        String tmp;
        for(Inventario item : manejador.getListaComplementos()){
            tmp = item.getNombre();
            modelo.addElement(tmp);
        }
        this.listaComplementos.setModel(modelo);
        this.detalle = detalle;
        detalleComplemento = new DetalleComplementos();
        this.agregarPlatillo = agregarPlatillo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaComplementos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textPrecioVenta = new javax.swing.JTextField();
        inputCantidad = new javax.swing.JSpinner();

        setTitle("Agregar Complemento");
        setMinimumSize(new java.awt.Dimension(647, 383));
        setPreferredSize(new java.awt.Dimension(647, 383));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Agregar Complemento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        botonAgregar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 40));

        botonCancelar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, 40));

        listaComplementos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaComplementos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaComplementosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaComplementos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 340, 330));

        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setText("Precio Venta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        textPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioVentaActionPerformed(evt);
            }
        });
        getContentPane().add(textPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 30));

        inputCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(inputCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        if(this.textPrecioVenta.getText().length() < 1 || listaComplementos.getSelectedIndex() < 0){
            String tmp = "Revise si ha llenado los campos correctamente";
            if(this.textPrecioVenta.getText().length() < 1)
                tmp = tmp + "\n   * No se ha llenado el precio de venta";
            if(listaComplementos.getSelectedIndex() < 0)
                tmp = tmp + "\n   * No se ha seleccionado un complemento";
            
            JOptionPane.showMessageDialog(null, tmp, "Error, no se puede procesar!!!", JOptionPane.WARNING_MESSAGE);
        }else{
            detalleComplemento.setInventario(manejador.getComplemento(listaComplementos.getSelectedIndex()));
            detalleComplemento.setIdInventario(detalleComplemento.getInventario().getIdInventario());
            detalleComplemento.setCantidad((int) this.inputCantidad.getValue());
            detalleComplemento.setPrecioVenta(Double.valueOf(textPrecioVenta.getText()));
            double subtotal = detalleComplemento.getCantidad() * detalleComplemento.getPrecioVenta();
            detalleComplemento.setSubTotal(subtotal);
            detalle.addDetalleComplementos(detalleComplemento);
            agregarPlatillo.actualizarComplementos();
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void textPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioVentaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void listaComplementosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaComplementosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaComplementosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarComplementoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarComplementoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarComplementoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarComplementoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarComplementoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JSpinner inputCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaComplementos;
    private javax.swing.JTextField textPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
