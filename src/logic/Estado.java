

package logic;

import java.util.List;

/**
 *
 * @author Alan Moreno
 */
public class Estado {
    
    private String tag;
    private Enum type;
    List transiciones;
    
    public Estado(){}
    public Estado(String tag, Enum type){
        this.tag = tag;
        this.type = type;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    
    
}
