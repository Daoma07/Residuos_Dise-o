/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import daos.AdministradorDAO;
import daos.ProductorDAO;
import dominio.Administrador;
import dominio.Credencial;
import dominio.Productor;
import factory.FabricaDAO;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaDAO fabrica = new FabricaDAO();

//        ProductorDAO productor = fabrica.crearProductorDAO();
//
//        Credencial credencial = new Credencial("daniell", "1234");
//        Productor productorNuevo = new Productor("DAniel", "asdd", credencial);
//
//        productor.agregarProductor(productorNuevo);

        AdministradorDAO administrador = fabrica.crearAdministradorDAO();

        Credencial credencial2 = new Credencial("danielas", "12341");
        Administrador administradorNuevo = new Administrador("DAniel", "asdasd", credencial2);

        administrador.agregarAdministrador(administradorNuevo);
    }

}
