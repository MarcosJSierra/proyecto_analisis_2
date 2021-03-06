/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.compras.vista;

import javax.swing.JFrame;
import org.proyectoa2.proveedores.vista.Proveedores;


/**
 *
 * @author malopez
 */
public class MainCompras extends javax.swing.JPanel {
    private NuevaCompra nuevaCompra;
    private BusquedaFecha busquedaFecha;
    private ConsultarInventario consultarInventario;
    private Proveedores gestionarProveedores;
    private BusquedaFactura busquedaFactura;
    private BusquedaProveedor busquedaProveedor;
    private JFrame frame;
    
    /**
     * Creates new form MainCompras
     */
    public MainCompras() {
        initComponents();
        this.panelCompras.setVisible(false);
    }
    
    /**
     *
     * @param main
     */
    public MainCompras(JFrame main) {
        initComponents();
        this.frame = main;
        this.panelCompras.setVisible(false);
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
        botonGestionarCompras = new javax.swing.JButton();
        botonGestionarProveedores = new javax.swing.JButton();
        botonConsultarInventario = new javax.swing.JButton();
        panelCompras = new javax.swing.JPanel();
        botonRegistrarCompra = new javax.swing.JButton();
        botonBuscarFacturaCompra = new javax.swing.JButton();
        botonBuscarProveedorCompra = new javax.swing.JButton();
        botonBuscarFechaCompra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Compras");
        jLabel1.setFocusable(false);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        botonGestionarCompras.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        botonGestionarCompras.setText("Gestionar Compras");
        botonGestionarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarComprasActionPerformed(evt);
            }
        });
        add(botonGestionarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 40));

        botonGestionarProveedores.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        botonGestionarProveedores.setText("Gestionar Proveedores");
        botonGestionarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarProveedoresActionPerformed(evt);
            }
        });
        add(botonGestionarProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 40));

        botonConsultarInventario.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        botonConsultarInventario.setText("Consultar Inventario");
        botonConsultarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarInventarioActionPerformed(evt);
            }
        });
        add(botonConsultarInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 250, 40));

        panelCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegistrarCompra.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        botonRegistrarCompra.setText("Registrar Compra");
        botonRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarCompraActionPerformed(evt);
            }
        });
        panelCompras.add(botonRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 160, 40));

        botonBuscarFacturaCompra.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        botonBuscarFacturaCompra.setText("Buscar Compra por factura");
        botonBuscarFacturaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarFacturaCompraActionPerformed(evt);
            }
        });
        panelCompras.add(botonBuscarFacturaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, 40));

        botonBuscarProveedorCompra.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        botonBuscarProveedorCompra.setText("Buscar Compra por proveedor");
        botonBuscarProveedorCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarProveedorCompraActionPerformed(evt);
            }
        });
        panelCompras.add(botonBuscarProveedorCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 40));

        botonBuscarFechaCompra.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        botonBuscarFechaCompra.setText("Buscar Compra por fecha");
        botonBuscarFechaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarFechaCompraActionPerformed(evt);
            }
        });
        panelCompras.add(botonBuscarFechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 220, 40));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setText("Busqueda");
        jLabel2.setFocusable(false);
        panelCompras.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        add(panelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 550, 260));

        botonSalir.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        botonSalir.setText("Cancelar");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarCompraActionPerformed
        nuevaCompra = new NuevaCompra();
        nuevaCompra.setVisible(true);
    }//GEN-LAST:event_botonRegistrarCompraActionPerformed

    private void botonGestionarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarProveedoresActionPerformed
        gestionarProveedores = new Proveedores();
        gestionarProveedores.setVisible(true);
    }//GEN-LAST:event_botonGestionarProveedoresActionPerformed

    private void botonBuscarFechaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarFechaCompraActionPerformed
        busquedaFecha = new BusquedaFecha();
        busquedaFecha.setVisible(true);
    }//GEN-LAST:event_botonBuscarFechaCompraActionPerformed

    private void botonConsultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarInventarioActionPerformed
        consultarInventario = new ConsultarInventario();
        consultarInventario.setVisible(true);
    }//GEN-LAST:event_botonConsultarInventarioActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.frame.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonGestionarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarComprasActionPerformed
        this.panelCompras.setVisible(true);
    }//GEN-LAST:event_botonGestionarComprasActionPerformed

    private void botonBuscarFacturaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarFacturaCompraActionPerformed
        busquedaFactura = new BusquedaFactura();
        busquedaFactura.setVisible(true);
    }//GEN-LAST:event_botonBuscarFacturaCompraActionPerformed

    private void botonBuscarProveedorCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProveedorCompraActionPerformed
        busquedaProveedor = new BusquedaProveedor();
        busquedaProveedor.setVisible(true);
    }//GEN-LAST:event_botonBuscarProveedorCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarFacturaCompra;
    private javax.swing.JButton botonBuscarFechaCompra;
    private javax.swing.JButton botonBuscarProveedorCompra;
    private javax.swing.JButton botonConsultarInventario;
    private javax.swing.JButton botonGestionarCompras;
    private javax.swing.JButton botonGestionarProveedores;
    private javax.swing.JButton botonRegistrarCompra;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelCompras;
    // End of variables declaration//GEN-END:variables
}
