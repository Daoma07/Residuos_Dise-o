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
public class Productor extends Usuario {

    public Productor() {
    }

    public Productor(String nombre, String rfc, Credencial credencial, Direccion direccion) {
        super(nombre, rfc, credencial, direccion);
    }

    public Productor(String nombre, String rfc, Credencial credencial) {
        super(nombre, rfc, credencial);
    }

    public Productor(ObjectId id, String nombre, String rfc, Credencial credencial, Direccion direccion) {
        super(id, nombre, rfc, credencial, direccion);
    }

}
