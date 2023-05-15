/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Calendar;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Traslado {

    private ObjectId id;
    private float cantidad;
    private boolean envioParcial;
    private Residuo residuo;
    private List<Flete> fletes;
    private Calendar fechaSolicitada;

    public Traslado(float cantidad, boolean envioParcial, Residuo residuo, List<Flete> fletes, Calendar fechaSolicitada) {
        this.cantidad = cantidad;
        this.envioParcial = envioParcial;
        this.residuo = residuo;
        this.fletes = fletes;
        this.fechaSolicitada = fechaSolicitada;
    }
    
    public Traslado() {
    }

    public Traslado(float cantidad, boolean envioParcial, Residuo residuo) {
        this.cantidad = cantidad;
        this.envioParcial = envioParcial;
        this.residuo = residuo;
    }

    public Traslado(float cantidad, boolean envioParcial) {
        this.cantidad = cantidad;
        this.envioParcial = envioParcial;
    }

    public Traslado(ObjectId id, float cantidad, boolean envioParcial, Residuo residuo) {
        this.id = id;
        this.cantidad = cantidad;
        this.envioParcial = envioParcial;
        this.residuo = residuo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEnvioParcial() {
        return envioParcial;
    }

    public void setEnvioParcial(boolean envioParcial) {
        this.envioParcial = envioParcial;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public List<Flete> getFletes() {
        return fletes;
    }

    public void setFletes(List<Flete> fletes) {
        this.fletes = fletes;
    }

    public Calendar getFechaSolicitada() {
        return fechaSolicitada;
    }

    public void setFechaSolicitada(Calendar fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }
    
    

}
