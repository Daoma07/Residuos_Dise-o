/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class Destino {

    private String calle;
    private String numero;
    private String colonia;
    private Calendar fechaLlegada;

    public Destino() {
    }

    public Destino(String calle, String numero, String colonia, Calendar fechaLlegada) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.fechaLlegada = fechaLlegada;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Calendar getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Calendar fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

}
