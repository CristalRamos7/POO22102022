/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libro;

import ico.fes.componente.Autor;
import ico.fes.componente.Editorial;

/**
 *
 * @author blanc
 */
public class Libro {
    String titulo;
    Autor creador;
    Editorial editor;

    public Libro() {
    }

    public Libro(String titulo, Autor creador, Editorial editor) {
        this.titulo = titulo;
        this.creador = creador;
        this.editor = editor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getCreador() {
        return creador;
    }

    public void setCreador(Autor creador) {
        this.creador = creador;
    }

    public Editorial getEditor() {
        return editor;
    }

    public void setEditor(Editorial editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", creador=" + creador + ", editor=" + editor + '}';
    }
    
}
