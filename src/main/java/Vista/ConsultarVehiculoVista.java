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
public class ConsultarVehiculoVista extends javax.swing.JInternalFrame {

    Evento event = new Evento();
    public ConsultarVehiculoVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVehiculo = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnExcel1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        btnBuscarTipoVehiculo = new javax.swing.JButton();
        cbxTipoVehiculo = new javax.swing.JComboBox<>();
        txtTipo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Vehiculos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("72", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VEHÍCULOS");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 280, 40));

        tableVehiculo.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        tableVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Placa", "Tipo de Vehiculo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 850, 410));

        jLabel7.setFont(new java.awt.Font("72", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("LISTADO DE VEHÍCULOS REGISTRADOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 260, -1));

        btnBuscar.setBackground(new java.awt.Color(51, 255, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        btnExcel1.setBackground(new java.awt.Color(51, 255, 51));
        btnExcel1.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel1.setText("Excel");
        jPanel1.add(btnExcel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("Reportes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 80, 30));

        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 110, -1));

        btnListar.setBackground(new java.awt.Color(51, 255, 51));
        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        btnBuscarTipoVehiculo.setBackground(new java.awt.Color(51, 255, 51));
        btnBuscarTipoVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarTipoVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarTipoVehiculo.setText("Buscar");
        btnBuscarTipoVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnBuscarTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        cbxTipoVehiculo.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        cbxTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 170, -1));

        txtTipo.setEditable(false);
        jPanel1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVehiculoMouseClicked

    }//GEN-LAST:event_tableVehiculoMouseClicked

    private void cbxTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoVehiculoActionPerformed
        // TODO add your handling code here:ss
    }//GEN-LAST:event_cbxTipoVehiculoActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        event.placaKeyPress(evt, txtPlaca);
    }//GEN-LAST:event_txtPlacaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnBuscarTipoVehiculo;
    public javax.swing.JButton btnExcel1;
    public javax.swing.JButton btnListar;
    public javax.swing.JComboBox<String> cbxTipoVehiculo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableVehiculo;
    public javax.swing.JTextField txtPlaca;
    public javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
