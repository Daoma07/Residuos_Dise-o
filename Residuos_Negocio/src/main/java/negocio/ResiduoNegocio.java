/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Residuo;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class ResiduoNegocio {

    IDatos datos;

    public ResiduoNegocio(IDatos datos) {
        this.datos = datos;
    }

    public Residuo agregarResiduo(Residuo residuo) {
        return datos.agregarResiduo(residuo);
    }
}
