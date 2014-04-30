

package logic;

import java.util.List;

/**
 *
 * @author Alan Moreno
 */
public class Automata {
    
    //un automata tiene: un alfabeto, un conjunto de estados, un conjunto de transiciones,  un estado inicial, y un conjunto de estados finales
    private String [] sigma;
    private List Estado;
    private List Transicion;
    private Estado estadoInicial;
    private List estadosFinales;
    
    public Automata(){}
    public Automata(String[]sigma,List estados, List transiciones, Estado init, List finales){
        this.sigma = sigma;
        this.Estado = estados;
        this.Transicion = transiciones;
        this.estadoInicial = init;
        this.estadosFinales = finales;
    }

    public String[] getSigma() {
        return sigma;
    }

    public List getEstado() {
        return Estado;
    }

    public List getTransicion() {
        return Transicion;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public List getEstadosFinales() {
        return estadosFinales;
    }
    
    
    
}
