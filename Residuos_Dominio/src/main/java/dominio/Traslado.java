/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Calendar;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Traslado {

    private ObjectId id;

    private boolean envioParcial;
    private List<Residuo> residuo;
    private List<Flete> fletes;
    private Calendar fechaSolicitada;
    private Tratamiento tratamiento;

    /**
     * Crea una instancia de la clase Traslado sin argumentos.
     */
    public Traslado() {
    }

    /**
     * Crea una instancia de la clase Traslado con los argumentos
     * proporcionados.
     *
     * @param envioParcial Indica si el envío es parcial o no.
     * @param residuo La lista de residuos a trasladar.
     * @param fletes La lista de fletes asociados al traslado.
     * @param fechaSolicitada La fecha solicitada para el traslado.
     */
    public Traslado(boolean envioParcial, List<Residuo> residuo,
            List<Flete> fletes, Calendar fechaSolicitada, Tratamiento tratamiento) {
        this.envioParcial = envioParcial;
        this.residuo = residuo;
        this.fletes = fletes;
        this.fechaSolicitada = fechaSolicitada;
        this.tratamiento = tratamiento;
    }

    /**
     * Crea una instancia de la clase Traslado con los argumentos
     * proporcionados.
     *
     * @param id El identificador del traslado.
     * @param envioParcial Indica si el envío es parcial o no.
     * @param residuo La lista de residuos a trasladar.
     * @param fletes La lista de fletes asociados al traslado.
     * @param fechaSolicitada La fecha solicitada para el traslado.
     */
    public Traslado(ObjectId id, boolean envioParcial,
            List<Residuo> residuo, List<Flete> fletes, Calendar fechaSolicitada,
            Tratamiento tratamiento) {
        this.id = id;
        this.envioParcial = envioParcial;
        this.residuo = residuo;
        this.fletes = fletes;
        this.fechaSolicitada = fechaSolicitada;
        this.tratamiento = tratamiento;
    }

    /**
     * Obtiene el identificador del traslado.
     *
     * @return El identificador del traslado.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del traslado.
     *
     * @param id El identificador del traslado.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Verifica si el traslado es parcial o no.
     *
     * @return true si el traslado es parcial, false en caso contrario.
     */
    public boolean isEnvioParcial() {
        return envioParcial;
    }

    /**
     * Establece si el traslado es parcial o no.
     *
     * @param envioParcial true si el traslado es parcial, false en caso
     * contrario.
     */
    public void setEnvioParcial(boolean envioParcial) {
        this.envioParcial = envioParcial;
    }

    /**
     * Obtiene la lista de residuos a trasladar.
     *
     * @return La lista de residuos a trasladar.
     */
    public List<Residuo> getResiduo() {
        return residuo;
    }

    /**
     * Establece la lista de residuos a trasladar.
     *
     * @param residuo La lista de residuos a trasladar.
     */
    public void setResiduo(List<Residuo> residuo) {
        this.residuo = residuo;
    }

    /**
     * Obtiene la lista de fletes asociados al traslado.
     *
     * @return La lista de fletes asociados al traslado.
     */
    public List<Flete> getFletes() {
        return fletes;
    }

    /**
     * Establece la lista de fletes asociados al traslado.
     *
     * @param fletes La lista de fletes asociados al traslado.
     */
    public void setFletes(List<Flete> fletes) {
        this.fletes = fletes;
    }

    /**
     * Obtiene la fecha solicitada para el traslado.
     *
     * @return La fecha solicitada para el traslado.
     */
    public Calendar getFechaSolicitada() {
        return fechaSolicitada;
    }

    /**
     * Establece la fecha solicitada para el traslado.
     *
     * @param fechaSolicitada La fecha solicitada para el traslado.
     */
    public void setFechaSolicitada(Calendar fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }

}
