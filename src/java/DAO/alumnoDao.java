
package DAO;

import Interfaz.IAlumno;
import Modelo.alumno;
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
public class alumnoDao implements IAlumno{
    
        @Override
        public ArrayList<persona> listAlumno(int idAlumno) {
        ArrayList <persona>listar = new ArrayList();
        Conexion con = new Conexion();
        Connection cn = con.getConnection();
        
        String listarAlumnos = "{CALL sp_listarAlumnoss(?)}"; 
       
        if(cn!=null);
        try {
            CallableStatement cb = cn.prepareCall(listarAlumnos);
            cb.setInt(1, idAlumno);
            cb.executeQuery();
            
            ResultSet rs = cb.executeQuery();
            while (rs.next()){
                persona alumno= new persona ();
                alumno.setName(rs.getString("name"));
                alumno.setLastname(rs.getString("lastname"));
                alumno.setNumberPhone(rs.getString("numberPhone"));
                alumno.setEmail(rs.getString("email"));
                alumno.setCarrera(rs.getString("carrera"));
                alumno.setCiclo(rs.getString("ciclo"));
                alumno.setSeccion(rs.getString("seccion"));
                listar.add(alumno);
                
            }   
            
        } catch (Exception e) {
            System.out.println("");
        }finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return listar;
        }

   @Override
    public boolean insertarAlumno(alumno alum) {
       boolean insert = false;
       int res;
       Conexion conn = new Conexion();
       Connection cn = conn.getConnection();
       
       if (cn!=null){
           try {
              CallableStatement cs = cn.prepareCall("CALL sp_insertaralumnos(?,?,?,?,?)");
                  cs.setInt(1, alum.getIdAlumno());
                  cs.setInt(2, alum.getIdPersona());
                  cs.setString(3, alum.getCode());
                  cs.setString(4, String.valueOf(alum.getState()));
                  cs.setInt(5, alum.getIdSeccion());
                  
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
    public boolean actualizarAlumno(alumno alum) {
       boolean update = false;
       
       return update;
    }

    @Override
    public boolean eliminarAlumno(int idAlumno) {
       boolean delete = false;
      
       return delete;
    }

}
