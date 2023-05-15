/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Residuo {

    private ObjectId id;
    private int codigo;
    private String nombre;
    private List<Quimico> quimicos;
    private Tratamiento tratamiento;
    private Traslado traslado;
    private Productor productor;

    /**
     * Constructor sin argumentos.
     */
    public Residuo() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param codigo El código del residuo.
     * @param nombre El nombre del residuo.
     * @param quimicos La lista de químicos asociados al residuo.
     * @param tratamiento El tratamiento del residuo.
     * @param traslado El traslado del residuo.
     * @param productor El productor del residuo.
     */
    public Residuo(int codigo, String nombre, List<Quimico> quimicos, Tratamiento tratamiento, Traslado traslado, Productor productor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.quimicos = quimicos;
        this.tratamiento = tratamiento;
        this.traslado = traslado;
        this.productor = productor;
    }

    /**
     * Constructor con identificador.
     * @param id El identificador del residuo.
     * @param codigo El código del residuo.
     * @param nombre El nombre del residuo.
     * @param quimicos La lista de químicos asociados al residuo.
     * @param tratamiento El tratamiento del residuo.
     * @param traslado El traslado del residuo.
     * @param productor El productor del residuo.
     */
    public Residuo(ObjectId id, int codigo, String nombre, List<Quimico> quimicos, Tratamiento tratamiento, Traslado traslado, Productor productor) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.quimicos = quimicos;
        this.tratamiento = tratamiento;
        this.traslado = traslado;
        this.productor = productor;
    }

    /**
     * Obtiene el identificador del residuo.
     * @return El identificador del residuo.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del residuo.
     *
     * @param id El identificador del residuo.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el código del residuo.
     *
     * @return El código del residuo.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del residuo.
     *
     * @param codigo El código del residuo.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del residuo.
     *
     * @return El nombre del residuo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del residuo.
     *
     * @param nombre El nombre del residuo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la lista de químicos.
     *
     * @return La lista de químicos.
     */
    public List<Quimico> getQuimicos() {
        return quimicos;
    }

    /**
     * Establece la lista de químicos.
     *
     * @param quimicos La lista de químicos a establecer.
     */
    public void setQuimicos(List<Quimico> quimicos) {
        this.quimicos = quimicos;
    }

    /**
     * Devuelve el tratamiento.
     *
     * @return El tratamiento.
     */
    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    /**
     * Establece el tratamiento.
     *
     * @param tratamiento El tratamiento a establecer.
     */
    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    /**
     * Devuelve el traslado.
     *
     * @return El traslado.
     */
    public Traslado getTraslado() {
        return traslado;
    }

    /**
     * Establece el traslado.
     *
     * @param traslado El traslado a establecer.
     */
    public void setTraslado(Traslado traslado) {
        this.traslado = traslado;
    }

    /**
     * Devuelve el productor.
     *
     * @return El productor.
     */
    public Productor getProductor() {
        return productor;
    }

    /**
     * Establece el productor.
     *
     * @param productor El productor a establecer.
     */
    public void setProductor(Productor productor) {
        this.productor = productor;
    }

}
