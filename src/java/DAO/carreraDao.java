
package DAO;

import Interfaz.ICarrera;
import Modelo.carrera;
import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class carreraDao implements ICarrera{
    
     public ArrayList<carrera> listCarrera() {
        ArrayList <carrera>listar = new ArrayList();
        Conexion con = new Conexion();
        Connection cn = con.getConnection();
        
        String listarCarrera = "{CALL sp_listarcarrera}";
       
        if(cn!=null);
        try {
            CallableStatement cb = con.getConnection().prepareCall(listarCarrera);
            
            ResultSet rs = cb.executeQuery();
            while (rs.next()){
                carrera rn = new carrera ();
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
    public boolean insertarCarrera(carrera carre) {
        boolean insert = false;
       
       return insert;
    }

    @Override
    public boolean actualizarCarrera(carrera carre) {
         boolean update = false;
       
       return update;
    }

    @Override
    public boolean eliminarCarrera(int idCarrera) {
        boolean delete = false;
       
       return delete;
    }
}
