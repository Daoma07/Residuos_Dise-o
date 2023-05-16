/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import dominio.Transportista;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class TransportistaControlador {

    IDatos datos;

    public TransportistaControlador(IDatos datos) {
        this.datos = datos;
    }

    public Transportista agregarTransportista(Transportista transportista) {
        return datos.agregarTransportista(transportista);
    }
}
