
package DAO;
import Interfaz.ISeccion;
import Modelo.carrera;
import Modelo.seccion;
import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class seccionDao implements ISeccion{
    
     public ArrayList<seccion> listSeccion() {
        ArrayList <seccion>listar = new ArrayList();
        Conexion con = new Conexion();
        Connection cn = con.getConnection();
        
        String listarSecion = "{CALL sp_listarseccion}";
       
        if(cn!=null);
        try {
            CallableStatement cb = con.getConnection().prepareCall(listarSecion);
            
            ResultSet rs = cb.executeQuery();
            while (rs.next()){
                seccion rn = new seccion ();
                 rn.setDescripción(rs.getString("description"));
                rn.setState("state".charAt(1));
                           
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
    public boolean insertarSeccion(seccion sec) {
         boolean insert = false;
       
       return insert;
    }
    @Override
    public boolean actualizarSeccion(seccion sec) {
        boolean update = false;
       
       return update;
    }

    @Override
    public boolean eliminarSeccion(int idSeccion) {
        boolean delete = false;
       
       return delete;
    }
}
