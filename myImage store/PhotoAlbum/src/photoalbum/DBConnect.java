/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photoalbum;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*; 

/**
 *
 * @author Ruwan
 */
class DBConnect {
    
    public static  Connection connect()
    {
        Connection con=null;
        String url = "jdbc:mysql://localhost:3306/photoalbum";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
           // JOptionPane.showConfirmDialog(null,"connect to data base");
            
        } catch (Exception e) {
            System.out.println("inter.DBConnect.connect()");
            JOptionPane.showConfirmDialog(null,e);
        }
       return con;
    }
    
    
}
