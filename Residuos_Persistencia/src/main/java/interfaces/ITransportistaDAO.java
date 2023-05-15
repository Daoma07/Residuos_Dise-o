/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Transportista;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ITransportistaDAO {

    public Transportista agregarTransportista(Transportista transportista); 
    
    public void eliminarTransportista(int id); 
    
    public Transportista editarTransportista(Transportista transportista); 
    
    public List<Transportista> consultarQuimicos();
}
