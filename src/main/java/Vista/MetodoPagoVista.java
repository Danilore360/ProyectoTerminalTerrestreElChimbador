/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Clases.Evento;

/**
 *
 * @author Danilore
 */
public class MetodoPagoVista extends javax.swing.JInternalFrame {

    Evento event = new Evento();
    public MetodoPagoVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtIdMetodoPago = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMetodoPago = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminarMetodoPago = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnExcel1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listado de Metodos de Pago");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("72", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("METODOS DE PAGO");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 420, 40));

        jLabel12.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel12.setText("DESCRIPCION:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 20));

        txtDescripcion.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 210, 20));

        txtIdMetodoPago.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtIdMetodoPago.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIdMetodoPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdMetodoPago.setEnabled(false);
        jPanel1.add(txtIdMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 20, 20));

        tableMetodoPago.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        tableMetodoPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMetodoPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMetodoPagoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableMetodoPago);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 520, 280));

        jLabel7.setFont(new java.awt.Font("72", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("LISTADO DE TIPOS DE METODOS DE PAGO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 260, -1));

        jLabel8.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("REGISTRA UN NUEVO METODO DE PAGO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 30));

        btnGuardar.setBackground(new java.awt.Color(51, 255, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 255, 51));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(51, 255, 51));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        btnEliminarMetodoPago.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarMetodoPago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarMetodoPago.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarMetodoPago.setText("Eliminar");
        jPanel1.add(btnEliminarMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("Reportes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 80, 30));

        btnExcel1.setBackground(new java.awt.Color(51, 255, 51));
        btnExcel1.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel1.setText("Excel");
        jPanel1.add(btnExcel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void tableMetodoPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMetodoPagoMouseClicked
        
    }//GEN-LAST:event_tableMetodoPagoMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnEliminarMetodoPago;
    public javax.swing.JButton btnExcel1;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableMetodoPago;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtIdMetodoPago;
    // End of variables declaration//GEN-END:variables
}
