/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class Destino {

    private Direccion direccion;
    Calendar fechaLlegada;

    public Destino() {
    }

    public Destino(Direccion direccion, Calendar fechaLlegada) {
        this.direccion = direccion;
        this.fechaLlegada = fechaLlegada;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Calendar getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Calendar fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

}
