/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import baseDatos.IConexionBD;
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

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Residuo> COLECCION;

    public ResiduoDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("residuos", Residuo.class);
    }

    @Override
    public Residuo agregarResiduo(Residuo residuo) {
        try {
            this.COLECCION.insertOne(residuo);
            return residuo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
