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
public class Flete {

    private ObjectId id;
    private Traslado traslado;
    private Transportista transportista;
    private int numeroVehiculos;
    private Float kilometrajeRecorridos;
    private Float costeTrabajo;
    private Float cantidadTransportada;
    private Destino destino;
    private List<cargaVehiculo> cargasVehiculo;

    public Flete() {
    }

    public Flete(Traslado traslado, Transportista transportista, Destino destino, List<cargaVehiculo> cargasVehiculo) {
        this.traslado = traslado;
        this.transportista = transportista;
        this.destino = destino;
        this.cargasVehiculo = cargasVehiculo;
    }

    public Flete(ObjectId id, Traslado traslado, Transportista transportista, int numeroVehiculos, Float kilometrajeRecorridos, Float costeTrabajo, Float cantidadTransportada, Destino destino, List<cargaVehiculo> cargasVehiculo) {
        this.id = id;
        this.traslado = traslado;
        this.transportista = transportista;
        this.numeroVehiculos = numeroVehiculos;
        this.kilometrajeRecorridos = kilometrajeRecorridos;
        this.costeTrabajo = costeTrabajo;
        this.cantidadTransportada = cantidadTransportada;
        this.destino = destino;
        this.cargasVehiculo = cargasVehiculo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Traslado getTraslado() {
        return traslado;
    }

    public void setTraslado(Traslado traslado) {
        this.traslado = traslado;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public void setNumeroVehiculos(int numeroVehiculos) {
        this.numeroVehiculos = numeroVehiculos;
    }

    public Float getKilometrajeRecorridos() {
        return kilometrajeRecorridos;
    }

    public void setKilometrajeRecorridos(Float kilometrajeRecorridos) {
        this.kilometrajeRecorridos = kilometrajeRecorridos;
    }

    public Float getCosteTrabajo() {
        return costeTrabajo;
    }

    public void setCosteTrabajo(Float costeTrabajo) {
        this.costeTrabajo = costeTrabajo;
    }

    public Float getCantidadTransportada() {
        return cantidadTransportada;
    }

    public void setCantidadTransportada(Float cantidadTransportada) {
        this.cantidadTransportada = cantidadTransportada;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public List<cargaVehiculo> getCargasVehiculo() {
        return cargasVehiculo;
    }

    public void setCargasVehiculo(List<cargaVehiculo> cargasVehiculo) {
        this.cargasVehiculo = cargasVehiculo;
    }

}
