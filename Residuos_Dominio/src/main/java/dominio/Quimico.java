/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Quimico {

    private ObjectId id;
    private String nombre;

    public Quimico(String nombre) {
        this.nombre = nombre;
    }

    public Quimico(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

}
