
package logic;

import java.util.logging.Logger;

/**
 *
 * @author Alan Moreno
 */
public class Transicion {

    private Estado origen;
    private Estado destino;
    private String caracterDeEntrada;

    public Transicion(Estado origen, Estado destino, String caracterDeEntrada) {
        this.origen = origen;
        this.destino = destino;
        this.caracterDeEntrada = caracterDeEntrada;
    }
    
    public Transicion() {
    }


    public Estado getOrigen() {
        return origen;
    }

    public void setOrigen(Estado origen) {
        this.origen = origen;
    }

    public Estado getDestino() {
        return destino;
    }

    public void setDestino(Estado destino) {
        this.destino = destino;
    }

    public String getCaracterDeEntrada() {
        return caracterDeEntrada;
    }

    public void setCaracterDeEntrada(String caracterDeEntrada) {
        this.caracterDeEntrada = caracterDeEntrada;
    }
    
    public Estado getDestination() {
        return destino;
    }
    
    public Estado getTransition() {
        return this.destino;
    }

}
