/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Administrador;
import dominio.Residuo;
import interfaces.IResiduoDAO;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class ResiduoDAO implements IResiduoDAO {

    private final ConexionMongoDB CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Residuo> COLECCION;

    public ResiduoDAO(ConexionMongoDB CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("residuos", Residuo.class);
    }

    @Override
    public Residuo agregarResiduo(Residuo residuo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarResiduo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Residuo editarResiduo(Residuo residuo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Residuo> consultarQuimicos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
