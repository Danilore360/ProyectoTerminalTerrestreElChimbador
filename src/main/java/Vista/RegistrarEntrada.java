/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.RegistrarEntradaControlador;
import Modelo.Conductor;
import Modelo.VehiculoModelo;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class RegistrarEntrada extends javax.swing.JInternalFrame {

    private RegistrarEntradaControlador registrarEntradaControlador;

    public RegistrarEntrada() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPlacaEntrada = new javax.swing.JTextField();
        btnRegistrarEntrada = new javax.swing.JButton();
        btnCancelarRegistrarEntrada = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFechaEntrada = new javax.swing.JFormattedTextField();
        btnConsultarRegistrarEntrada = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDNIEntrada = new javax.swing.JTextField();
        lbl_NombreConductorEntrada = new javax.swing.JLabel();
        lblTipoVehiculoEntrada = new javax.swing.JLabel();
        lblNombreEmpleadoEntrada = new javax.swing.JLabel();
        lblRutaEntrada = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Registrar Entrada");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ruta");

        btnRegistrarEntrada.setBackground(new java.awt.Color(0, 153, 102));
        btnRegistrarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEntrada.setText("Registrar");

        btnCancelarRegistrarEntrada.setBackground(new java.awt.Color(204, 0, 51));
        btnCancelarRegistrarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarRegistrarEntrada.setText("Cancelar");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Placa");

        btnConsultarRegistrarEntrada.setBackground(new java.awt.Color(0, 153, 153));
        btnConsultarRegistrarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarRegistrarEntrada.setText("Consultar");
        btnConsultarRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarRegistrarEntradaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Conductor");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tipo de Vehículo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Personal de Garita");

        lbl_NombreConductorEntrada.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl_NombreConductorEntrada.setText("Nombre");

        lblTipoVehiculoEntrada.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lblTipoVehiculoEntrada.setText("Tipo de Vehiculo");

        lblNombreEmpleadoEntrada.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lblNombreEmpleadoEntrada.setText("Nombre del Personal de Garita");

        lblRutaEntrada.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lblRutaEntrada.setText("Ruta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnRegistrarEntrada)
                        .addGap(90, 90, 90)
                        .addComponent(btnCancelarRegistrarEntrada)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnConsultarRegistrarEntrada))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTipoVehiculoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblRutaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_NombreConductorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(195, 195, 195))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                                .addComponent(txtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel2))
                                                .addGap(55, 55, 55)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtPlacaEntrada)
                                                    .addComponent(txtDNIEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(36, 36, 36)
                                        .addComponent(lblNombreEmpleadoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDNIEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPlacaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarRegistrarEntrada)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_NombreConductorEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblNombreEmpleadoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoVehiculoEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(lblRutaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarEntrada)
                    .addComponent(btnCancelarRegistrarEntrada))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setControlador(RegistrarEntradaControlador controlador) {
        this.registrarEntradaControlador = controlador;
    }

    public void actualizarVehiculo(VehiculoModelo vehiculo) {
        lblTipoVehiculoEntrada.setText(String.valueOf(vehiculo.getId_tipo_vehiculo()));
        lblRutaEntrada.setText(vehiculo.getRuta_destino());
    }

    public void actualizarConductor(Conductor conductor) {
        lbl_NombreConductorEntrada.setText(conductor.getNombre());
    }

    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void btnConsultarRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarRegistrarEntradaActionPerformed
        if (txtDNIEntrada.getText().equals("") || txtPlacaEntrada.getText().equals("")) {
            if (txtDNIEntrada.getText().equals("") && txtPlacaEntrada.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese el DNI del conductor y la placa del vehículo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (txtDNIEntrada.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese el DNI del conductor", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (txtPlacaEntrada.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese la placa del vehículo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            String dniConductor = txtDNIEntrada.getText();
            String placaVehiculo = txtPlacaEntrada.getText();

            // Consultar el vehículo y el conductor
            registrarEntradaControlador.consultarVehiculo(placaVehiculo);
            registrarEntradaControlador.consultarConductor(dniConductor);
            
        }


    }//GEN-LAST:event_btnConsultarRegistrarEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarRegistrarEntrada;
    private javax.swing.JButton btnConsultarRegistrarEntrada;
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreEmpleadoEntrada;
    public javax.swing.JLabel lblRutaEntrada;
    public javax.swing.JLabel lblTipoVehiculoEntrada;
    private javax.swing.JLabel lbl_NombreConductorEntrada;
    public javax.swing.JTextField txtDNIEntrada;
    private javax.swing.JFormattedTextField txtFechaEntrada;
    public javax.swing.JTextField txtPlacaEntrada;
    // End of variables declaration//GEN-END:variables
}