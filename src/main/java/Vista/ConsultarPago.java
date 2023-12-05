/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Danilore
 */
public class ConsultarPago extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarPago
     */
    public ConsultarPago() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdPago = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVehiculo = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnExcel1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtConductor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtTipoVehiculo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMontoPago = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbxMetodoPago = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("72", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CONSULTAR PAGOS");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 470, 40));

        jLabel12.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel12.setText("DNI:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 20));

        txtIdPago.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtIdPago.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIdPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdPago.setEnabled(false);
        jPanel1.add(txtIdPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 40, 20));

        tableVehiculo.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        tableVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Conductor", "Placa", "Tipo  de Vehiculo", "Destino", "Fecha", "Monto", "Metodo Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVehiculoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableVehiculo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 600, 500));

        jLabel7.setFont(new java.awt.Font("72", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("LISTADO DE SALIDAS DE VEHÍCULOS REGISTRADOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 290, -1));

        jLabel8.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("REGISTRA UNA NUEVA SALIDA DE VEHÍCULO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, 30));

        btnActualizar.setBackground(new java.awt.Color(51, 255, 51));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(51, 255, 51));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        btnExcel1.setBackground(new java.awt.Color(51, 255, 51));
        btnExcel1.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel1.setText("Excel");
        jPanel1.add(btnExcel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("Reportes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 80, 30));

        txtConductor.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtConductor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtConductor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConductorKeyTyped(evt);
            }
        });
        jPanel1.add(txtConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 260, 20));

        txtPlaca.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPlaca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, 20));

        jLabel16.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel16.setText("Placa:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 20));

        jLabel13.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel13.setText("Conductor:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 60, 20));

        txtDni.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtDni.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 120, 20));

        txtTipoVehiculo.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtTipoVehiculo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipoVehiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTipoVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoVehiculoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 140, 20));

        jLabel19.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel19.setText("Tipo Vehiculo:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 20));

        jLabel23.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel23.setText("Lugar de Destino:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        txtDestino.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtDestino.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDestino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 340, 20));

        jLabel18.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel18.setText("Monto Total:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 80, 20));

        txtMontoPago.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtMontoPago.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMontoPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMontoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoPagoKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 130, 20));

        jLabel20.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel20.setText("Metodo de Pago:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 20));

        cbxMetodoPago.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        cbxMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMetodoPagoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVehiculoMouseClicked
        int fila = tableVehiculo.rowAtPoint(evt.getPoint());

        txtIdPago.setText(tableVehiculo.getValueAt(fila, 0).toString());
        txtDni.setText(tableVehiculo.getValueAt(fila, 1).toString());
        txtConductor.setText(tableVehiculo.getValueAt(fila, 2).toString());
        txtPlaca.setText(tableVehiculo.getValueAt(fila, 3).toString());
        txtTipoVehiculo.setText(tableVehiculo.getValueAt(fila, 4).toString());
        txtDestino.setText(tableVehiculo.getValueAt(fila, 5).toString());
        txtMontoPago.setText(tableVehiculo.getValueAt(fila, 7).toString());

    }//GEN-LAST:event_tableVehiculoMouseClicked

    private void txtTipoVehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoVehiculoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoVehiculoKeyTyped

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConductorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConductorKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed

    }//GEN-LAST:event_txtDniKeyPressed

    private void txtDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoKeyTyped

    private void txtMontoPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoPagoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoPagoKeyTyped

    private void cbxMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMetodoPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnExcel1;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JComboBox<String> cbxMetodoPago;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableVehiculo;
    public javax.swing.JTextField txtConductor;
    public javax.swing.JTextField txtDestino;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtIdPago;
    public javax.swing.JTextField txtMontoPago;
    public javax.swing.JTextField txtPlaca;
    public javax.swing.JTextField txtTipoVehiculo;
    // End of variables declaration//GEN-END:variables
}