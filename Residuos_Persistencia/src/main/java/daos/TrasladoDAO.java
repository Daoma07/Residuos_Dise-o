/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Administrador;
import dominio.Traslado;
import interfaces.ITrasladoDAO;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class TrasladoDAO implements ITrasladoDAO {

    private final ConexionMongoDB CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Traslado> COLECCION;

    public TrasladoDAO(ConexionMongoDB CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("traslados", Traslado.class);
    }

    @Override
    public Traslado agregarTraslado(Traslado traslado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarTraslado(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Traslado editarTraslado(Traslado traslado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Traslado> consultarQuimicos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
