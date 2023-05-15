/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import daos.AdministradorDAO;
import daos.FleteDAO;
import daos.ProductorDAO;
import daos.QuimicoDAO;
import daos.ResiduoDAO;
import daos.TransportistaDAO;
import daos.TrasladoDAO;
import daos.VehiculoDAO;
import baseDatos.IConexionBD;
import baseDatos.ConexionMongoDB;

/**
 *
 * @author HP
 */
public class FabricaDAO implements IFabricaDAO {

    private IConexionBD conexionDB;
    private ConexionMongoDB conexion;

    public FabricaDAO(IConexionBD conexionDB) {
        this.conexionDB = new ConexionMongoDB();
        this.conexion = (ConexionMongoDB) conexionDB.getBaseDatos();
    }

    @Override
    public AdministradorDAO crearAdministradorDAO() {
        return new AdministradorDAO(conexion);
    }

    @Override
    public FleteDAO crearFleteDAO() {
        return new FleteDAO(conexion);
    }

    @Override
    public ProductorDAO crearProductorDAO() {
        return new ProductorDAO(conexion);
    }

    @Override
    public QuimicoDAO crearQuimicoDAO() {
        return new QuimicoDAO(conexion);
    }

    @Override
    public ResiduoDAO crearResiduoDAO() {
        return new ResiduoDAO(conexion);
    }

    @Override
    public TransportistaDAO crearTransportistaDAO() {
        return new TransportistaDAO(conexion);
    }

    @Override
    public TrasladoDAO crearTrasladoDAO() {
        return new TrasladoDAO(conexion);
    }

    @Override
    public VehiculoDAO crearVehiculoDAO() {
        return new VehiculoDAO(conexion);
    }

}
