/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Modelo.persona;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface IPersona {
    public abstract ArrayList<persona> listPersona();
    public abstract boolean insertarPersona(persona person);
    public abstract boolean actualizarPersona(persona person);
    public abstract boolean eliminarPersona( int idPersona);
}
