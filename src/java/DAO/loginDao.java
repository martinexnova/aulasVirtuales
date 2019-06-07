/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Usuario;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class loginDao {
       private Connection conn;

    public loginDao(){
    }

    public loginDao(Connection conn) {
        this.conn = conn;
    }

    public Usuario login(String userParam, String passParam) {
        try {
             Conexion con = new Conexion();
        Connection cn = con.getConnection();
            String sql="SELECT idUsuario,USER,PASSWORD,state,idPerfil FROM usuario WHERE USER=? AND PASSWORD=?  AND state=?";
            PreparedStatement preparedStatement=cn.prepareStatement(sql);
            preparedStatement.setString(1,userParam);
            preparedStatement.setString(2, passParam);
            preparedStatement.setString(3, "a");
            ResultSet rs = preparedStatement.executeQuery();
            Usuario usuario = new Usuario(0);
            while(rs.next()){
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setUser(rs.getString("user"));
                usuario.setPassword(rs.getString("password"));
                usuario.setIdPerfil(rs.getInt("idPerfil"));
                
            }
            return usuario;
        } catch (SQLException e) {
            System.out.println("Error en el Dao.logien " +e.getMessage());
        }
           return null;
 
    }

  

}
