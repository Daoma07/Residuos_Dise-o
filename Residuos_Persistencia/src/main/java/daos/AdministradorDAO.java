/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import baseDatos.ConexionMongoDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Administrador;
import interfaces.IAdministradorDAO;
import java.util.List;

/**
 *
 * @author HP
 */
public class AdministradorDAO implements IAdministradorDAO {

    private final ConexionMongoDB CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Administrador> COLECCION;

    public AdministradorDAO(ConexionMongoDB CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("administradores", Administrador.class);
    }

    @Override
    public Administrador agregarAdministrador(Administrador administrador) {
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
    public void eliminarAdministrador(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Administrador editarAdministrador(Administrador administrador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Administrador> consultarQuimicos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
