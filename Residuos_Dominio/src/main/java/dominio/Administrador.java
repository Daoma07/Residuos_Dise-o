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
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String nombre, String rfc, Credencial credencial) {
        super(nombre, rfc, credencial);
    }

    public Administrador(ObjectId id, String nombre, String rfc, Credencial credencial) {
        super(id, nombre, rfc, credencial);
    }

}
