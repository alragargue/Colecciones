/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioteoria;

import Entidad.Libro;
import Services.LibrosServices;
import java.util.ArrayList;

/**
 *
 * @author alcid
 */
public class EjercicioTeoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LibrosServices LS = new LibrosServices();
        ArrayList<Libro> ListaLibros = LS.crearLibros();
        
        for (Libro libro : ListaLibros) {
            System.out.println(libro.toString());
            
        }
    }
    
}
