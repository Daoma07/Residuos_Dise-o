/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import formularios.FrmPrincipal;
import formularios.FrmProductor;
import formularios.FrmRegistrarResiduos;
import formularios.FrmRegistroTraslados;
import formularios.FrmSolicitudes;
import formularios.FrmSolicitudesTraslados;
import formularios.FrmVehiculos;
import formularios.Login;

/**
 *
 * @author HP
 */
public abstract class IFabricaFormularios {

    public abstract FrmPrincipal crearFormularioPrincipal();

    public abstract FrmProductor crearFormularioProductor();

    public abstract FrmRegistrarResiduos crearFormularioRegistrarResiduos();

    public abstract FrmRegistroTraslados crearFormularioRegistroTraslados();

    public abstract FrmSolicitudes crearFormularioSolicitudes();

    public abstract FrmSolicitudesTraslados crearFormularioSolicitudesTraslados();

    public abstract FrmVehiculos crearFormularioVehiculos();

    public abstract Login crearLogin();

}
