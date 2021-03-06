/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.ventas.vista;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.marcos.dto.DetalleComplementos;
import org.marcos.dto.DetalleOrden;
import org.marcos.dto.Orden;
import org.proyectoa2.ventas.controller.ManejoColaOrdenes;

/**
 *
 * @author marcos
 */
public class AtenderOrdenForm extends javax.swing.JFrame {
    private VisualizarDetallesPlatilloForm visualizarDetalles;
    private ManejoColaOrdenes manejador;
    private Orden orden;
    /**
     * Creates new form AtenderOrdenForm
     */
    public AtenderOrdenForm() {
        initComponents();
    }
    public AtenderOrdenForm(Orden orden) {
        initComponents();
        manejador = ManejoColaOrdenes.obtenerControlador();
        this.orden = orden;
        String tmp;
        DefaultListModel modelo = new DefaultListModel();
        for(DetalleOrden item : this.orden.getDetalles()){
            tmp = item.getMenu().getNombreMenu()+  " || Cantidad: " + item.getCantidad();
            modelo.addElement(tmp);
        }
        this.listaPlatillos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVerDetallesPlatillo = new javax.swing.JButton();
        botonMarcarAtendido = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        etiquetaDetallesOrden = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPlatillos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaComplementos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(746, 563));
        setPreferredSize(new java.awt.Dimension(746, 563));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVerDetallesPlatillo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botonVerDetallesPlatillo.setText("Ver Detalles del Platillo");
        botonVerDetallesPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDetallesPlatilloActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerDetallesPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, 40));

        botonMarcarAtendido.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botonMarcarAtendido.setText("Marcar como Atendida");
        botonMarcarAtendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMarcarAtendidoActionPerformed(evt);
            }
        });
        getContentPane().add(botonMarcarAtendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 220, 40));

        botonRegresar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 220, 40));

        etiquetaDetallesOrden.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiquetaDetallesOrden.setText("Detalles de Orden");
        getContentPane().add(etiquetaDetallesOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        listaPlatillos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPlatillos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPlatillosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaPlatillos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 410, 350));

        listaComplementos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaComplementos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 280, 350));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Platillos en la orden");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 410, 40));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Complementos");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 280, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerDetallesPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDetallesPlatilloActionPerformed
        // TODO add your handling code here:
        if(this.listaPlatillos.getSelectedIndex() >= 0){
            this.visualizarDetalles = new VisualizarDetallesPlatilloForm(this.orden.getDetalles().get(this.listaPlatillos.getSelectedIndex()).getMenu());
            this.visualizarDetalles.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un platillo en la lista\n para versu descripcion", "Error, no se puede procesar!!!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonVerDetallesPlatilloActionPerformed

    private void botonMarcarAtendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMarcarAtendidoActionPerformed
        if(orden.getEstado() == 1){
            manejador.cambiarEstado();
            JOptionPane.showMessageDialog(null, "Operacion realizada con exito!!!", "Operacion realizada con exito!!!", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Las ordenes que ya han sido atendidas\n no pueden volver a atenderse", "Error, no se puede procesar!!!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonMarcarAtendidoActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void listaPlatillosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPlatillosMouseClicked
        // TODO add your handling code here:
        if(this.listaPlatillos.getSelectedIndex() >= 0){
            this.actualizarComplementos();
        }
    }//GEN-LAST:event_listaPlatillosMouseClicked

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
            java.util.logging.Logger.getLogger(AtenderOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtenderOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtenderOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtenderOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtenderOrdenForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMarcarAtendido;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVerDetallesPlatillo;
    private javax.swing.JLabel etiquetaDetallesOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaComplementos;
    private javax.swing.JList<String> listaPlatillos;
    // End of variables declaration//GEN-END:variables
    public void actualizarComplementos(){
        String tmp;
        DefaultListModel modelo = new DefaultListModel();
        for(DetalleComplementos item : this.orden.getDetalles().get(this.listaPlatillos.getSelectedIndex()).getListaComplementos()){
            tmp = item.getInventario().getNombre() +  " || Cantidad: " + item.getCantidad();
            modelo.addElement(tmp);
        }
        this.listaComplementos.setModel(modelo);
    }
}
