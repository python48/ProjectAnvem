package logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Alan Moreno
 */
public final class Control {

    private static int[] alfabeto = {1, 2, 5, 10};
    private static Automata maquinaDeEstados;

    public static Automata getMaquinaDeEstados() {
        return maquinaDeEstados;
    }

    /**
     * *
     * Constructor of class the automaton is taken along with the alphabet
     *
     */
    public Control(int[] alfabeto, Automata maquinaDeEstados) {
        Control.alfabeto = alfabeto;
        Control.maquinaDeEstados = maquinaDeEstados;
    }

    /**
     * *
     * Constructor of class the automaton is generated within the constructor
     *
     */
    public Control() {
        construirAutomata();
    }

    //precios que manejara la maquina dispensadora 3 5 5 7 8 10
    public String mainMenu(int option) {
        String message = "Menú principal";
        switch (option) {
            case 0:// ingresar un peso
                maquinaDeEstados.trascender(maquinaDeEstados.getEstadoActual(), "1");
                //System.out.println("Estamos en el estado: " + maquinaDeEstados.getEstadoActual().getTag());
                message = "Crédito: " + maquinaDeEstados.getEstadoActual().getTag();
                break;

            case 1:// ingresar dos pesos
                maquinaDeEstados.trascender(maquinaDeEstados.getEstadoActual(), "2");
                //System.out.println("Estamos en el estado: " + maquinaDeEstados.getEstadoActual().getTag());
                message = "Crédito: " + maquinaDeEstados.getEstadoActual().getTag();
                break;

            case 2:// ingresar cinco pesos
                maquinaDeEstados.trascender(maquinaDeEstados.getEstadoActual(), "5");
//                System.out.println("Estamos en el estado: " + maquinaDeEstados.getEstadoActual().getTag());
                message = "Crédito: " + maquinaDeEstados.getEstadoActual().getTag();
                break;

            case 3:// ingresar 10 pesos
                maquinaDeEstados.trascender(maquinaDeEstados.getEstadoActual(), "10");
                //System.out.println("Estamos en el estado: " + maquinaDeEstados.getEstadoActual().getTag());
                message = "Crédito: "+maquinaDeEstados.getEstadoActual().getTag();
                break;

            case 4://print maquina de estados
                maquinaDeEstados.print();//print automata to console
                break;

            case 5://salir del programa
                System.exit(0);
                break;

            default:
                break;
        }
        return message;
    }

    private void construirAutomata() {
        ArrayList<Estado> estados = construirEstados();
        ArrayList<Transicion> transiciones = construirTransiciones(estados);
        ArrayList<Estado> estadosFinales = obtenerEstadosFinales(estados);

        String[] s = {"1", "2", "5", "10"};
        Automata a = new Automata(s, estados, transiciones, estados.get(0), estadosFinales);

        Control.maquinaDeEstados = a;

    }

    /**/
    private ArrayList<Estado> construirEstados() {
        ArrayList<Estado> estados = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Estado nuevo = new Estado();
            nuevo.setTag(i);
            if (i == 0) {
                nuevo.setType(0);
            } else if (i < 3) {
                nuevo.setType(1);
            } else {
                nuevo.setType(2);
            }
            estados.add(nuevo);
        }
        return estados;
    }

    /**/
    private ArrayList<Transicion> construirTransiciones(ArrayList<Estado> estados) {

        ArrayList<Transicion> transiciones = new ArrayList<>();
        String s = null;
        for (int i = 0; i < 10; i++) {
            Stack<Integer> coins = new Stack();
            coins.add(10);
            coins.add(5);
            coins.add(2);
            coins.add(1);
            while (!coins.isEmpty()) {
                int j = coins.pop();
                int c = estados.get(i).getTag() + estados.get(j).getTag();
                Transicion t = new Transicion(estados.get(i), estados.get(c), Integer.toString(j));
                transiciones.add(t);
            }
        }

        for (int i = 10; i < 20; i++) {
            Stack<Integer> coins = new Stack();
            coins.add(10);
            coins.add(5);
            coins.add(2);
            coins.add(1);
            while (!coins.isEmpty()) {
                int j = coins.pop();
                int a = estados.get(i).getTag(), b = estados.get(j).getTag();
                Transicion t = new Transicion(estados.get(i), estados.get(j), Integer.toString(a));
                transiciones.add(t);
            }
        }

        return transiciones;
    }

    private ArrayList<Estado> obtenerEstadosFinales(ArrayList<Estado> estados) {
        ArrayList<Estado> finales = new ArrayList<>();
        for (Iterator<Estado> it = estados.iterator(); it.hasNext();) {
            Estado estado = it.next();
            if (estado.getType() == 2) {
                finales.add(estado);
            }
        }
        return finales;
    }

}
