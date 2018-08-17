
package Video18PasswordKev;

import java.util.*;
import javax.swing.JOptionPane;

public class Password {
    
    public void procedimiento(){
        
        String clave = "admin";
        
        String pass = "";
        
        while(clave.equals(pass)==false)
        {
            
        pass = JOptionPane.showInputDialog("Introduce la contraseña: ");
            
        if(clave.equals(pass)==false){
            
           JOptionPane.showMessageDialog(null,"CONTRASEÑA INCORRECTA"); 
            
        }
        
        }
        
       JOptionPane.showMessageDialog(null,"Acceso al sistema");
       
    }
    
    
}
