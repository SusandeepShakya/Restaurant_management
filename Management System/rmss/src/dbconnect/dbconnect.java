/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Nipun Senarath
 */
public class dbconnect {
    
     public static Connection connect()
    {
        Connection sos = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sos = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Rmss","root","");
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return sos;
    }

    public static Connection Connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
