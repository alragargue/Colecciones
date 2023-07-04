/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidad.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alcid
 */
public class LibrosServices {

    Scanner leer = new Scanner(System.in);
      ArrayList<Libro> ListaLibros = new ArrayList();

    public ArrayList<Libro> crearLibros() {
        Libro L1 = new Libro();
        Libro L2 = new Libro();
        Libro L3 = new Libro();

        L1.setAutor("Pablo Neruda");
        L1.setTitulo("Veinte poemas de amor y una canción desesperada");

        L2.setAutor("Gabriel Garcia Marquez");
        L2.setTitulo("Cien años de soledad");

        L3.setAutor("Ernesto Sabato");
        L3.setTitulo("El Tunel");
       
       ListaLibros.add(L1);
       ListaLibros.add(L2);
       ListaLibros.add(L3);
       
        
        return ListaLibros;

    }
    
  
}
