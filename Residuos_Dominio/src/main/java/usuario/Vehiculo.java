/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Vehiculo {

    private ObjectId id;
    private String matricula;
    private String tipo;
    private Transportista transportista;
    private List<cargaVehiculo> cargasVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String tipo, Transportista transportista) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.transportista = transportista;
    }

    public Vehiculo(String matricula, String tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public Vehiculo(ObjectId id, String matricula, String tipo, Transportista transportista) {
        this.id = id;
        this.matricula = matricula;
        this.tipo = tipo;
        this.transportista = transportista;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public List<cargaVehiculo> getCargasVehiculo() {
        return cargasVehiculo;
    }

    public void setCargasVehiculo(List<cargaVehiculo> cargasVehiculo) {
        this.cargasVehiculo = cargasVehiculo;
    }

}
