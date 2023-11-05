/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.UsuarioDAO;
import Modelo.UsuarioModelo;
import Vista.LoginUser;
import Vista.PrincipalAdmin;
import Vista.PrincipalUsuario;
import Vista.UsuariosAdminVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danilore
 */
public class UsuarioController implements ActionListener {

    UsuarioDAO dao = new UsuarioDAO();
    UsuariosAdminVista vista = new UsuariosAdminVista();
    
    LoginUser loginVista = new LoginUser();
    UsuarioModelo modelo = new UsuarioModelo();
    DefaultTableModel clase = new DefaultTableModel();

    

    public UsuarioController(UsuariosAdminVista v) {
        this.vista = v;
        
        this.vista.btnGuardarUsu.addActionListener(this);
        this.vista.btnActualizarUsu.addActionListener(this);
        this.vista.btnNuevoUsu.addActionListener(this);
        this.vista.btnBajaUsu.addActionListener(this);
        this.vista.btnActivarUsu.addActionListener(this);
        
        //this.loginVista = lv;
        
        
        //this.loginVista.btnLoginUser.addActionListener(this);
        LimpiarTable();
        ListarUsuarios(vista.tableUsuario);
    }





    @Override
    public void actionPerformed(ActionEvent e) {

        //Si da clic el boton login
        /*if (e.getSource() == loginVista.btnLoginUser) {
            login();
        }*/

        if (e.getSource() == vista.btnGuardarUsu) {
            guardarUsuario();
        }
        if (e.getSource() == vista.btnActualizarUsu) {
            actualizarUsuario();
        }
        if (e.getSource() == vista.btnNuevoUsu) {
            nuevoUsuario();
        }
        if (e.getSource() == vista.btnActivarUsu) {
            activarUsuario();
        }
        if (e.getSource() == vista.btnBajaUsu) {
            bajaUsuario();
        }
        
    }

    /*public void login() {
        if (loginVista.txtContra.getText().equals("") || loginVista.txtUser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese su usuario y/o contraseña");
        } else {
            String username = loginVista.txtUser.getText();
            char[] passwordChars = loginVista.txtContra.getPassword();
            String password = new String(passwordChars);

            if(!"".equals(username) ||!"".equals(password) ){
            UsuarioModelo loginmodelo =new UsuarioModelo();
            UsuarioDAO dao = new UsuarioDAO();
            
            loginmodelo=dao.log(username, password);
            if(loginmodelo.getUsername()!=null && loginmodelo.getPassword()!=null){
                int rol = modelo.getId_rol();

                if (rol == 1) {
                    PrincipalAdmin principalAdmin = new PrincipalAdmin();
                    principalAdmin.show();
                    String nombrerol = "Administrador";
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso como " + modelo.getNombres_usuario()
                            + ", y tu rol es: " + nombrerol);
                    
                } else if (rol == 2) {

                    PrincipalUsuario principalUsuario = new PrincipalUsuario();
                    principalUsuario.show();
                    String nombrerol = "Usuario";
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso como " + modelo.getNombres_usuario()
                            + ", y tu rol es: " + nombrerol);
                }
                loginVista.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña es incorrecta");
            }
        }
            Arrays.fill(passwordChars, ' ');
        }
    }

    public UsuarioModelo getUsuario() {
        return modelo;
    }*/
    
    public void guardarUsuario() {
        if (camposValidos()) {
            modelo.setNombres_usuario(String.valueOf(vista.txtNombreUsuario.getText()));
            modelo.setUsername(vista.txtUsernameUsuario.getText());
            modelo.setPassword(vista.txtContraUsuario.getText());
            modelo.setId_rol(Integer.parseInt(vista.cbxRolUser.getSelectedItem().toString()));

            //Conexion, consulta con la base de datos
            if (dao.Registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
                LimpiarTable();
                ListarUsuarios(vista.tableUsuario);
                LimpiarUsuario();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Registrar Usuario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }
    }
    
    public void actualizarUsuario (){
        if ("".equals(vista.txtIdUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            if (camposValidos()) {
                modelo.setId_usuarios(Integer.parseInt(vista.txtIdUsuario.getText()));
                modelo.setNombres_usuario(String.valueOf(vista.txtNombreUsuario.getText()));
                modelo.setUsername(vista.txtUsernameUsuario.getText());
                modelo.setPassword(vista.txtContraUsuario.getText());
                modelo.setId_rol(Integer.parseInt(vista.cbxRolUser.getSelectedItem().toString()));

                //Conexion, consulta con la base de datos
                if (dao.ModificarUsuario(modelo)) {
                    JOptionPane.showMessageDialog(null, "Usuario Modificado");
                    LimpiarTable();
                    ListarUsuarios(vista.tableUsuario);
                    LimpiarUsuario();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar Usuario");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            }
        }
    }

    
    public void nuevoUsuario(){
        LimpiarUsuario();
        
    }
    
    public void activarUsuario(){
        if (!"".equals(vista.txtIdUsuario.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de Activar al Usuario");
            if (pregunta == 0) {
                modelo.setId_usuarios(Integer.parseInt(vista.txtIdUsuario.getText()));
                modelo.setId_estado(1);
                if (dao.BajaActivarUsuario(modelo)) {
                    
                    JOptionPane.showMessageDialog(null, "Se Activo al Usuario");
                    LimpiarTable();
                    ListarUsuarios(vista.tableUsuario);
                    LimpiarUsuario();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Activar Usuario");
                }
            }else{
                LimpiarUsuario();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }
    
    public void bajaUsuario(){
        if (!"".equals(vista.txtIdUsuario.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de baja al Usuario");
            if (pregunta == 0) {
                modelo.setId_usuarios(Integer.parseInt(vista.txtIdUsuario.getText()));
                modelo.setId_estado(0);
                if (dao.BajaActivarUsuario(modelo)) {
                    
                    JOptionPane.showMessageDialog(null, "Se dio de baja al Usuario");
                    LimpiarTable();
                    ListarUsuarios(vista.tableUsuario);
                    LimpiarUsuario();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Dar de Baja al Usuario");
                }
            }else{
                LimpiarUsuario();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }
    //Metodo para listar usuarios
    public void ListarUsuarios(JTable tabla) {
        clase = (DefaultTableModel) tabla.getModel();
        List<UsuarioModelo> lista = dao.ListarUsuario();
        Object[] ob = new Object[6];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_usuarios();
            ob[1] = lista.get(i).getNombres_usuario();
            ob[2] = lista.get(i).getUsername();
            ob[3] = lista.get(i).getPassword();

            //rol
            if (lista.get(i).getId_rol() == 1) {
                ob[4] = "Administrador";
            }
            if (lista.get(i).getId_estado() == 2) {
                ob[4] = "Vigilante de Garita";
            }

            //estado
            if (lista.get(i).getId_estado() == 1) {
                ob[5] = "Activo";
            }
            if (lista.get(i).getId_estado() == 0) {
                ob[5] = "Deshabilitado";
            }
            clase.addRow(ob);
        }
        vista.tableUsuario.setModel(clase);
    }

    public void LimpiarUsuario() {
        vista.txtIdUsuario.setText("");
        vista.txtContraUsuario.setText("");
        vista.txtNombreUsuario.setText("");
        vista.txtUsernameUsuario.setText("");
        vista.cbxRolUser.setSelectedItem(null);

    }

    public void LimpiarTable() {
        for (int i = 0; i < clase.getRowCount(); i++) {
            clase.removeRow(i);
            i = i - 1;
        }
    }

    public boolean camposValidos() {
        return !vista.txtContraUsuario.getText().isEmpty()
                && !vista.txtNombreUsuario.getText().isEmpty()
                && !vista.txtUsernameUsuario.getText().isEmpty()
                && vista.cbxRolUser.getSelectedItem() != null;
    }

}