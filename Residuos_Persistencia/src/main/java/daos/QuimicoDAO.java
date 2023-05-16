/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import baseDatos.ConexionMongoDB;
import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Quimico;
import interfaces.IQuimicoDAO;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class QuimicoDAO implements IQuimicoDAO {

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Quimico> COLECCION;

    public QuimicoDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("quimicos", Quimico.class);
    }

    @Override
    public Quimico agregarQuimico(Quimico quimico) {
        try {
            this.COLECCION.insertOne(quimico);
            return quimico;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
