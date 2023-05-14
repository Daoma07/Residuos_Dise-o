/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Residuo;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IResiduoDAO {

    public Residuo agregarResiduo(Residuo residuo);
    
    public void eliminarResiduo(int id);
    
    public Residuo editarResiduo(Residuo residuo);
    
    public List<Residuo> consultarQuimicos();
}
