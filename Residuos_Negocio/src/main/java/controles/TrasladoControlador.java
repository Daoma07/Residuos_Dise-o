/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import dominio.Traslado;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class TrasladoControlador {

    IDatos datos;

    public TrasladoControlador(IDatos datos) {
        this.datos = datos;
    }

    public Traslado agregarTraslado(Traslado traslado) {
        return datos.agregarTraslado(traslado);
    }
}
