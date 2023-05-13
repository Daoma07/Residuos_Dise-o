/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Transportista extends Usuario {

    private List<Flete> fletes;
    private List<Vehiculo> vehiculos;

    public Transportista() {
    }

    public Transportista(String nombre, String rfc, Credencial credencial) {
        super(nombre, rfc, credencial);
    }

    public Transportista(ObjectId id, String nombre, String rfc, Credencial credencial) {
        super(id, nombre, rfc, credencial);
    }

    public List<Flete> getFletes() {
        return fletes;
    }

    public void setFletes(List<Flete> fletes) {
        this.fletes = fletes;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
