
package DAO;

import Interfaz.IPersona;
import Modelo.persona;
import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class personaDao implements IPersona{
     public ArrayList<persona> listPersona() {
        ArrayList <persona>listar = new ArrayList();
        Conexion con = new Conexion();
        Connection cn = con.getConnection();
        
        String listarPersonas = "{CALL sp_listarpersona}";
       
        if(cn!=null);
        try {
            CallableStatement cb = con.getConnection().prepareCall(listarPersonas);
            
            ResultSet rs = cb.executeQuery();
            while (rs.next()){
                persona rn = new persona ();
                rn.setIdPersona(rs.getInt("idPersona"));
                rn.setName(rs.getString("name"));
                rn.setLastname(rs.getString("lastname"));
                rn.setDni(rs.getString("dni"));
                rn.setAge(rs.getInt("age"));
                rn.setNumberPhone(rs.getString("numberPhone"));
                rn.setEmail(rs.getString("email"));
                rn.setGender(rs.getString("gender"));
                rn.setAddress(rs.getString("address"));
            //    rn.setIdUsuario(1);
                
                listar.add(rn);
                
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
    public boolean insertarPersona(persona person) {
    boolean insert = false;
       int res;
       Conexion conn = new Conexion();
       Connection cn = conn.getConnection();
       
       if (cn!=null){
           try {
              CallableStatement cs = cn.prepareCall("CALL sp_insertarpersona(?,?,?,?,?,?,?,?,?)");
                  cs.setInt(1, person.getIdPersona());
                  cs.setString(2, person.getName());
                  cs.setString(3, person.getLastname());
                  cs.setString(4, String.valueOf(person.getDni()));
                 cs.setInt(5, person.getAge());
                 cs.setString(6, person.getNumberPhone());
                 cs.setString(7, person.getEmail());
                 cs.setString(8, person.getGender());
                 cs.setString(9, person.getAddress());
               //  cs.setInt(10, person.getIdUsuario());
                 res = cs.executeUpdate();
                 if (res==1){
                     insert = true;
                 }
                  
           } catch (Exception e) {
               //Agregar codigo deseado
               System.out.println("error"+e);
               
           }finally {
               try {
                   cn.close();
               } catch (SQLException e) {
                  //Agregar codigo deseado
                   System.out.println("error"+e);
               }
           }
        
       }
       return insert;
    }


    @Override
    public boolean actualizarPersona(persona person) {
  boolean update = false;
        int res;
       Conexion conn = new Conexion();
       Connection cn = conn.getConnection();
       
       if (cn!=null){
            try {
                CallableStatement cs = cn.prepareCall("CALL sp_actualizarpersona(?,?,?,?,?,?,?,?,?)");
                  cs.setInt(1, person.getIdPersona());
                  cs.setString(2, person.getName());
                  cs.setString(3, person.getLastname());
                  cs.setString(4, String.valueOf(person.getDni()));
                 cs.setInt(5, person.getAge());
                 cs.setString(6, person.getNumberPhone());
                 cs.setString(7, person.getEmail());
                 cs.setString(8, person.getGender());
                 cs.setString(9, person.getAddress());
             //    cs.setInt(10, person.getIdUsuario());
                 res = cs.executeUpdate();
                 if (res==1){
                     
                     update = true;
                 }
                  
           } catch (Exception e) {
               //Agregar codigo deseado
               System.out.println("error"+e);
               
           }finally {
               try {
                   cn.close();
               } catch (SQLException e) {
                  //Agregar codigo deseado
                   System.out.println("error"+e);
               }
           }
        
       }
       return update;
    }

    @Override
    public boolean eliminarPersona(int idPersona) {
        
    boolean delete = false;
         int res;
       Conexion conn = new Conexion();
       Connection cn = conn.getConnection();
       
        if (cn!=null){
            try {
             CallableStatement cs = cn.prepareCall("CALL sp_eliminarpersona(?)");    
                  cs.setInt(1,idPersona);
               res =cs.executeUpdate();
               if (res==1){
                      delete = true;
               }
            } catch (Exception e) {
                System.out.println("eliminar"+e);
            }finally {
               try {
                   cn.close();
               } catch (SQLException e) {
                  //Agregar codigo deseado
                   System.out.println("error"+e);
               }
            }
        }
         
       return delete;
    } 
}
  