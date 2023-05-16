/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Quimico;
import fachada.FachadaNegocio;
import fachada.INegocio;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class datosMasivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        INegocio negocio = new FachadaNegocio();

        //Quimicos
        List<Quimico> quimicos = new ArrayList<>();

        quimicos.add(new Quimico("metano"));
        quimicos.add(new Quimico("etano"));
        quimicos.add(new Quimico("propano"));
        quimicos.add(new Quimico("cloroformo"));
        quimicos.add(new Quimico("tetracloruro de carbono"));
        quimicos.add(new Quimico("benceno"));
        quimicos.add(new Quimico("tolueno"));
        quimicos.add(new Quimico("xilenos"));
        quimicos.add(new Quimico("pesticidas"));
        quimicos.add(new Quimico("herbicidas"));
        quimicos.add(new Quimico("plomo"));
        quimicos.add(new Quimico("mercurio"));
        quimicos.add(new Quimico("cadmio"));
        quimicos.add(new Quimico("cromo hexavalente"));
        quimicos.add(new Quimico("arsénico"));
        quimicos.add(new Quimico("acetona"));
        quimicos.add(new Quimico("tricloroetileno"));
        quimicos.add(new Quimico("ácido sulfúrico"));
        quimicos.add(new Quimico("ácido clorhídrico"));
        quimicos.add(new Quimico("hidróxido de sodio"));
        quimicos.add(new Quimico("hidróxido de potasio"));
        quimicos.add(new Quimico("amoníaco"));
        quimicos.add(new Quimico("compuestos de nitrato y nitrito"));

        for (int i = 0; i < quimicos.size(); i++) {
            negocio.agregarQuimico(quimicos.get(i));
        }
    }

}
