/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;
import baseDatos.ConexionMongoDB;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import dominio.Flete;
import interfaces.IFleteDAO;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;
/**
 *
 * @author Jorge
 */
public class FleteDAO implements IFleteDAO{
    private final ConexionMongoDB CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection <Flete> COLECCION;

    public FleteDAO(ConexionMongoDB CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("fletes", Flete.class);
    }
    
    
    @Override
    public Flete agregarFlete(Flete flete) {
        try {
            this.COLECCION.insertOne(flete);
            return flete;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void eliminarFlete(ObjectId id) {
        try {
            this.COLECCION.deleteOne(new Document("_id", id));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public Flete editarFlete(Flete flete) {
        return null;
    }

    @Override
    public List<Flete> consultarFlete() {
        return null;
    }
    
}
