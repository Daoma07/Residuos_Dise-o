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
public class Residuo {

    private ObjectId id;
    private String nombre;
    private List<Quimico> quimicos;
    private Tratamiento tratamiento;
    private Traslado traslado;
    private Productor productor;

    public Residuo() {
    }

    public Residuo(String nombre, List<Quimico> quimicos, Tratamiento tratamiento, Traslado traslado, Productor productor) {
        this.nombre = nombre;
        this.quimicos = quimicos;
        this.tratamiento = tratamiento;
        this.traslado = traslado;
        this.productor = productor;
    }

    public Residuo(ObjectId id, String nombre, List<Quimico> quimicos, Tratamiento tratamiento, Traslado traslado, Productor productor) {
        this.id = id;
        this.nombre = nombre;
        this.quimicos = quimicos;
        this.tratamiento = tratamiento;
        this.traslado = traslado;
        this.productor = productor;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Quimico> getQuimicos() {
        return quimicos;
    }

    public void setQuimicos(List<Quimico> quimicos) {
        this.quimicos = quimicos;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Traslado getTraslado() {
        return traslado;
    }

    public void setTraslado(Traslado traslado) {
        this.traslado = traslado;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

}
