/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Interfaz.ICiclo;
import Modelo.ciclo;
import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class cicloDao implements ICiclo{
     public ArrayList<ciclo> listCiclo() {
        ArrayList <ciclo>listar = new ArrayList();
        Conexion con = new Conexion();
        Connection cn = con.getConnection();
        
        String listarciclo = "{CALL sp_listarciclo}";
       
        if(cn!=null);
        try {
            CallableStatement cb = con.getConnection().prepareCall(listarciclo);
            
            ResultSet rs = cb.executeQuery();
            while (rs.next()){
                ciclo bn = new ciclo ();
                bn.setDescripción(rs.getString("description"));
                bn.setState("state".charAt(1));
                
                listar.add(bn);
                
            }   
            
        } catch (Exception e) {
            System.out.println("");
        }finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return null;

    }

    @Override
    public boolean insertarCiclo(ciclo cic) {
       boolean insert = false;
       
       return insert;
    }

    @Override
    public boolean actualizarCiclo(ciclo cic) {
         boolean update = false;
       
       return update;
    }

    @Override
    public boolean eliminarCiclo(int idCiclo) {
         boolean delete = false;
       
       return delete;
    }
}
