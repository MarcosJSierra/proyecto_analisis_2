/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.inventario.vista;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.proyectoa2.inventario.controlador.Ingresar_Producto;
import org.proyectoa2.inventario.controlador.NoPerecedero;
import org.proyectoa2.inventario.controlador.Perecedero;
import org.proyectoa2.inventario.interfaces.TipoProducto;

/**
 *
 * @author Gilda
 */
public class AgregarInventario extends javax.swing.JFrame {

    /**
     * Creates new form AgregarInventario
     */
    public AgregarInventario() {
        initComponents();
        JDateFecha.setEnabled(true);

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
        JTextnombre = new javax.swing.JTextField();
        JTexistencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JDateFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        JTextLote = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JProducto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NUEVO PRODUCTO");

        JTextnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextnombreFocusLost(evt);
            }
        });
        JTextnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextnombreActionPerformed(evt);
            }
        });

        JTexistencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTexistenciaFocusLost(evt);
            }
        });

        jLabel2.setText("Tipo Producto");

        jLabel3.setText("Nombre");

        jLabel4.setText("Existencia");

        JTextDescripcion.setColumns(20);
        JTextDescripcion.setRows(5);
        JTextDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextDescripcionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(JTextDescripcion);

        jLabel5.setText("Descripcion");

        jLabel6.setText("Fecha caducidad");

        JDateFecha.setFocusCycleRoot(true);
        JDateFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JDateFechaFocusLost(evt);
            }
        });

        jLabel7.setText("Lote");

        JTextLote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextLoteFocusLost(evt);
            }
        });

        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perecedero", "No Perecedero" }));
        JProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JTextnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(JTexistencia))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextLote, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTexistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(JTextLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(129, 129, 129))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean bandera = false;
        bandera = verificarcomponentes();
        if (bandera == false) {

            try {

                String nombre = JTextnombre.getText();
                int existencia = Integer.parseInt(JTexistencia.getText());
                String descripcion = JTextDescripcion.getText();
                String lote = JTextLote.getText();
                String opcion = "";
                opcion = (String) JProducto.getSelectedItem();
                Date fecha = null;
                TipoProducto tipo;
                if (opcion.equals("Perecedero")) {
                    fecha = JDateFecha.getDate();
                    tipo = new Perecedero();
                } else {

                    tipo = new NoPerecedero();
                }
                Ingresar_Producto ingresar = new Ingresar_Producto();

                ingresar.Crear(descripcion, existencia, lote, fecha, nombre, tipo);
                limpiar();
                JOptionPane.showMessageDialog(null, "Ingresado correctamente", "CONFIRMACION", JOptionPane.WARNING_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido ingresar", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido ingresar", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean verificarcomponentes() {
        ArrayList<Integer> lista = new ArrayList();
        boolean b1 = false;
        //COMPROBAR NOMBRE
        verificar v = new verificar();
        b1 = v.verify(JTextnombre);
        if (b1 == true) {
            lista.add(2);
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del producto", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else {
            lista.add(1);
        }
        //COMPROBAR EXISTENCIA
        boolean b2 = false;
        b2 = v.verify(JTexistencia);
        if (b2 == true) {
            JOptionPane.showMessageDialog(null, "Debe de ingresar la existencia", "ERROR", JOptionPane.WARNING_MESSAGE);
            lista.add(2);
        } else {
            lista.add(1);
        }

        boolean b3 = false;
        verificarexistencia v3 = new verificarexistencia();
        b3 = v3.verify(JTexistencia);
        if (b3 == true) {
            JOptionPane.showMessageDialog(null, "La existencia debe de ser un numero", "ERROR", JOptionPane.WARNING_MESSAGE);
            lista.add(2);
        } else {
            lista.add(1);
        }
        //COMPROBAR DESCRIPCION
        boolean b4 = false;
        verificarTArea v4 = new verificarTArea();

        b4 = v4.verify(JTextDescripcion);
        if (b4 == true) {
            JOptionPane.showMessageDialog(null, "Ingrese la descripcion del producto", "ERROR", JOptionPane.WARNING_MESSAGE);
            lista.add(2);
        } else {
            lista.add(1);
        }

        //COMPMROBAR LOTE
        boolean b5 = false;
        b5 = v.verify(JTextLote);
        if (b5 == true) {
            JOptionPane.showMessageDialog(null, "Ingrese el lote del producto", "ERROR", JOptionPane.WARNING_MESSAGE);
            lista.add(2);
        } else {
            lista.add(1);
        }

        //lista para saber si hay errores
        int cant = lista.size();
        boolean band = false;
        for (int x = 0; x < cant; x++) {
            int val = lista.get(x);
            if (val == 2) {
                band = true;
                x = cant;
            }

        }
        return band;
    }

    private void limpiar() {
        JTextnombre.setText("");
        JTexistencia.setText("");
        JTextDescripcion.setText("");
        JTextLote.setText("");

    }
    private void JProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JProductoActionPerformed
        String opcion = "";
        opcion = (String) JProducto.getSelectedItem();
        if (opcion.equals("Perecedero")) {
            JDateFecha.setEnabled(true);
        } else {
            JDateFecha.setEnabled(false);
        }
    }//GEN-LAST:event_JProductoActionPerformed

    private void JTextnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextnombreActionPerformed

    }//GEN-LAST:event_JTextnombreActionPerformed

    private void JTextnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextnombreFocusLost

    }//GEN-LAST:event_JTextnombreFocusLost

    private void JTexistenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTexistenciaFocusLost

    }//GEN-LAST:event_JTexistenciaFocusLost

    private void JTextDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextDescripcionFocusLost

    }//GEN-LAST:event_JTextDescripcionFocusLost

    private void JTextLoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextLoteFocusLost

    }//GEN-LAST:event_JTextLoteFocusLost

    private void JDateFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JDateFechaFocusLost

    }//GEN-LAST:event_JDateFechaFocusLost
//verifica que se ingrese el valor

    class verificar extends InputVerifier {

        @Override
        public boolean verify(JComponent input) {
            final JTextField source = (JTextField) input;
            String s = source.getText();

            if (s.equals("")) {
                return true;
            } else {
                return false;
            }
        }

    }

    class verificarTArea extends InputVerifier {

        @Override
        public boolean verify(JComponent input) {
            final JTextArea source = (JTextArea) input;
            String s = source.getText();

            if (s.equals("")) {
                return true;
            } else {
                return false;
            }
        }

    }

//verifica que la existencia sea numero
    class verificarexistencia extends InputVerifier {

        @Override
        public boolean verify(JComponent input) {
            final JTextField source = (JTextField) input;
            String s = source.getText();

            if (isNumeric(s)) {
                return false;
            } else {
                return true;
            }
        }

    }

    //para saber si lo que se ingresa es numereo o no
    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(AgregarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarInventario().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateFecha;
    private javax.swing.JComboBox<String> JProducto;
    private javax.swing.JTextField JTexistencia;
    private javax.swing.JTextArea JTextDescripcion;
    private javax.swing.JTextField JTextLote;
    private javax.swing.JTextField JTextnombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
