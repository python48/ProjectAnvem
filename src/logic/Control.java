
package logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Alan Moreno
 */
public class Control {
    
    Automata maquinaDeEstados;

    public Control(Automata maquinaDeEstados) {
        this.maquinaDeEstados = maquinaDeEstados;
    }

    public Control() {
        generarAutomata();
    }
    
    
    
    //precios que manejara la maquina dispensadora 3.5.6.7.10
    
    public String mainMenu(int option) 
    {
        String message = "Menú principal";
        switch(option)
        {
            case 0:// ingresar un peso
                maquinaDeEstados.trascender(maquinaDeEstados.getEstadoActual(), "1");
                break;
                
            case 1:// ingresar dos pesos
                
                break;
                
            case 2:// ingresar cinco pesos
                break;
                
            case 3:// ingresar 10 pesos
                break;
                
            case 4://print maquina de estados
                maquinaDeEstados.print();
                break;
                
            case 5://salir del programa
                System.exit(0);
                break;
                
            default:
                break;
        }
        return message;
    }
    
    private void generarAutomata()
    {
        //String s = JOptionPane.showInputDialog(null,"ingresa las terminaciones aceptadas por la máquina. ej 1,2,5,10");
        //String[]alfabeto = s.split(",");
        String[]alfabeto = {"1","2","5","10"};
        ArrayList estados = new ArrayList();
        ArrayList nuevosEstados = new ArrayList();
        
        //generar estado inicial con sus transiciones
        Estado estadoInicial = new Estado(0,0);
        estadoInicial = generarTransiciones(alfabeto, estadoInicial);
        nuevosEstados.add(estadoInicial);
        
        //generar estados: esta maquina tiene 19 ya que es el valor maximo que se le puede poner  ej. teniendo 9 pesos el ususario pone una moneda de 10.
        //aqui se generan los primeros 10 estados que tienen la peculiaridad de que siguen aceptando monedas, despues de 10 ya no se aceptan mas monedas.
        for (int i=1;i<10;i++) {
            Estado nuevo = null;
            if (i<3) {
                nuevo = new Estado(i,1);
            }else{
                nuevo = new Estado(i,2);
            }
            estados.add(nuevo);
        }

        //generamos las transiciones para los estados menos el inicial ya que este ya tiene sus transiciones
        for (Iterator it = estados.iterator(); it.hasNext();) {
            Estado eActual = (Estado) it.next();
            eActual = generarTransiciones(alfabeto,eActual);
            nuevosEstados.add(eActual);
        }

        //generamos los estados que ya no aceptan mas monedas. {10,...,19}
        for (int i=10;i<20;i++) {
            Estado origen = new Estado(i,2);
            Estado destino = origen;
            Estado nuevo = null;
            nuevo = new Estado(i,2);
            for(String str:alfabeto)
            {
                Transicion t = new Transicion(origen,destino,str);
               nuevo.agregarTransicion(t);                
            }
            nuevosEstados.add(nuevo);
        }        
        
        //obtenemos el conjunto de estados finales.
        ArrayList finales = new ArrayList();
        for (Iterator it = nuevosEstados.iterator(); it.hasNext();) {
            Estado est = (Estado)it.next();
            if (est.getType()==2) {
                finales.add(est);
            }
        }
        
        //hacer el automata con los datos que sacamos anteriormente
        Automata miAutomata = new Automata(alfabeto,nuevosEstados,(Estado)nuevosEstados.get(0),finales);
        this.maquinaDeEstados=miAutomata;
    }
    
    private Estado generarTransiciones(String[]alfabeto,Estado estadoActual)
    {
        Estado origen = estadoActual;
        Estado destino = new Estado();
        
        int i = 0;
        for (String letra : alfabeto) {
            
            // verificar si la suma del estado actual y la moneda que entro ajustan el precio minimo que es 3. jello
            if(origen.getTag()+Integer.parseInt(letra)>3)//&&origen.getTag()+Integer.parseInt(letra)<14
                destino = new Estado(origen.getTag()+Integer.parseInt(letra),1);
            else if(origen.getTag()+Integer.parseInt(letra)<=15)
                destino = new Estado(origen.getTag()+Integer.parseInt(letra),2);
            else//no se acepta mas de 15 en la maquina dispensadora
                destino = new Estado(15,2);
            
            Transicion nuevaTransicion = new Transicion(origen,destino,letra);
            estadoActual.agregarTransicion(nuevaTransicion);
        }
        return estadoActual;
    }
    
}
