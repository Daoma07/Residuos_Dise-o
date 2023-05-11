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
public class Tratamiento {

    private ObjectId id;
    private String detalle;
    private List<Residuo> residuos;

    public Tratamiento() {
    }

    public Tratamiento(String detalle, List<Residuo> residuos) {
        this.detalle = detalle;
        this.residuos = residuos;
    }

    public Tratamiento(String detalle) {
        this.detalle = detalle;
    }

    public Tratamiento(ObjectId id, String detalle, List<Residuo> residuos) {
        this.id = id;
        this.detalle = detalle;
        this.residuos = residuos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public List<Residuo> getResiduos() {
        return residuos;
    }

    public void setResiduos(List<Residuo> residuos) {
        this.residuos = residuos;
    }

}
