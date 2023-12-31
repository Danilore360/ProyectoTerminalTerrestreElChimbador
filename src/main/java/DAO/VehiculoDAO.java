/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Modelo.Vehiculo;
import java.util.List;

/**
 *
 * @author Danilore
 */
public interface VehiculoDAO extends CrudDAO<Vehiculo,Integer>{
    public Vehiculo getByPlacaVehiculo(String placa) throws DAOException;
    public List<Vehiculo> getByTipoVehiculo(int id) throws DAOException;
}
