/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csl
 */

//package javaapplication1;
import java.sql.*;
import javax.swing.JOptionPane;


public class connection {
    Connection con=null;
    public static Connection javaConnect()
            {
                
                try
                {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mall","root","");
                    //JOptionPane.showMessageDialog(null, "it is connected");
                    
               return con;
                }
                catch(Exception e)
                {
                     JOptionPane.showMessageDialog(null, "it is not connected");
                     return null;
                }
            }
}

//public class connection {
    
//}
