package logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alan Moreno
 */
public class Automata {

    //un automata tiene: un alfabeto, un conjunto de estados, un conjunto de transiciones,  un estado inicial, y un conjunto de estados finales
    private String[] sigma;
    private ArrayList<Estado> Estados;
    private ArrayList<Transicion> Transiciones;
    private Estado estadoInicial;
    private ArrayList<Estado> estadosFinales;
    //estado en el que se encuentra la maquina de estados
    private Estado estadoActual;

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public Automata() {
    }

    public Automata(String[] sigma, ArrayList<Estado> estados, ArrayList<Transicion> transiciones, Estado init, ArrayList<Estado> finales) {
        this.sigma = sigma;
        this.Estados = estados;
        this.Transiciones = transiciones;
        this.estadoInicial = init;
        this.estadosFinales = finales;
        this.estadoActual = estadoInicial;
    }

    public Automata(String[] sigma, ArrayList<Estado> estados, Estado init, ArrayList<Estado> finales) {
        this.sigma = sigma;
        this.Estados = estados;
        this.estadoInicial = init;
        this.estadosFinales = finales;
        this.estadoActual = estadoInicial;
    }

    public String[] getSigma() {
        return sigma;
    }

    /**
     *
     * @return
     */
    public List getEstados() {
        return Estados;
    }

    public List getTransicion() {
        return Transiciones;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public List getEstadosFinales() {
        return estadosFinales;
    }

    public void print() {
        for (Iterator it = Estados.iterator(); it.hasNext();) {
            Estado curr = (Estado) it.next();
            curr.printTransitions();
        }
    }

    void trascender(Estado estadoActual, String string) {

        for (Transicion tr : Transiciones) {
            if (tr.getOrigen().equals(estadoActual)&&tr.getCaracterDeEntrada().equals(string)) {
                this.estadoActual = tr.getTransition();
            }
        }
    }

}
