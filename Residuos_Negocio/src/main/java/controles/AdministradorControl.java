/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import dominio.Administrador;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class AdministradorControl {

    IDatos datos;

    public AdministradorControl(IDatos datos) {
        this.datos = datos;
    }

    public Administrador agregarAdministrador(Administrador administrador) {
        return datos.agregarAdministrador(administrador);
    }

}
