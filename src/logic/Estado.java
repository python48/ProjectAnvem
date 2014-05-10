

package logic;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Alan Moreno
 */
public class Estado {
    
    private int tag;
    private int type;
    ArrayList transiciones=new ArrayList();
    
    public Estado(){}
    public Estado(int tag, int type){
        this.tag = tag;
        this.type = type;
    }
    
    public void agregarTransicion(Transicion t){
        this.transiciones.add(t);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
    
    public void printTransitions()
    {
        System.out.println("Transiciones del estado "+this.getTag());
        for (Iterator it = this.transiciones.iterator(); it.hasNext();) {
            Transicion t = (Transicion) it.next();
            System.out.println(t.getDestino().getTag()+"=("+t.getOrigen().getTag()+","+t.getCaracterDeEntrada()+")");
        }System.out.println();
    }
    
	public Estado transition(Estado origin,String input){
		for (Iterator object = this.transiciones.iterator(); object.hasNext();) {
			Transicion transition = (Transicion) object.next();
			if (transition.getCaracterDeEntrada().equals(input)) {
				return transition.getTransition();
			}
		}
		return null;
	}
    
}
