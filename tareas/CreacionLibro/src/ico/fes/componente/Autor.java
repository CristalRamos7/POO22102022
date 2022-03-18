/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componente;

/**
 *
 * @author blanc
 */
public class Autor {
    String nombre;
    int anho; //anho de publicacion 

    public Autor(String nombre, int anho) {
        this.nombre = nombre;
        this.anho = anho;
    }

    public Autor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", anho=" + anho + '}';
    }

}
