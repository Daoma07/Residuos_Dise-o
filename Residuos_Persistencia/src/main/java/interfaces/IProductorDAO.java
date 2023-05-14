/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Productor;
import dominio.Quimico;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IProductorDAO {

    public Productor agregarProductor(Productor administrador);
    
    public void eliminarProductor(int id);
    
    public Productor editarProductor(Productor administrador);
    
    public List<Productor> consultarProductor();
}
