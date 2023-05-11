/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class cargaVehiculo {

    private ObjectId id;
    private Float cantidadCarga;
    private Float kilometraje;
    private Flete flete;
    private Vehiculo vehiculo;

    public cargaVehiculo() {
    }

    public cargaVehiculo(Float cantidadCarga, Float kilometraje, Flete flete, Vehiculo vehiculo) {
        this.cantidadCarga = cantidadCarga;
        this.kilometraje = kilometraje;
        this.flete = flete;
        this.vehiculo = vehiculo;
    }

    public cargaVehiculo(ObjectId id, Float cantidadCarga, Float kilometraje, Flete flete, Vehiculo vehiculo) {
        this.id = id;
        this.cantidadCarga = cantidadCarga;
        this.kilometraje = kilometraje;
        this.flete = flete;
        this.vehiculo = vehiculo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Float getCantidadCarga() {
        return cantidadCarga;
    }

    public void setCantidadCarga(Float cantidadCarga) {
        this.cantidadCarga = cantidadCarga;
    }

    public Float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Flete getFlete() {
        return flete;
    }

    public void setFlete(Flete flete) {
        this.flete = flete;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
