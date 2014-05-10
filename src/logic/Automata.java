

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
    private String [] sigma;
    private ArrayList Estados;
    private ArrayList Transicion;
    private Estado estadoInicial;
    private List estadosFinales;
    
    //estado en el que se encuentra la maquina de estados
    private Estado estadoActual;

    public Estado getEstadoActual() {
        return estadoActual;
    }
    
    public Automata(){}

    public Automata(String[]sigma,ArrayList estados, ArrayList transiciones, Estado init, List finales){
        this.sigma = sigma;
        this.Estados = estados;
        this.Transicion = transiciones;
        this.estadoInicial = init;
        this.estadosFinales = finales;
        this.estadoActual = estadoInicial;
    }

    public Automata(String[]sigma,ArrayList estados, Estado init, List finales){
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
        return Transicion;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public List getEstadosFinales() {
        return estadosFinales;
    }
    
    public void print()
    {
        for (Iterator it = Estados.iterator(); it.hasNext();) {
            Estado curr = (Estado)it.next();
            curr.printTransitions();
        }
    }
    
    /**
     * 
     * origen y caracter de entrada
     * ///*/
    public void trascender(Estado origen, String input)
    {
        Estado nuevo = origen.transition(origen, input);
        this.estadoActual = nuevo;
    }
    
    
}
