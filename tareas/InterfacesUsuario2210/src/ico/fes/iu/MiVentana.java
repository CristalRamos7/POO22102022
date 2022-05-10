/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Cristal Ramos
 */
public class MiVentana extends Frame implements MouseListener {
    private Button boton1;
    private FlowLayout Layout;
    private TextField cuadroTexto;
    private Label etiqueta;
   

    public MiVentana() throws HeadlessException {
        setTitle("Mi ventana");
        setSize(300,200);
        
        Layout=new FlowLayout();
        setLayout(Layout);
        
        boton1 = new Button("Saludar");
        
        cuadroTexto=new TextField(15);
        
        this.boton1.addMouseListener(this);
        etiqueta=new Label("Valor inicial");
        
        this.add(cuadroTexto);
        this.add(etiqueta);
        this.add(boton1);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clic");
          }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("presionado");
          }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("liberado");
         }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entro");
         }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("salio");
         }
    
    
    
}
