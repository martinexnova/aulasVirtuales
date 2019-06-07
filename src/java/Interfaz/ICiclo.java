/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Modelo.ciclo;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface ICiclo {
      public abstract ArrayList<ciclo> listCiclo();
    public abstract boolean insertarCiclo (ciclo cic);
    public abstract boolean actualizarCiclo(ciclo cic);
    public abstract boolean eliminarCiclo( int idCiclo);
}
