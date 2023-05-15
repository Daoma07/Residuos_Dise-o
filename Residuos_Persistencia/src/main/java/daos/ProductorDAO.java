/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Productor;
import interfaces.IProductorDAO;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class ProductorDAO implements IProductorDAO {

    private final ConexionMongoDB CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Productor> COLECCION;

    public ProductorDAO(ConexionMongoDB CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("productores", Productor.class);
    }

    @Override
    public Productor agregarProductor(Productor administrador) {
        try {
            this.COLECCION.insertOne(administrador);
            return administrador;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void eliminarProductor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Productor editarProductor(Productor administrador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Productor> consultarProductor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
