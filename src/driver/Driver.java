
package driver;

import javax.swing.JOptionPane;
import logic.Control;
import ui.VendingGUI;

/**
 *
 * @author Alan Moreno
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new VendingGUI().setVisible(true);
        
        /*
        
        Control c =  new Control();
        while(true)
        {
            int option = Integer.parseInt(JOptionPane.showInputDialog("OPTION"));
            c.mainMenu(option);
        }
        
        */
        
        

    }
    
}
