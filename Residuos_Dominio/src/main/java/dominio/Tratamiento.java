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
public class Tratamiento {

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
        this.detalle = detalle;
        this.residuos = residuos;
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
