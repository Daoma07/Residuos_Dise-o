/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import dominio.Flete;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class FleteControlador {

    IDatos datos;

    public FleteControlador(IDatos datos) {
        this.datos = datos;
    }

    public Flete agregarFlete(Flete flete) {
        return datos.agregarFlete(flete);
    }
}
