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
public class ConductorVista extends javax.swing.JInternalFrame {

    Evento event = new Evento();
    public ConductorVista() {
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
        txtPrimerNombreConductor = new javax.swing.JTextField();
        txtIdConductor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableConductor = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnDarBaja = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        txtApellidoPaternoConductor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtSegundoNombreConductor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtApellidoMaternoConductor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTelefonoConductor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccionConductor = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        cbxTipoDocumentoIdentidad = new javax.swing.JComboBox<>();
        txtEmpresa = new javax.swing.JTextField();
        txtRucEmpresa = new javax.swing.JTextField();
        btnObtener = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listado de Conductores");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("72", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CONDUCTOR");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 280, 40));

        jLabel12.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel12.setText("Tipo de Documento de Identidad:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 20));

        txtPrimerNombreConductor.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtPrimerNombreConductor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrimerNombreConductor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPrimerNombreConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerNombreConductorKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrimerNombreConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, 20));

        txtIdConductor.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtIdConductor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIdConductor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtIdConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 20, 20));

        tableConductor.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        tableConductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Primer Nombre", "Segundo Nombre", "Apellido Paterno", "Apellido Materno", "Tipo de Documento", "# Documento", "Telefono", "Dirección", "Empresa", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableConductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConductorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableConductor);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 840, 500));

        jLabel7.setFont(new java.awt.Font("72", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("LISTADO DE CONDUCTORES REGISTRADOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 260, -1));

        jLabel8.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("REGISTRA UN NUEVO CONDUCTOR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 30));

        btnGuardar.setBackground(new java.awt.Color(51, 255, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 255, 51));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(51, 255, 51));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, -1));

        btnDarBaja.setBackground(new java.awt.Color(255, 51, 51));
        btnDarBaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDarBaja.setForeground(new java.awt.Color(255, 255, 255));
        btnDarBaja.setText("Dar de Baja");
        jPanel1.add(btnDarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, -1, -1));

        btnActivar.setBackground(new java.awt.Color(0, 153, 255));
        btnActivar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActivar.setForeground(new java.awt.Color(255, 255, 255));
        btnActivar.setText("Activar Conductor");
        jPanel1.add(btnActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, -1, -1));

        txtApellidoPaternoConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoConductorKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoPaternoConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 200, -1));

        jLabel13.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel13.setText("Primer Nombre:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 20));

        jLabel14.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel14.setText("Segundo Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 20));

        jLabel15.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel15.setText("Apellido Paterno:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 20));

        txtSegundoNombreConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoNombreConductorKeyTyped(evt);
            }
        });
        jPanel1.add(txtSegundoNombreConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 200, -1));

        jLabel16.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel16.setText("Ruc de Empresa:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 100, 20));

        jLabel17.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel17.setText("Apellido Materno:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, 20));

        txtApellidoMaternoConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoConductorKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoMaternoConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 200, -1));

        jLabel18.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel18.setText("Numero de Documento:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 20));

        txtNumeroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 180, -1));

        jLabel19.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel19.setText("Telefono:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 60, 20));

        txtTelefonoConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoConductorKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefonoConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 140, -1));

        txtDireccionConductor.setColumns(20);
        txtDireccionConductor.setRows(5);
        jScrollPane1.setViewportView(txtDireccionConductor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 270, 60));

        jLabel20.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        jLabel20.setText("Dirección:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 60, 20));

        cbxTipoDocumentoIdentidad.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        cbxTipoDocumentoIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoDocumentoIdentidadActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoDocumentoIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 320, -1));
        jPanel1.add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 330, -1));

        txtRucEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucEmpresaKeyTyped(evt);
            }
        });
        jPanel1.add(txtRucEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 130, -1));

        btnObtener.setBackground(new java.awt.Color(51, 255, 51));
        btnObtener.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnObtener.setForeground(new java.awt.Color(255, 255, 255));
        btnObtener.setText("Obtener");
        jPanel1.add(btnObtener, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimerNombreConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerNombreConductorKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtPrimerNombreConductorKeyTyped

    private void tableConductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableConductorMouseClicked
        
    }//GEN-LAST:event_tableConductorMouseClicked

    private void cbxTipoDocumentoIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoDocumentoIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoDocumentoIdentidadActionPerformed

    private void txtSegundoNombreConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoNombreConductorKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtSegundoNombreConductorKeyTyped

    private void txtApellidoPaternoConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoConductorKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtApellidoPaternoConductorKeyTyped

    private void txtApellidoMaternoConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoConductorKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtApellidoMaternoConductorKeyTyped

    private void txtNumeroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDocumentoKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtNumeroDocumentoKeyTyped

    private void txtTelefonoConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoConductorKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtTelefonoConductorKeyTyped

    private void txtRucEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucEmpresaKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtRucEmpresaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActivar;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnDarBaja;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnObtener;
    public javax.swing.JComboBox<String> cbxTipoDocumentoIdentidad;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableConductor;
    public javax.swing.JTextField txtApellidoMaternoConductor;
    public javax.swing.JTextField txtApellidoPaternoConductor;
    public javax.swing.JTextArea txtDireccionConductor;
    public javax.swing.JTextField txtEmpresa;
    public javax.swing.JTextField txtIdConductor;
    public javax.swing.JTextField txtNumeroDocumento;
    public javax.swing.JTextField txtPrimerNombreConductor;
    public javax.swing.JTextField txtRucEmpresa;
    public javax.swing.JTextField txtSegundoNombreConductor;
    public javax.swing.JTextField txtTelefonoConductor;
    // End of variables declaration//GEN-END:variables
}
