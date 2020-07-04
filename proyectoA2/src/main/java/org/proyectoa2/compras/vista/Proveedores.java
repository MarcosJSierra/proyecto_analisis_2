/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.compras.vista;

/**
 *
 * @author malopez
 */
public class Proveedores extends javax.swing.JFrame {
    private AgregarProveedor agregarProveedor;
    private VerProveedor verProveedor;
    
    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        botonNuevoProveedor = new javax.swing.JButton();
        botonVerProveedor = new javax.swing.JButton();
        botonEliminarProveedor = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(620, 310));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Proveedores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIT", "Nombre", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProveedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 570, 130));

        botonNuevoProveedor.setText("Agregar Proveedor");
        botonNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(botonNuevoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        botonVerProveedor.setText("Ver Proveedor");
        botonVerProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        botonEliminarProveedor.setText("Eliminar Proveedor");
        getContentPane().add(botonEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoProveedorActionPerformed
        agregarProveedor = new AgregarProveedor();
        agregarProveedor.setVisible(true);
    }//GEN-LAST:event_botonNuevoProveedorActionPerformed

    private void botonVerProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerProveedorActionPerformed
        verProveedor = new VerProveedor();
        verProveedor.setVisible(true);
    }//GEN-LAST:event_botonVerProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarProveedor;
    private javax.swing.JButton botonNuevoProveedor;
    private javax.swing.JButton botonVerProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProveedores;
    // End of variables declaration//GEN-END:variables
}