package vista;

import control.Controlador;
import errores.CantidadCeroExcepcion;

import javax.swing.*;

/**
 *
 * @author DanielPerez
 */
public class Vista extends javax.swing.JFrame {
    private Controlador controlador;
    
    public Vista() {
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new Controlador();
        this.jListHerramientas.setModel(controlador.getModeloHerramientas());
    }
    
    public void actualizar() {
        this.jListHerramientas.setModel(this.controlador.getModeloHerramientas());
        this.jListCarrito.setModel(this.controlador.getModeloCarrito());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHerramientas = new javax.swing.JList<>();
        lbCarrito = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCarrito = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarAlCarrito = new javax.swing.JButton();
        btnVaciarElCarrito = new javax.swing.JButton();
        btnRealizarCompra = new javax.swing.JButton();
        btnEliminarDelCarrito = new javax.swing.JButton();
        lbNumeroCantidadDisponible = new javax.swing.JLabel();
        lbCantidadDisponible = new javax.swing.JLabel();
        lbUnidades = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        lbSignoPesos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbNumeroPrecio = new javax.swing.JLabel();
        lbDescripcionDelArticulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setText("Sistema Ferretería");

        jListHerramientas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jListHerramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListHerramientasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListHerramientas);

        lbCarrito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCarrito.setText("Carrito");

        jListCarrito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(jListCarrito);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Lista herramientas");

        btnAgregarAlCarrito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregarAlCarrito.setText("Agregar al carrito");
        btnAgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlCarritoActionPerformed(evt);
            }
        });

        btnVaciarElCarrito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVaciarElCarrito.setText("Vaciar el carrito");
        btnVaciarElCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarElCarritoActionPerformed(evt);
            }
        });

        btnRealizarCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRealizarCompra.setText("Realizar compra");
        btnRealizarCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizarCompra.setBorderPainted(false);
        btnRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCompraActionPerformed(evt);
            }
        });

        btnEliminarDelCarrito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminarDelCarrito.setText("Eliminar del carrito");
        btnEliminarDelCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDelCarritoActionPerformed(evt);
            }
        });

        lbNumeroCantidadDisponible.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNumeroCantidadDisponible.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbCantidadDisponible.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCantidadDisponible.setText("Cantidad disponible:");

        lbUnidades.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbUnidades.setText("unidades");

        lbPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPrecio.setText("Precio:");

        lbSignoPesos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSignoPesos.setText("$");

        lbNumeroPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNumeroPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbDescripcionDelArticulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDescripcionDelArticulo.setText("Descripción del artículo:");

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(txtDescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregarAlCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNumeroCantidadDisponible, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbUnidades))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbCantidadDisponible, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbDescripcionDelArticulo)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbSignoPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbNumeroPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEliminarDelCarrito)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVaciarElCarrito))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbCantidadDisponible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNumeroCantidadDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(lbPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(283, 283, 283))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbSignoPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNumeroPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbDescripcionDelArticulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarAlCarrito)
                            .addComponent(btnEliminarDelCarrito)
                            .addComponent(btnVaciarElCarrito))
                        .addGap(18, 18, 18)
                        .addComponent(btnRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlCarritoActionPerformed
        // btnAgregarAlCarrito
        try {
            int herramientaSeleccionada = this.jListHerramientas.getSelectedIndex();
            this.controlador.agregarACarrito(herramientaSeleccionada);
            actualizar();
        } catch (IndexOutOfBoundsException e1) {
            String mensaje = "Por favor, seleccione una herramienta de la lista de herramientas para poder agregar al carrito.";
            String titulo = "Herramienta sin selección";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarAlCarritoActionPerformed

    private void btnEliminarDelCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDelCarritoActionPerformed
        // btnEliminarDelCarrito
        try {
            int indiceDelCarrito = this.jListCarrito.getSelectedIndex();
            this.controlador.eliminarDelCarrito(indiceDelCarrito);
            actualizar();
        } catch (IndexOutOfBoundsException e1) {
            String mensaje = "Por favor, seleccione una herramienta del carrito para poder eliminarla.";
            String titulo = "Carrito sin selección";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarDelCarritoActionPerformed

    private void btnVaciarElCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarElCarritoActionPerformed
        // btnVaciarElCarrito
        try {
            if (this.controlador.getListaCarrito().size() == 0) {
                throw new CantidadCeroExcepcion("Carrito vacío");
            }
            this.controlador.limpiarCarrito();
            actualizar();
        } catch (CantidadCeroExcepcion e1) {
            String mensaje = "El carrito ya está vacío.";
            String titulo = "Carrito vacío";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnVaciarElCarritoActionPerformed

    private void jListHerramientasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListHerramientasMousePressed
        // clickJLIstHerramientas
        int numHerramientaSeleccionada = this.jListHerramientas.getSelectedIndex();
        int cantidadDisponible = this.controlador.getListaHerramientas().get(numHerramientaSeleccionada).getCantidadDisponible();
        double precio = this.controlador.getListaHerramientas().get(numHerramientaSeleccionada).getPrecio();
        String descripcion = this.controlador.getListaHerramientas().get(numHerramientaSeleccionada).getDescripcion();
        this.lbNumeroCantidadDisponible.setText("" + cantidadDisponible);
        this.lbNumeroPrecio.setText("" + precio);
        this.txtDescripcion.setText(descripcion);
    }//GEN-LAST:event_jListHerramientasMousePressed

    private void btnRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCompraActionPerformed
        // btnRealizarCompra
        try {
            if (this.controlador.getListaCarrito().size() == 0) {
                throw new CantidadCeroExcepcion("Carrito vacío");
            }
            this.controlador.realizarCompra();
            actualizar();
            this.lbNumeroCantidadDisponible.setText("");
            this.lbNumeroPrecio.setText("");
            this.txtDescripcion.setText("");
        } catch (CantidadCeroExcepcion e1) {
            String mensaje = "No se puede realizar una compra con el carrito vacío, por favor revise su compra.";
            String titulo = "Carrito vacío";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRealizarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlCarrito;
    private javax.swing.JButton btnEliminarDelCarrito;
    private javax.swing.JButton btnRealizarCompra;
    private javax.swing.JButton btnVaciarElCarrito;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListCarrito;
    private javax.swing.JList<String> jListHerramientas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCantidadDisponible;
    private javax.swing.JLabel lbCarrito;
    private javax.swing.JLabel lbDescripcionDelArticulo;
    private javax.swing.JLabel lbNumeroCantidadDisponible;
    private javax.swing.JLabel lbNumeroPrecio;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbSignoPesos;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUnidades;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
