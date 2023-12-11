/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Clases.Evento;
import Modelo.Empresas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class EmpresasAdminVista extends javax.swing.JInternalFrame {

    Evento event = new Evento();
    
    public EmpresasAdminVista() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRucEmpresa = new javax.swing.JTextField();
        txtRazonEmpresa = new javax.swing.JTextField();
        txtIdEmpresa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmpresa = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombreComercialEmpresa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        btnGuardarEmpre = new javax.swing.JButton();
        btnActualizarEmpre = new javax.swing.JButton();
        btnNuevoEmpre = new javax.swing.JButton();
        btnDarBajaEmpre = new javax.swing.JButton();
        btnActivarEmpre = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnExcel1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Empresas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("72", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EMPRESAS");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 280, 40));

        jLabel12.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel12.setText("RUC:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 60, 20));

        txtRucEmpresa.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtRucEmpresa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRucEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRucEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucEmpresaKeyTyped(evt);
            }
        });
        jPanel1.add(txtRucEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, 20));

        txtRazonEmpresa.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtRazonEmpresa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRazonEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRazonEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonEmpresaActionPerformed(evt);
            }
        });
        txtRazonEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonEmpresaKeyTyped(evt);
            }
        });
        jPanel1.add(txtRazonEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 290, 20));

        txtIdEmpresa.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtIdEmpresa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIdEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdEmpresa.setEnabled(false);
        jPanel1.add(txtIdEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 20, 20));

        tableEmpresa.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        tableEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUC", "Razon Social", "Nombre Comercial", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmpresaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableEmpresa);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 570, 500));

        jLabel7.setFont(new java.awt.Font("72", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("LISTADO DE EMPRESAS REGISTRADAS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 260, -1));

        jLabel8.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("REGISTRA UNA NUEVA EMPRESA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 30));

        jLabel14.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel14.setText("Razon Social:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 20));

        txtNombreComercialEmpresa.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtNombreComercialEmpresa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreComercialEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreComercialEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreComercialEmpresaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreComercialEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 260, 20));

        jLabel15.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel15.setText("Nombre Comercial:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, 20));

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        btnGuardarEmpre.setBackground(new java.awt.Color(51, 255, 51));
        btnGuardarEmpre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarEmpre.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEmpre.setText("Guardar");
        btnGuardarEmpre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnGuardarEmpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 20));

        btnActualizarEmpre.setBackground(new java.awt.Color(51, 255, 51));
        btnActualizarEmpre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizarEmpre.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarEmpre.setText("Actualizar");
        btnActualizarEmpre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnActualizarEmpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        btnNuevoEmpre.setBackground(new java.awt.Color(51, 255, 51));
        btnNuevoEmpre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoEmpre.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoEmpre.setText("Nuevo");
        btnNuevoEmpre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnNuevoEmpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        btnDarBajaEmpre.setBackground(new java.awt.Color(255, 51, 51));
        btnDarBajaEmpre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDarBajaEmpre.setForeground(new java.awt.Color(255, 255, 255));
        btnDarBajaEmpre.setText("Dar de baja");
        btnDarBajaEmpre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDarBajaEmpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        btnActivarEmpre.setBackground(new java.awt.Color(0, 153, 255));
        btnActivarEmpre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActivarEmpre.setForeground(new java.awt.Color(255, 255, 255));
        btnActivarEmpre.setText("Activar Empresa");
        btnActivarEmpre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnActivarEmpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("Reportes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 80, 30));

        btnExcel1.setBackground(new java.awt.Color(51, 255, 51));
        btnExcel1.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel1.setText("Excel");
        jPanel1.add(btnExcel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRucEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucEmpresaKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtRucEmpresaKeyTyped

    private void tableEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmpresaMouseClicked
        
    }//GEN-LAST:event_tableEmpresaMouseClicked

    private void txtRazonEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonEmpresaKeyTyped
        // TODO add your handling code here:
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtRazonEmpresaKeyTyped

    private void txtRazonEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonEmpresaActionPerformed

    }//GEN-LAST:event_txtRazonEmpresaActionPerformed

    private void txtNombreComercialEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreComercialEmpresaKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreComercialEmpresaKeyTyped
                                             

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

    }//GEN-LAST:event_btnListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActivarEmpre;
    public javax.swing.JButton btnActualizarEmpre;
    public javax.swing.JButton btnDarBajaEmpre;
    public javax.swing.JButton btnExcel1;
    public javax.swing.JButton btnGuardarEmpre;
    public javax.swing.JButton btnListar;
    public javax.swing.JButton btnNuevoEmpre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableEmpresa;
    public javax.swing.JTextField txtIdEmpresa;
    public javax.swing.JTextField txtNombreComercialEmpresa;
    public javax.swing.JTextField txtRazonEmpresa;
    public javax.swing.JTextField txtRucEmpresa;
    // End of variables declaration//GEN-END:variables
}
