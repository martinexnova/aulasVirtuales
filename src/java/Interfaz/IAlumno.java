/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.alumno;
import Modelo.persona;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface IAlumno {
     public abstract ArrayList<persona> listAlumno(int idUsuario);
    public abstract boolean insertarAlumno (alumno alum);
    public abstract boolean actualizarAlumno (alumno alum);
    public abstract boolean eliminarAlumno ( int idAlumno);
}
