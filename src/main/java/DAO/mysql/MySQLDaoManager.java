/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.mysql;

import DAO.CargoDAO;
import DAO.ConductorDAO;
import DAO.DAOManager;
import DAO.DepartamentoDAO;
import DAO.DistritoDAO;
import DAO.EmpresasDAO;
import DAO.EstadoConductorDAO;
import DAO.EstadoEmpresaDAO;
import DAO.EstadoUsuarioDAO;
import DAO.EstadoVehiculoDAO;
import DAO.MetodoPagoDAO;
import DAO.PagoCocheraDAO;
import DAO.PagoDAO;
import DAO.PagoEscalaDAO;
import DAO.PagoNormalDAO;
import DAO.ProvinciaDAO;
import DAO.TipoDocumentoIdentidadDAO;
import DAO.TipoVehiculoPagoDAO;
import DAO.UsuarioDAO;
import DAO.VehiculoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import DAO.RegistroEntradaConPagaDAO;
import DAO.RegistroEntradaDAO;

/**
 *
 * @author Danilore
 */
public class MySQLDaoManager implements DAOManager {

    private Connection conn;
    private CargoDAO cargo = null;
    private ConductorDAO conductor = null;
    private EmpresasDAO empresas = null;
    private EstadoConductorDAO estadoConductor = null;
    private EstadoEmpresaDAO estadoEmpresa = null;
    private EstadoUsuarioDAO estadoUsuario = null;
    private EstadoVehiculoDAO estadoVehiculo = null;
    private MetodoPagoDAO metodoPago = null;
    private PagoCocheraDAO pagoCochera = null;
    private PagoEscalaDAO pagoEscala = null;
    private PagoNormalDAO pagoNormal = null;
    private TipoDocumentoIdentidadDAO tipoDocumentoIdentidad = null;
    private TipoVehiculoPagoDAO tipoVehiculoPago = null;
    private UsuarioDAO usuario = null;
    private VehiculoDAO vehiculo = null;

    private DepartamentoDAO departamento = null;
    private ProvinciaDAO provincia = null;
    private DistritoDAO distrito = null;

    private RegistroEntradaConPagaDAO registroEntradaConPaga = null;
    private RegistroEntradaDAO registroEntrada = null;

    private PagoDAO pago = null;

    public MySQLDaoManager() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String myBD = "jdbc:mysql://localhost:3307/terminalterrestrechimbote?serverTimezone=UTC";
            String user = "Danilore";
            String password = "Danilorexd123@";
            conn = DriverManager.getConnection(myBD, user, password);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    @Override
    public CargoDAO getCargoDAO() {
        if (cargo == null) {
            cargo = new MySQLCargoDAO(conn);
        }
        return cargo;
    }

    @Override
    public ConductorDAO getConductorDAO() {
        if (conductor == null) {
            conductor = new MySQLConductorDAO(conn);
        }
        return conductor;
    }

    @Override
    public EmpresasDAO getEmpresasDAO() {
        if (empresas == null) {
            empresas = new MySQLEmpresasDAO(conn);
        }
        return empresas;
    }

    @Override
    public EstadoConductorDAO getEstadoConductorDAO() {
        if (estadoConductor == null) {
            estadoConductor = new MySQLEstadoConductorDAO(conn);
        }
        return estadoConductor;
    }

    @Override
    public EstadoEmpresaDAO getEstadoEmpresaDAO() {
        if (estadoEmpresa == null) {
            estadoEmpresa = new MySQLEstadoEmpresaDAO(conn);
        }
        return estadoEmpresa;
    }

    @Override
    public EstadoUsuarioDAO getEstadoUsuarioDAO() {
        if (estadoUsuario == null) {
            estadoUsuario = new MySQLEstadoUsuarioDAO(conn);
        }
        return estadoUsuario;
    }

    @Override
    public EstadoVehiculoDAO getEstadoVehiculoDAO() {
        if (estadoVehiculo == null) {
            estadoVehiculo = new MySQLEstadoVehiculoDAO(conn);
        }
        return estadoVehiculo;
    }

    @Override
    public MetodoPagoDAO getMetodoPagoDAO() {
        if (metodoPago == null) {
            metodoPago = new MySQLMetodoPagoDAO(conn);
        }
        return metodoPago;
    }

    @Override
    public PagoCocheraDAO getPagoCocheraDAO() {
        if (pagoCochera == null) {
            pagoCochera = new MySQLPagoCocheraDAO(conn);
        }
        return pagoCochera;
    }

    @Override
    public PagoEscalaDAO getPagoEscalaDAO() {
        if (pagoEscala == null) {
            pagoEscala = new MySQLPagoEscalaDAO(conn);
        }
        return pagoEscala;
    }

    @Override
    public PagoNormalDAO getPagoNormalDAO() {
        if (pagoNormal == null) {
            pagoNormal = new MySQLPagoNormalDAO(conn);
        }
        return pagoNormal;
    }

    @Override
    public TipoDocumentoIdentidadDAO getTipoDocumentoIdentidadDAO() {
        if (tipoDocumentoIdentidad == null) {
            tipoDocumentoIdentidad = new MySQLTipoDocumentoIdentidadDAO(conn);
        }
        return tipoDocumentoIdentidad;
    }

    @Override
    public TipoVehiculoPagoDAO getTipoVehiculoPagoDAO() {
        if (tipoVehiculoPago == null) {
            tipoVehiculoPago = new MySQLTipoVehiculoPagoDAO(conn);
        }
        return tipoVehiculoPago;
    }

    @Override
    public UsuarioDAO getUsuarioDAO() {
        if (usuario == null) {
            usuario = new MySQLUsuarioDAO(conn);
        }
        return usuario;
    }

    @Override
    public VehiculoDAO getVehiculoDAO() {
        if (vehiculo == null) {
            vehiculo = new MySQLVehiculoDAO(conn);
        }
        return vehiculo;
    }

    @Override
    public DepartamentoDAO getDepartamentoDAO() {
        if (departamento == null) {
            departamento = new MySQLDepartamentoDAO(conn);
        }
        return departamento;
    }

    @Override
    public ProvinciaDAO getProvinciaDAO() {
        if (provincia == null) {
            provincia = new MySQLProvinciaDAO(conn);
        }
        return provincia;
    }

    @Override
    public DistritoDAO getDistritoDAO() {
        if (distrito == null) {
            distrito = new MySQLDistritoDAO(conn);
        }
        return distrito;
    }

    @Override
    public PagoDAO getPagoDAO() {
        if (pago == null) {
            pago = new MySQLPagoDAO(conn);
        }
        return pago;
    }

    @Override
    public RegistroEntradaDAO getRegistroEntradaDAO() {
        if (registroEntrada == null) {
            registroEntrada = new MySQLRegistroEntradaDAO(conn);
        }
        return registroEntrada;
    }

    @Override
    public RegistroEntradaConPagaDAO getRegistroEntradaConPagaDAO() {
        if (registroEntradaConPaga == null) {
            registroEntradaConPaga = new MySQLRegistroEntradaConPagaDAO(conn);
        }
        return registroEntradaConPaga;
    }

}
