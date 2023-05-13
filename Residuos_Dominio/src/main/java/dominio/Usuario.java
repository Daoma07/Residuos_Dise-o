/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Usuario {

    /**
     * Atributos de un usario autenticado
     */
    private ObjectId id;
    private String nombre;
    private String rfc;
    private Credencial credencial;

    public Usuario() {
    }

    public Usuario(String nombre, String rfc, Credencial credencial) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.credencial = credencial;

    }

    public Usuario(ObjectId id, String nombre, String rfc, Credencial credencial) {
        this.id = id;
        this.nombre = nombre;
        this.rfc = rfc;
        this.credencial = credencial;
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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
