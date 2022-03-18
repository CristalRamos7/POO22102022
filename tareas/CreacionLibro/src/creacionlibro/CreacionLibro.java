/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creacionlibro;

import ico.fes.componente.Autor;
import ico.fes.componente.Editorial;
import ico.fes.libro.Libro;

/**
 *
 * @author blanc
 */
public class CreacionLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Libro lib=new Libro();
        lib.setTitulo("Ella es Miranda");
        lib.setCreador(new Autor("Odalys Cristal Blanco Ramos", 2022));
        lib.setEditor(new Editorial("FES", " Paginas: 290"));
        
        System.out.println(lib);
        
        // TODO code application logic here
    }
    
}
