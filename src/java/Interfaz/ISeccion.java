/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.seccion;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface ISeccion {
    public abstract ArrayList<seccion> listSeccion();
    public abstract boolean insertarSeccion(seccion sec);
    public abstract boolean actualizarSeccion(seccion sec);
    public abstract boolean eliminarSeccion(int idSeccion);

}
