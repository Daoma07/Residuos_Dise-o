/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import dominio.Quimico;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class QuimicoControlador {

    IDatos datos;

    public QuimicoControlador(IDatos datos) {
        this.datos = datos;
    }

    public Quimico agregarQuimico(Quimico quimico) {
        return datos.agregarQuimico(quimico);
    }
}
