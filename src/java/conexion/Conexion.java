/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class Conexion {
      public Connection getConnection(){
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulavirtualdb","root","");
        }catch ( SQLException e){
            System.out.println("excepcion");
        }catch (Exception e){
                System.out.println("driver");
       }
        return cn;
    }
    
}