/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.persona;
import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  alumnoDao alum=new alumnoDao();
        ArrayList<persona> listar=new ArrayList<>();
        listar=alum.listAlumno(1);
        for (int i = 0; i < listar.size(); i++) {
            System.out.println("dato"+listar.get(i).getName());
        }*/
      
      loginDao login=new loginDao();
      login.login("keielr", "12345678");
    }
    
}
