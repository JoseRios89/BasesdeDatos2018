
package sistema.modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class control {
    
    

    public  void conexion(){  
        
        
        
      
                try {      
            Connection conexion = null;
            PreparedStatement stmt = null;
            String connectionUrl = "jdbc:sqlserver://;database=sistema_tiquetes;integratedSecurity=true;";
            conexion = DriverManager.getConnection(connectionUrl);
            JOptionPane.showMessageDialog(null,"Conectado.");          

            if (conexion != null) {
              stmt.close();
              conexion.close();
              JOptionPane.showMessageDialog(null,"Desconectado");
            }           
          } 
          catch (SQLException ex) 
          {
            JOptionPane.showMessageDialog(null,"Error.");
          }
}

    
}
