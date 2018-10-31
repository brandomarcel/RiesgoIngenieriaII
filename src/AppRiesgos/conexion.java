/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppRiesgos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BMARC-PC
 */
public class conexion {
   private Connection connect=null;
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Connection");
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/riesgos","root","");            
        } catch  (Exception ex) {
            JOptionPane.showMessageDialog(null,"Sistema fuera de linea");
        }
       
       return connect;
   }
}
