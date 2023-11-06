/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Danilore
 */
public class CargoVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargoVista
     */
    public CargoVista() {
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
        txtDescripcion = new javax.swing.JTextField();
        txtIdRolesUsuario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRolesUsuario = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listado de Cargos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("72", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ROLES DE USUARIOS");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 420, 40));

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

        txtIdRolesUsuario.setFont(new java.awt.Font("72", 0, 13)); // NOI18N
        txtIdRolesUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIdRolesUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdRolesUsuario.setEnabled(false);
        jPanel1.add(txtIdRolesUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 20, 20));

        tableRolesUsuario.setFont(new java.awt.Font("72", 0, 12)); // NOI18N
        tableRolesUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        tableRolesUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRolesUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableRolesUsuario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 340, 280));

        jLabel7.setFont(new java.awt.Font("72", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("LISTADO DE TIPOS DE ROLES DE USUARIO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 260, -1));

        jLabel8.setFont(new java.awt.Font("72", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("REGISTRA UN NUEVO ROL DE USUARIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 30));

        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        btnNuevo.setText("Nuevo");
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void tableRolesUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRolesUsuarioMouseClicked
        int fila = tableRolesUsuario.rowAtPoint(evt.getPoint());

        txtIdRolesUsuario.setText(tableRolesUsuario.getValueAt(fila, 0).toString());
        txtDescripcion.setText(tableRolesUsuario.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tableRolesUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableRolesUsuario;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtIdRolesUsuario;
    // End of variables declaration//GEN-END:variables
}
