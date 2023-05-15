/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Flete;
import dominio.Transportista;
import interfaces.ITransportistaDAO;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class TransportistaDAO implements ITransportistaDAO {

    private final ConexionMongoDB CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Transportista> COLECCION;

    public TransportistaDAO(ConexionMongoDB CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("transportistas", Transportista.class);
    }

    @Override
    public Transportista agregarTransportista(Transportista transportista) {
        try {
            this.COLECCION.insertOne(transportista);
            return transportista;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void eliminarTransportista(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Transportista editarTransportista(Transportista transportista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Transportista> consultarQuimicos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
