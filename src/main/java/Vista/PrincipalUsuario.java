/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;


import DAO.mysql.MySQLUsuarioDAO;
import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PrincipalUsuario extends javax.swing.JFrame {
    MySQLUsuarioDAO loginDAO = new MySQLUsuarioDAO();
    Usuario usuarioModelo= new Usuario();
    LoginUser loginUser = new LoginUser();

    
    public PrincipalUsuario() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
        lblNombre.setText(usuarioModelo.getNombres());
        
        
        if ("1".equals(String.valueOf(usuarioModelo.getCargo()))) {
            lblRol.setText("Administrador");
        }else if("2".equals(String.valueOf(usuarioModelo.getCargo()))){
            lblRol.setText("Vigilante");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_EntradaSalida = new javax.swing.JMenu();
        menuEntrada = new javax.swing.JMenuItem();
        menuSalida = new javax.swing.JMenuItem();
        menuConsultarRegistro = new javax.swing.JMenuItem();
        menuRegistrarIncidente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(getPreferredSize());

        jLabel1.setText("Principal de vigilante de garita");

        escritorio.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblRol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addGap(35, 35, 35)
                .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        menu_EntradaSalida.setText("Registro de Entradas y Salidas");

        menuEntrada.setText("Registrar Entrada de Vehículos");
        menuEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntradaActionPerformed(evt);
            }
        });
        menu_EntradaSalida.add(menuEntrada);

        menuSalida.setText("Registrar Salida de Vehículos");
        menu_EntradaSalida.add(menuSalida);

        menuConsultarRegistro.setText("Consultar Entrada o Salida");
        menuConsultarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarRegistroActionPerformed(evt);
            }
        });
        menu_EntradaSalida.add(menuConsultarRegistro);

        menuRegistrarIncidente.setText("Registrar Incidente");
        menuRegistrarIncidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarIncidenteActionPerformed(evt);
            }
        });
        menu_EntradaSalida.add(menuRegistrarIncidente);

        jMenuBar1.add(menu_EntradaSalida);

        jMenu2.setText("Pagos");

        jMenuItem1.setText("Registrar Pago");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Conductores");

        jMenuItem2.setText("Registrar Conductor");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Modificar Conductor");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Consultar Conductor");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Vehículos");

        jMenuItem5.setText("Registrar Vehículo");
        jMenu3.add(jMenuItem5);

        jMenuItem8.setText("Modificar Vehículo");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Consultar Vehículo");
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntradaActionPerformed
        RegistrarEntrada registrarEntrada = new RegistrarEntrada();
        escritorio.add(registrarEntrada);
        registrarEntrada.show();
    }//GEN-LAST:event_menuEntradaActionPerformed

    private void menuRegistrarIncidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarIncidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistrarIncidenteActionPerformed

    private void menuConsultarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarRegistroActionPerformed

    }//GEN-LAST:event_menuConsultarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JMenuItem menuConsultarRegistro;
    private javax.swing.JMenuItem menuEntrada;
    private javax.swing.JMenuItem menuRegistrarIncidente;
    private javax.swing.JMenuItem menuSalida;
    private javax.swing.JMenu menu_EntradaSalida;
    // End of variables declaration//GEN-END:variables
}
