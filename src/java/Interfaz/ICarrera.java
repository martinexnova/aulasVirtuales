/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Modelo.carrera;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface ICarrera {
         public abstract ArrayList<carrera> listCarrera();
    public abstract boolean insertarCarrera (carrera carre);
    public abstract boolean actualizarCarrera(carrera carre);
    public abstract boolean eliminarCarrera ( int idCarrera);
}
