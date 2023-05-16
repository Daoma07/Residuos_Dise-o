/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import dominio.Vehiculo;
import fachada.IDatos;

/**
 *
 * @author HP
 */
public class VehiculoControlador {

    IDatos datos;

    public VehiculoControlador(IDatos datos) {
        this.datos = datos;
    }

    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        return datos.agregarVehiculo(vehiculo);
    }
}
